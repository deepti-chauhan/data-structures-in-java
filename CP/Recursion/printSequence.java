
// intput -> 'abc'
// output -> abc ab ac a bc b c _

public class Recursion {
    public static void printSeq(String str, int idx, String newString){
        
        if(idx == str.length()){
            System.out.println(newString);
            return;
        }
        
        char currChar = str.charAt(idx);
        printSeq(str, idx+1, newString+currChar);
        printSeq(str, idx+1, newString);
    }
    
    public static void main(String args[]) {
      printSeq("abc", 0 , "");
    }
}
