
// print first & Last occurence of an element in string str.

class Recursion {
    public static int atFirst=-1;
    public static int atLast =-1;
    
    public static void findOccurence(String str, int idx, char element){
        if(idx == str.length()){
            System.out.print("First occurence of "+ element+ " is at index " + atFirst + " and Last occurence is at index "+ atLast);
            return;
        }
        if(str.charAt(idx) == element){
            if(atFirst == -1){
                atFirst = idx;
            }
            atLast = idx;
        }
        findOccurence(str, idx+1,element);
        
    }
    
    public static void main(String args[]){
        String s = "abchaadesasag";
        int idx = 0;
        findOccurence(s,idx,'a');
    }
}
