/*
  Input : HELLO WORLD
  Output : 4433555555666096667775553
  
  
  | 1     | 2:ABC | 3:DEF |
  | 4:GHI | 5:JKL | 6:MNO |
  | 7:PQRS| 8:TUV | 9:WXYZ|
  
*/

public class MyClass {
    public static String printMobileNumber(String[] arr, String s){
    int n = s.length();
    String out = "";
    
    for(int i=0; i<n; i++){
      if(s.charAt(i) == ' '){
        out += '0';
      }
      else{
        out += arr[s.charAt(i) - 'A'];
      }
    }
    
    return out;
  }
    public static void main(String args[]) {
        String[] str = {"2","22","222","3","33","333","4","44","444","5","55","555","6","66","666","7","77","777","7777","8","88","888","9","99","999","9999"};
        String in = "HELLO WORLD";
        System.out.print(printMobileNumber(str, in));
    }
}
