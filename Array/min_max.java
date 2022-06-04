/*
    TC - O(n)
    SC - O(1)
    
    using linear search.
*/

public class MinMax {
    static class Pair{
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
    }
    
    static Pair getMinMax(int[]arr, int n){
        Pair minmax = new Pair();
        if(n==1){
            minmax.min = arr[0];
            minmax.max = arr[0];
            
            return minmax;
        }
        
        for(int i=0; i<n; i++){
            if(arr[i] > minmax.max){
                minmax.max = arr[i];
            }
            else if(arr[i] < minmax.min){
                minmax.min = arr[i];
            }
        }
        
        return minmax;
    }
    
    public static void main(String args[]) {
        int arr[] = {1000, 11, 445, 1, 330, 3000};
        int arr_size = 6;
        Pair minmax = getMinMax(arr, arr_size);
        System.out.printf("\nMinimum element is %d", minmax.min);
        System.out.printf("\nMaximum element is %d", minmax.max);
    }
}
