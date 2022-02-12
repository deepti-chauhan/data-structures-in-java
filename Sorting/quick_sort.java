public class QuickSort {
    
    public static int partition(int[] arr, int low, int high){ //partition will return us the correct index of pivot in each call.
        int pivot = arr[high];
        int i = low-1;
        
        for(int j=low; j<high; j++){
            if(arr[j] < pivot){
                i++;
                
                //swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        
        i++;
        //swap
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;
        
        return i;
    }
    
    public static void quickSort(int[] arr, int low, int high){
        if(low<high){
            int pivot = partition(arr, low, high);
        
            quickSort(arr, low, pivot-1);
            quickSort(arr, pivot+1, high);
                
        }
    }
    
    
    public static void main(String args[]) {
      int[] arr = {3,5,2,8,1,4};
      int n = arr.length;
      
      quickSort(arr, 0, n-1);
      
      for(int i=0; i<n; i++){
          System.out.print(arr[i] + " ");
      }
    }
}
