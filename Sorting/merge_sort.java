public class MergeSort {
    
    public static void conquer(int[] arr, int si, int mid, int ei){
        int[] merged = new int[ei-si+1];  // initialise a new array to sort the sorted values into it.
        
        int idx_si = si;  //to traverse using starting index to middle index.
        int idx_mid = mid+1; //to traverse using middle index to end index.
        
        int x = 0; //for merged array.
        
        //conquer elements to make one sorted array.
        while(idx_si <= mid && idx_mid <= ei){
            if(arr[idx_si] <= arr[idx_mid]){
                merged[x++] = arr[idx_si++];
            }
            else{
                merged[x++] = arr[idx_mid++];
            }
        }
        
        //after traversing once if some elements still remain in the array 
        //we will traverse againg and simply add elemenst in the array.
        
        //only 1 while loop will run at a time.
        
        while(idx_si <= mid){
            merged[x++] = arr[idx_si++];
        }
        
        while(idx_mid <= ei){
            merged[x++] = arr[idx_mid++];
        }
        
        //copy all elements from merge array to original array
        
        for(int i=0, j=si; i<merged.length;){
            arr[j++] = merged[i++];
        }
        
    }
    
    public static void divide(int[] arr, int si, int ei){
        if(si>=ei){             // if at any point we are left with only 1 element or 0 element in our array we will simply return.
            return;
        }
        
        //otherwise divide recursively
        int mid = si + (ei-si)/2;   // we should prefer this formula to avoid space complexity issue in any case.
        
        //recursive calls
        divide(arr,  si,  mid);
        divide(arr,  mid+1,  ei);
        conquer( arr,  si,  mid,  ei);
        
        
    }
    
    public static void main(String args[]) {
      int[] arr = {6,3,1,5,2,4};
      int n = arr.length;
      
      divide(arr, 0,n-1);
      
       for(int i=0; i<n; i++){
           System.out.print(arr[i] + " ");
      }
    }
}
