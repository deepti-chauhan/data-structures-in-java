//  clear bit operation to set bit at ith position to zero.
import java.util.*;
class Bits {
    
    static int clearBit( int n, int pos){
        int bit_mask = ~(1<<pos);             // Bitwise not with left shift.
        int clear_bit = n & bit_mask;
        return clear_bit;
    }
    
    public static void main(String[] args) {
        int n = 5;
        int pos = 2;
        clearBit(n,pos);
    }
}
