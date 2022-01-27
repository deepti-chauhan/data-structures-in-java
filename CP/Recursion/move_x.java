
// move all 'x' at the end in the given string
// this solution is without recursion.


// Our input String : axbcxxd
// Our output String : abcdxxx

class Recursion {
    
    public static void move(String str, char element){
        String newString = new String();
        int count = 0;
        
        for(int idx = 0; idx<str.length(); idx++){
            char currChar = str.charAt(idx);
            
            if( currChar == element ){
                count++;
            } else{
                newString += currChar;
            }
            
        }
        
        for(int i=0; i<count; i++){
            newString += element;
        }
        System.out.println("Our output String : "+newString);   
    }
    
    public static void main(String[] args) {
        String s = "axbcxxd";
        char c = 'x';
        System.out.println("Our input String : "+ s);
        move(s,c);
    }
}
