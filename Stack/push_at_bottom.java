// push at the bottom of stack
// |3|
// ---
// |2|
// ---
// |1|
// ---
// |4|  <- 4 is pushed at the bottom.
// ---

import java.util.*; // import our inbuilt stack data structure.
public class StackClass {
    // push at bottom function
    public static void pushAtBottom(int data, Stack<Integer> stk){
        
        if(stk.isEmpty()){
            stk.push(data);
            return;
        }
        
        int top = stk.pop(); //return & remove  the top element
        pushAtBottom(data, stk); //call the recursion
        stk.push(top);
    } 
    
    
    public static void main(String args[]) {
      Stack<Integer> newStack = new Stack<>();
      
      newStack.push(1);
      newStack.push(2);
      newStack.push(3);
      pushAtBottom(4, newStack );
      
      // print stack
      while(!newStack.isEmpty()){
          System.out.println("|"+newStack.peek()+"|");
          System.out.println("---");
          newStack.pop();
      }
      
    }
}
