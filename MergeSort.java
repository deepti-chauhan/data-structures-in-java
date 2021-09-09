import java.util.Arrays;

public class MergeSort {

     void merge(int[] arr, int l, int r, int mid){
        int a1 = (mid +1)- l;
        int[] left_arr = new int[a1];

        int a2 = r - mid;
        int[] right_arr = new int[a2];

        for(int i=0; i<a1; i++){
            left_arr[i] = arr[l+i];
        }
        for (int j = 0; j< a2; j++) {
            right_arr[j] = arr[mid + 1 + j];
        }

        int i=0, j=0, k=l;

        while (i<a1 && j<a2){
            if(left_arr[i] < right_arr[j]){
                arr[k] = left_arr[i];
                i++;
            }
            else{
                arr[k] = right_arr[j];
                j++;
            }
            k++;
        }

        while (i<a1){
            arr[k] = left_arr[i];
            i++; k++;
        }
        while(j<a2){
            arr[k] = right_arr[j];
            j++; k++;
        }
    }
     void sort(int[] arr, int left, int right){
        if(left < right){
            int mid = (left + right)/2;
            sort(arr, left, mid );
            sort(arr, mid+1, right);
            merge( arr, left, right,mid);
        }
    }


    public static void main(String[] args){
        int[] arr = {5,2,3,8,6,9,1};
        int l = 0;
        int r = arr.length -1;
        System.out.println("Unsorted array : " + Arrays.toString(arr));
        MergeSort my_sort = new MergeSort();
        my_sort.sort(arr,l,r);
        System.out.println("sorted array : " + Arrays.toString(arr));
     }
}

