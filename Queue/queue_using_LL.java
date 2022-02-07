public class queueClass {
    
    
    static class Node{
        int data;
        Node next;
        
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    
    static class queue{
        static Node head = null;
        static Node tail = null;
        
        public static boolean isEmpty(){
            return tail == null & head == null; //return true
        } 
        
        
        public static void add(int data){
            Node newNode = new Node(data);
            
            if(tail == null){  //empty queue
                tail = head = newNode;
                return;
            }
            
            tail.next = newNode;
            tail = newNode;
        }
        
        public static int remove(){
            
            if(isEmpty()){  //empty queue
                return -1;
            }
            
            int front = head.data;
            
            if(head == tail){  //single element
                tail = null;
            }
            
            head = head.next;
            return front;
        }
        
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            
            return head.data;
        }
    }
    
    
    public static void main(String args[]) {
        queue q = new queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        
      
        //print queue.
        while(!q.isEmpty()){
            System.out.print("|"+q.remove());
        }
        
        
    }
}
