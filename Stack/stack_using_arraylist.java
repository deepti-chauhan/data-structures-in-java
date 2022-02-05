// stack using ArrayList.
import java.util.*;
public class MyStack {
    //static
    static class Stack{
        static ArrayList<Integer> list = new ArrayList<>();
        
        // isEmpty function
        public static boolean isEmpty(){
            return(list.size() == 0);  //return true else false
        }
        
        //push function
        public static void push(int data){
            list.add(data);  //add method will add the element at the end index of list.
        }
        
        //pop function
        public static int pop(){
            
            if(isEmpty()){
                return -1;
            }
            
            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }
        
        //peek function
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return list.get(list.size()-1);
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
