
/*  diagonal matrix : elements where i == j are diagonal elemnts and rest of the elments are 0.
    
    [ 3  0  0  0  0
      0  3  0  0  0
      0  0  3  0  0
      0  0  0  3  0
      0  0  0  0  3 ]
*/


public class DiagonalMatrix {
    
    static void setElement(int[] a, int i, int j, int x){
        if(i == j){
            a[i-1] = x;
        }
    }
    
    static int getElement(int[] a, int i, int j){
        if(i == j){
            return a[i-1];
        }
        return 0;
    }
    public static void main(String args[]) {
      int[] matrix = new int[5];
      setElement(matrix, 1,1, 3);
      setElement(matrix, 2,3, 3);
      setElement(matrix, 3,3, 3);
      setElement(matrix, 4,4, 3);
      setElement(matrix, 5,5, 3);
        
      System.out.println(getElement(matrix , 2,3));     // this will output 0 becoz i != j
      
      for(int idx = 0; idx<matrix.length; idx++){
          System.out.print(matrix[idx] + " ");          // output : 3 0 3 3 3
      }
      
      
    }
}


