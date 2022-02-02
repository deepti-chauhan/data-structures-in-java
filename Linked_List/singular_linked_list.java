public class singleLinkedList {
    Node head;
    class Node{
        String data;
        Node next;
        
        //constructor
        Node(String data){
            this.data = data;
            this.next = null;
        }
    }
    
    
    // add to ist position
    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        
        newNode.next = head;
        head = newNode;
    }
    
    // add to last position
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
    
    public void print(){
        Node currentNode = head;
        while(currentNode != null){
            System.out.print(currentNode.data + "->");
            currentNode = currentNode.next;
        }
        System.out.print("null");
    }
 
    public static void main(String args[]) {
      singleLinkedList LL = new singleLinkedList();
      LL.addFirst("is");
      LL.addFirst("This");
      LL.addLast("a");
      LL.addLast("Linked List");
      LL.print();
    }
}
