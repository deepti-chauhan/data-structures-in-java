//reverse stack using recursion.

// |3|   ->  |1|
// ---       ---
// |2|   ->  |2|
// ---       ---
// |1|   ->  |3|
// ---       ---

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
    
    // reverse function
    public static void reverseStack(Stack<Integer> stk){
        
        if(stk.isEmpty()){
            return;
        }
        
        
        int top = stk.pop();
        reverseStack(stk);
        pushAtBottom(top, stk);
    }
    
    
    public static void main(String args[]) {
      Stack<Integer> newStack = new Stack<>();
      
      newStack.push(1); 
      newStack.push(2);
      newStack.push(3); // 3 is at our top after reverse 3 will be at bottom of stack.
      
      reverseStack(newStack);
      
      // print stack
      while(!newStack.isEmpty()){
          System.out.println("|"+newStack.peek()+"|");
          System.out.println("---");
          newStack.pop();
      }
      
    }
}
