
import java.util.*;
class Bits {                                        //  Basic get and set operation on bits.

    static void getBit( int n, int pos){            // getBit() : n = 3 i.e 0011, pos = 2 i.e get 3rd bit
        int bit_mask = 1<<pos;                      //          bit_mask = 1<<pos left shift, 1-> 0001 => 0100
        if((n & bit_mask)==0) {                     //          0011 and 0100 => 0000 i.e bit at that position is zero else one.
            System.out.println("Bit is zero\n");           
        }                                                    
        else{
            System.out.println("Bit is one\n");
        }
    }

    static int setBit( int n, int pos){               // setBit() : set bit at ith position to one.
        int bit_mask = 1<<pos;                        //           n = 3, position =2, bit_mask = 0100
        return (n | bit_mask);                        //           0011 or 0100 => 0111 i.e. 7, 3rd bit is set to one.
    }
    
    public static void main(String[] args) {
        int n = 3;
        int pos = 2;
        getBit(n,pos);                                // Calling functions.
        int set_bit = setBit(n,pos);
        System.out.println(set_bit);
        
    }
}
