public class InsertionSort {
     public static void sort(int[] arr){
        int n = arr.length; //length of given array
        for (int i=1; i<n; i++) {
            int key = arr[i]; //initialize the 2nd element as key element w.r.t which we will start comparing.
            int j = i - 1; //i.e j = 0

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }

     }

    public static void main(String[] args){
        int[] arr = {6,2,4,9,3,7};
        System.out.println("unsorted : ");
        for( int i: arr){
            System.out.print(i+" ");
        }
        sort(arr);
        System.out.println("\nsorted : ");
        for( int i: arr){
            System.out.print(i+" ");
        }
    }
}
