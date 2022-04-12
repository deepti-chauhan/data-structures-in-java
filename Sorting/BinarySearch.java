public class BinarySearch { // it is for sorted array
    static int search(int[] arr, int key){
        int mid=0, l=0;
        int h = arr.length-1;
        while(l<=h){
            mid = l + ((h-l)/2);
            if(arr[mid] == key) {
                return mid+1;
            }

            else if (arr[mid] > key){
                h = mid-1;
            }
            else{
                l = mid +1;
            }
        }
        return mid;
    }

    public static void main(String[] args){
        int[] arr = {2,4,6,8,10,12,14}; //we are assuming a sorted array as input
        int key = 6;
        System.out.println(key + " is presenet at index : " + search(arr, key) + " (index staring from 1 )" );
    }
}
