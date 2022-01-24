
// print factorial of number n using recursion.

class Recursion {
    public static void printFactorial(int n, int ans){
        if(n==0){
            System.out.print(ans);
            return;
        }
        ans*=n;
        printFactorial(n-1, ans);
    }
    
    public static void main(String[] args) {
        int n = 5, ans =1;
        printFactorial(n,ans);
    }
}
