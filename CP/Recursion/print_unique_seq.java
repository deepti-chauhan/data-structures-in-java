// intput : aaa
// output : aaa aa a
import java.util.*;

public class Recursion {
    public static void printSeq(String str, int idx, String newString, HashSet<String> set){
        
        if(idx == str.length()){
            if(set.contains(newString)){
                return;
            }
            else{
                System.out.println(newString);
                set.add(newString);
            return;
            }
            
        }
        
        char currChar = str.charAt(idx);
        printSeq(str, idx+1, newString+currChar, set);
        printSeq(str, idx+1, newString, set);
    }
    
    public static void main(String args[]) {
        HashSet<String> set = new HashSet<>();
        printSeq("aaa", 0 , "", set);
    }
}
