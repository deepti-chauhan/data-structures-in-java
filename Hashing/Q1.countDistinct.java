/* count distinct element in an array using HashSet */
/* input : a = {5,3,2,1,5,3,7,0}
   Hashset a = [5,3,2,1,7,0] 
   ouptut  = 6 */

import java.util.*;
public class MyClass {
    static int countDist(int[] a){
        Set<Integer> s = new HashSet<>();
        for (int ele : a){s.add(ele);}
        return s.size();
    }
    
    public static void main(String args[]) {
        int[] a = {5,3,2,1,5,3,7,0};
        System.out.print("no. of distinct elements in the array : "+countDist(a));
    
    }
}
