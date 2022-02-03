public class singleLinkedList {
    Node head;
    class Node{
        String data;
        Node next;
        
        Node(String data){
            this.data = data;
            this.next = null;
        }
    }
    
    // addFirst 
    public void addFirst(String data){
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
    public void addLast(String data){
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
        newList.addFirst("this");
        newList.addLast("is");
        newList.addLast("a");
        newList.addLast("List");
        newList.printList();
        newList.deleteFirst();
        newList.printList();
        newList.addFirst("this");
        newList.printList();
        newList.deleteFirst();
        newList.deleteLast();
        newList.printList();
        
    }
}


// Output: 
// this->is->a->List->null
// is->a->List->null
// this->is->a->List->null
// is->a->null
