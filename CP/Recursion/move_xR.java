
// move all 'x' at the end in the given string
// this solution is with recursion.

class Recursion {
    
    public static void move(String str, int idx, int count, String newString){
        if(idx == str.length()){
            for(int i=0; i<count; i++){
            newString += 'x';
          }
          System.out.println("Our output String : "+newString); 
          return;
        }
        
        char currChar = str.charAt(idx);
        if(currChar == 'x' ){
            count++;
            move(str, idx+1, count, newString);
            }
        else{
            newString += currChar;
            move(str, idx+1, count, newString);
            }
            
        }
    public static void main(String[] args) {
        String str = "axbcxxd";
        System.out.println("Our input String : "+ str);
        move(str, 0, 0, ""); // index = 0, count = 0;
    }
}
