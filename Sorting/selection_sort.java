// time complexity at worst case : O(n^2).

public class SelelctionSort {
    public static void main(String args[]){
      int[] arr = {7,8,3,1,2};
      
      //outer loop
      for(int i=0; i<arr.length-1; i++){
          int small = i; // small = 0
          
          //inner loop
          for(int j=i+1; j<arr.length; j++){
              
              //main condition
              if(arr[small] > arr[j] ){  
                  small = j; 
              }
              //after ist iteration
              //small = 3;
              
          }
          //swap
          int temp = arr[small]; //arr[3] = 1
          arr[small] = arr[i];// arr[3] = arr[0]
          arr[i] = temp; //arr[0] = 1
          
      }
      
      //print sorted array
      for(int i=0; i<arr.length; i++){
          System.out.print(arr[i]+ " ");
      }
    }
}
