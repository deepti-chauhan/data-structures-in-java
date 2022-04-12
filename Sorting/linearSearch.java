//linear search algorithm
public class linearSearch {
    static void search(int[] arr, int key){
        for (int j=0; j < arr.length; j++){
            if (arr[j] == key) {
                System.out.println("Key is present at index: " + j );
            }
        }
    }
    public static void main(String[] args){
        int[] arr = {1,4,5,3,7,2,3};
        int key = 3;
        System.out.println("Key to be search : "+key);
        search(arr, key);
    }
}
