// circular queue using array.
public class QueueClass {
    
    static class queue{
        static int arr[];
        static int size;
        static int rear;
        static int front;
        
        queue(int n){
            this.size = n;
            this.arr = new int[n];
            rear = -1;
            front = -1;
        }
        
        
        public static boolean isEmpty(){
            return rear == -1 & front == -1;
        }
        
        public static boolean isFull(){
           return (rear+1)%size == front;

        }
        
        public static void add(int data){
            
            if(isFull()){
                System.out.println("queue is full");
                return;
            }
            
            //for ist element
            if(front == -1){
                front = 0;
            }
            
            rear = (rear + 1)%size;
            arr[rear] = data;
            

        }
        
        public static int remove(){
            if(isEmpty()){
                System.out.println("queue is empty");
                return -1;
            }
            int first = arr[front];
            
            if(rear == front){
                rear = front = -1;
            }
            else{
               front = (front+1)%size; 
            }
            return first;
        }
        
        public static int peek(){
            if(isEmpty()){
                System.out.println("queue is empty");
                return -1;
            }
            return arr[front];
        }
    } 
    
    public static void main(String[] args){
        queue q = new queue(5);
        q.remove();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        
        while(!q.isEmpty()){
            System.out.print("|"+q.remove());
        }
        

    }
}

//  OUTPUT: queue is empty
//          |1|2|3|4|5
