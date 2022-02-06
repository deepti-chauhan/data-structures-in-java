// queue using array.
/* queue is one of the important data structure also known as as FIFO : First in First out.
   in implementation of queue with array will take time :
   enqueue or add()     -> O(1)
   dequeue or remove()  -> O(n)
   peek()               -> O(1)
   
   but we can implement more optimal queue with O(1) time complexity that's why we do not prefer array for simple implementation of queue.
   also arrays are of fixed size. *limitation*
*/

public class QueueClass {
    
        static class queue{                  /*  A class can be made static only if it is a nested class. 
                                                 We cannot declare a top-level class with a static modifier 
                                                 but can declare nested classes as static.*/
          
        static int arr[];                   /*   static keyword in Java is used to share the same variable or method of a given class.*/
        static int size;
        static int rear;
        
        queue(int n){                       /*   parameterised construnctor  */
            this.size = n;
            this.arr = new int[n];
            rear = -1;
        }
        
        
        // to check if queue is empty or not using rear
        public static boolean isEmpty(){
            if(rear == -1){
                return true;
            }
            return false;
        }
        
        // to check if queue is full or not  
        public static boolean isFull(){
            if(rear == size-1){
                return true;
            }
            return false;
        }
        
        public static void add(int data){
                                            /*  if queue is full new data cannot be add because arrays have fixed length. */
            if(isFull()){
                System.out.println("queue is full");
                return;
            }                                            
            arr[++rear] = data;            /*  if queue is not empty then increment rear by +1 then add data on rear index. */

        }
        
        public static int remove(){
            // if queue is empty no data can be removed.
            if(isEmpty()){
                System.out.println("queue is empty");
                return -1;
            }
            int front = arr[0];           // otherwise we can simply initialise our first element, 
            for(int i=0; i<rear; i++){    // return it and shift all element towards right and decrement rear by -1.
                arr[i] = arr[i+1];
            }
            
            rear--;
            return front;
        }

        public static int peek(){         // return 0th index element as it is our first data of queue as peek.
            if(isEmpty()){
                System.out.println("queue is empty");
                return -1;
            }
            
            return arr[0];
        }
    } 
    
    public static void main(String[] args){
        queue q = new queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        
        System.out.println(q.remove());
        System.out.println(q.peek());
        
        q.add(6);
        q.add(7);
        
        // print queue using remove() operation.
        while(!q.isEmpty()){
            System.out.println(q.remove());
        }

    }
}
