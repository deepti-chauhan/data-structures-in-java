//Queue using 2 stacks.
/*  Stack : Queue
    push -> add     -> O(n)
    pop  -> remove  -> O(n)
    peek -> peek    -> O(1) 
*/

import java.util.*;
public class queueClass {
    
    
    static class queue{
        
        // initialise 2 stacks s1, s2
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();
        
        //to check if queue is empty.
        public static boolean isEmpty(){
            return s1.isEmpty();  //return true if s1 stack is empty and s1.isEmpty() function here belongs to stack.
        }
        
        // to add element at last in queue
        public static void add(int data){
            while(!s1.isEmpty()){
                s2.push(s1.pop()); 
            }
            s1.push(data);
            
            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }
        
        // to remove element at first in queue
        public static int remove(){
            if(s1.isEmpty()){
                return -1;
            }
            return s1.pop();
        }
        
        public static int peek(){
            if(s1.isEmpty()){
                return -1;
            }
            return s1.peek();
        }
    }
    
    
    public static void main(String args[]) {
        queue q = new queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);  // 1 2 3 4
        
        q.remove();  // 2 3 4
        
        //print queue
        while(!q.isEmpty()){
            System.out.print("|"+q.peek());
            q.remove();
        }
        
        
    }
}
