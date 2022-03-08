
/* return the sub array whose sum is equal to the given sum
  input : a = [10,15,-5,15,-10,5]
  output : [15,-10]  return indices -> (3,4)
*/
import java.util.*;
public class MyClass {
    
    static void subArray(int[] a, int sum){
        int currSum = 0;
        int start = 0;
        int end = -1;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i=0; i<a.length; i++){
            currSum += a[i];
          
            if(currSum - sum == 0){
                start = 0; end = i;
                break;
            }
            
            if(map.containsKey(currSum - sum)){
                start = map.get(currSum - sum) + 1;
                end = i;
                break;
            }
            
            map.put(currSum, i);
        }
        
        if(end == -1){
                System.out.print("not found");
            }
        else{
            System.out.print(start + " " + end);
        }
    }
    
    
    public static void main(String args[]) {
        int[] a = {10,15,-5,15,-10,5};
        int sum = 5;
        subArray(a,sum);
    
    }
}
