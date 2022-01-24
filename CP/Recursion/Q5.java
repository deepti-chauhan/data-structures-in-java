
// print fibbonaci series using recursion.

class Recursion {
    public static void printFibbonaci(int a1, int a2, int n){
        if(n==0){
            return;
        }
        int a3 = a1 + a2;
        System.out.println(a3);
        printFibbonaci(a2, a3, n-1);
    }
    
    public static void main(String[] args) {
        int a1 = 0, a2 =1;
        int n = 5;
        System.out.println(a1);
        System.out.println(a2);
        
        printFibbonaci(a1,a2,n);
    }
}
