public class MyClass {
    
    public static int[] countChar(String s){
        int[] count = new int[256];
        for(int i=0; i<s.length(); i++){
            count[s.charAt(i)]++;
        }
        return count;
    }
    public static void main(String args[]) {
     String str = "goodevening";
     int[] res = countChar(str);
     
     for(int i=0; i<res.length; i++){
         if(res[i] > 1) System.out.print(res[i] + " ");
     }
     
    }
}
