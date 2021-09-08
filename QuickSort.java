public class QuickSort {
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int partition(int[]arr, int l, int h){
        int pivot = arr[h];
        int i= l-1;
        for(int j=l; j<=h-1; j++){
            if(arr[j]< pivot){
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr, i+1, h);
        return(i+1);
    }

    public static void quickSort(int[]arr, int l, int h){
        if(l<h){
           int p = partition(arr,l,h);
           quickSort(arr,l, p-1);
           quickSort(arr, p +1,h);
        }
    }

    public static void printArray(int[] arr){
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }

    public static void main(String[] args){
        int[] arr = {30,10,20,60,40,50};
        int l=0; int h = arr.length;
        System.out.print("unsorted array : ");
        printArray(arr);
        quickSort(arr, l, h-1);
        System.out.print("\nsorted array : ");
        printArray(arr);
    }
}
