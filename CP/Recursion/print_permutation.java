// input => "abc"
// output => abc acb bac bca cab cba

public class Recursion {
    
    public static void permutation(String str, String permutation){
        // base case
        if(str.length() == 0){
            System.out.println(permutation);
            return;
        }
        
        for(int i=0; i<str.length(); i++){
            char currChar = str.charAt(i); // so for i = 0 currChar => 'a'
            String newString = str.substring(0,i) + str.substring(i+1); //i.e => "b"+"c" => "bc"
            permutation(newString, permutation+currChar);
        }
    }
    
    public static void main(String args[]) {
      permutation("abc", "");
    }
}
