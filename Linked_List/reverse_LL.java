// reverse linked list 

//  input :  1->2->3->4->5->null
//  output : 5->4->3->2->1->null

public class singleLinkedList {
    Node head;
    class Node{
        int data;
        Node next;
        
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    
    // addFirst 
    public void addFirst(int data){
        Node newNode = new Node(data);
        
        if(head == null){
            head = newNode;
            return;
        }
        
        newNode.next = head;
        head = newNode;
        
    }
    
    // deleteFirst
    public void deleteFirst(){
        if(head == null){                       //  if the list has no element.                                    
            System.out.println("list is empty");
            return;
        }
        head = head.next;
    }
    
    // addLast
    public void addLast(int data){
        Node newNode = new Node(data);
        
        if(head == null){
            head = newNode;
            return;
        }
        
        Node currentNode = head;
        while(currentNode.next != null){
            currentNode = currentNode.next;
        }
        
        currentNode.next = newNode;
    }
    
    // deleteLast
    public void deleteLast(){
        if(head == null){                       //  if the list has no element.
            System.out.println("list is empty");
            return;
        }
        
        if(head.next == null){                  //  if the list has only 1 element.
            head = null;
            return;
        }
        
        Node currentNode = head;
        while(currentNode.next.next!= null){
            currentNode = currentNode.next;
        }
        currentNode.next = null;
    }
    
    
    public void iterativeReverse(){
        
        //base condition
        if(head==null || head.next==null){
            return;
        }
        Node prevNode = head;
        Node currNode = head.next;
        
        while(currNode != null){
            Node nextNode = currNode.next;
            currNode.next = prevNode;
            
            //update
            prevNode = currNode;
            currNode = nextNode;
        }
        
        head.next = null;
        head = prevNode;
    }
    
    //printLinkedList
    public void printList(){
        Node currentNode = head;
        while(currentNode != null){
            System.out.print(currentNode.data + "->");
            currentNode = currentNode.next;
        }
        System.out.println("null");
    }
    
    public static void main(String args[]) {
        singleLinkedList newList = new singleLinkedList();
        newList.addFirst(1);
        newList.addLast(2);
        newList.addLast(3);
        newList.addLast(4);
        newList.addLast(5);
        newList.printList();
        newList.iterativeReverse();
        newList.printList();
        
        
    }
}
