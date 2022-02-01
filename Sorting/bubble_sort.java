/* Bubble sort is the most simple sorting technique.
   In this algorithm we will loop through the array and compare two elements and swap them according,
   either we want ascending or descending sorted array.
   It's time complexity at worst case is O(n^2).
   It's good to have basics of sorting but always try to approach technique with as min as posssible 
   Time Complexity.*/

public class BubbleSort {
    public static void main(String args[]){
      int[] arr = {7,8,3,1,2};
      
      for(int i=0; i<arr.length-1; i++){
          for(int j=0; j<arr.length-1-i; j++){
              if(arr[j] > arr[j+1]){
                  
                  //swap
                  int temp = arr[j];
                  arr[j] = arr[j+1];
                  arr[j+1] = temp;
              }
          }
      }
      
      //print sorted array
      for(int i=0; i<arr.length; i++){
          System.out.print(arr[i]+ " ");
      }
    }
}
