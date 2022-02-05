// stack using linked list.
public class MyStack {
    
    //  node class
    static class Node{
        int data;
        Node next;
        
        // node constructor
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    
    // static stack class
    static class Stack{
        // static head -> important
        public static Node head;
        
        // function to check if stack is empty of not.
        public static boolean isEmpty(){
            if(head == null){
                return true;
            }
            return false;
        }
        
        // push operation
        public static void push(int data){
            Node newNode = new Node(data);
            
            if(isEmpty()){
                head = newNode;
                return;
            }
            
            newNode.next = head;
            head = newNode;
        }
        
        // pop operation
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
            
        }
        // peek operations
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return head.data;
        }      
    } 
    // main function
    public static void main(String args[]) {
      Stack mystack = new Stack();
      mystack.push(1);
      mystack.push(2);
      mystack.push(3);
      mystack.push(4);
      mystack.push(5);
      mystack.push(6);
      
      // print stack
      while(!mystack.isEmpty()){
          System.out.println("| "+mystack.peek()+" |");
          System.out.println("-----");
          mystack.pop();
      }
    }
}

// OUTPUT : 
// | 6 |
// -----
// | 5 |
// -----
// | 4 |
// -----
// | 3 |
// -----
// | 2 |
// -----
// | 1 |
// -----
