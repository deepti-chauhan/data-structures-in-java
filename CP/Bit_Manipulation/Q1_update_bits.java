/*Given a 32bit number N ,M and two bit position i, j
  Write a method to insert M in N such that M starts at position j and ends at position i in N.*/

// N : 1024 and Binary Representation :  10000000000
// M : 19 and Binary Representation :  10011
// Output : 1100 and Binary Representation :  10001001100



import java.lang.Math;
public class BitManipulation {
    public static void updateBits(int n, int m, int i, int j){
        
        double power = Math.pow(2,j);
        
        if(m>power){
          System.out.println("Incompatible input");
        }
        else{
        
            //bit mask
            int allOnes = ~0; //00000000 => 11111111 for 8 bits.
            
            //clear bit through j
            int left = allOnes << (j+1); // lets say j=4 so 11111111 << 5 => 11100000
            
            //clear bit throngh i
            int right = ((1<<i) - 1); // lets say i=2 so 1<<2 => 00000100 => 00000100 - 1 => 00000011
            
            //combine left and right i.e complete bitmask
            int bitMask = left | right; // 11100000 | 00000011 => 11100011, so bits from i to j are cleared in our bitmask.
            
            //clear bits from i to j in input n
            n = n & bitMask;
            
            //shift m by i
            m = m << i;
            
            //updated bit
            int updatedBit = n | m;
            
            //Integer.toString(100,2) => prints 1100100 --binary representation
            System.out.println("Output : " + updatedBit +" and Binary Representation :  " +Integer.toString(updatedBit, 2)); 
        }
    }
    
    public static void main(String args[]) {
        int n = 1024;
        System.out.println("N : "+ n +" and Binary Representation :  "+Integer.toString(n, 2));
        int m = 19;
        System.out.println("M : "+ m +" and Binary Representation :  "+Integer.toString(m, 2));
        updateBits(n,m, 2, 3);
    }
}
