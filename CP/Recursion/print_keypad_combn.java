// input -> '23'
// output -> dg dh di eg eh ei fg fh fi
public class Recursion {
    public static String[] map = {".", "abc", "def", "ghi", "jkl","mno", "pqrs", "tu", "vwx", "yx"};
    
    public static void printCombination(String str, int idx, String combination){
        
        if(idx == str.length()){
            System.out.println(combination);
            return;
        }
        
        char currChar = str.charAt(idx);
        // currChar = 2
        // currChar = 3
        
        String map_char = map[currChar - '0']; 
        // map_char = map[2 - 0] => map[2] => 'def'
        // map_char = map[3 - 0] => map[3] => 'ghi'
        
        
        for(int i=0; i<map_char.length(); i++){ // i<3; becoz def is of map_char length=3;
            printCombination(str, idx+1, combination+map_char.charAt(i));
        }
        
    }
    
    public static void main(String args[]) {
      printCombination("23", 0 , "");
    }
}
