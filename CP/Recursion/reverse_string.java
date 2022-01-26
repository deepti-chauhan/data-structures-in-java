// print a string in reverse.

class Reverse {
    public static void reverseString(String str, int idx){
        if(idx < 0){
            return;
        }
        System.out.print(str.charAt(idx));
        --idx;
        reverseString(str, idx);
    }
    
    public static void main(String args[]){
        String s = "abcd";
        int idx = s.length()-1;
        reverseString(s,idx);
    }
}
