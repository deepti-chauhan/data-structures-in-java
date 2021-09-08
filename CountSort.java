import java.util.Arrays;

public class CountSort {

    public static void countSort(int[]arr, int n){
        int k = arr[0];
        for(int i=0; i<n; i++){
            k = Math.max(k,arr[i]);
        }

        //initialize count array to store count of every individual element
        int[] count_array = new int[10];

        //initialize every element in array with zero
        Arrays.fill(count_array,0);

        //loop through to store count
        for(int i=0; i<n; i++){
            count_array[arr[i]]++;
        }

        //add the previous index value in the preceding index value.
        for(int i=1; i<=k; i++){
            count_array[i] += count_array[i-1];
        }

        //initialize the output array to sort result
        int[] output_array = new int[n];
        for(int i=n-1; i>=0; i--){
            output_array[--count_array[arr[i]]] = arr[i];
        }

        //copy element from output array to main array and print the sorted result
        System.arraycopy(output_array, 0, arr, 0, n);
        System.out.println("Sorted array : "+Arrays.toString(arr));
    }

    public static void main(String[] args){
        int[] arr = {1,3,2,3,4,1,6,4,3};
        System.out.println("Unsorted array : "+Arrays.toString(arr));
        countSort(arr, arr.length);

    }
}
