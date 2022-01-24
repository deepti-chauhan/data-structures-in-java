
// print number from 1 to 5 using recursion.
class Recursion {
    
    public static void printNumber(int n){
        if (n > 5){
            return ;
        }
        System.out.println(n);
        printNumber(n+1);
    }
    
    public static void main(String[] args) {
        int n = 1;
        printNumber(1);
    }
}
