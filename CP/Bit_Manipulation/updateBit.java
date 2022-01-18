// updateBit to update bit with 0 or 1 at ith position.
import java.util.*;
class Bits {
    
    static int updateBit( int n, int pos, int replace_bit){
        
        if ( replace_bit == 0){
            int bit_mask = ~(1<<pos);
            int update_bit = n & bit_mask;
            return update_bit;
        }
        else{
            int bit_mask = (1<<pos);
            int update_bit = n | bit_mask;
            return update_bit;
        }
    }
    
    public static void main(String[] args) {
        int n = 5;
        int pos = 1;
        int output = updateBit(n,pos,0);
        System.out.print(output);
    }
}
