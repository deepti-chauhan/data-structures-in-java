
// print number sum of ist n numbers using recursion.
class Recursion {
    public static void printNumber(int i, int n, int sum){
        if (n == i){
            sum += i;
            System.out.print(sum);
            return;
        }
        sum += n;
        printNumber(i, n-1, sum);
        
    }
    
    public static void main(String[] args) {
        int i = 1;
        int n = 5;
        int sum = 0;
        printNumber(i, n, sum);
    }
}
