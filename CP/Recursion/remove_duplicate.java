
// remove duplicates from a string.
// input string : aabbccddee
// output string : abcde

class Recursion {
    
    public static boolean[] map = new boolean[26];
    
    public static void removeDuplicate(String str, int idx, String newString){
        
        if(idx == str.length()){
            System.out.print("Our output string : "+newString);
            return;
        }
        
        char currChar = str.charAt(idx);
        if(map[currChar- 'a'] == true){
            removeDuplicate(str, idx+1, newString);
        }
        else{
            map[currChar - 'a'] = true;
            newString += currChar;
            removeDuplicate(str, idx+1, newString);
        }
    }
    
    public static void main(String[] args) {
        String str = "aabbccddee";
        System.out.println("Our input String : "+ str);
        removeDuplicate(str, 0, ""); // index = 0, count = 0;
    }
}
