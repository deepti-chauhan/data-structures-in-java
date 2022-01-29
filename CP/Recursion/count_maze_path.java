public class Recursion {
    
    public static int countPath(int i, int j, int m, int n){
        
        //base case
        if(i== m-1 && j==n-1){
            return 1;
        }
        
        if(i==m || j==n){
            return 0;
        }
        
        //to move right
        int moveRigth = countPath(i, j+1, m,n);
        
        //to move down
        int moveDown = countPath(i+1, j, m,n);
        
        return moveRigth + moveDown;
    }
    
    public static void main(String args[]) {
      System.out.print(countPath(0,0,3,3));
    }
}
