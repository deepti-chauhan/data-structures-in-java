// Q1 Write a program to toggle a bit a position = “pos” in a number “n”.
// we will use xor operation.
class Bits {
    public static void main(String[] args) {
        int n = 7; // 0111
        int pos = 2; // position at which we have to perform toggle.
        int bit_mask = 1<<pos; // left shift 0001 by pos = 2 value, i.e. 0100
        int toggle_output = n^bit_mask; // n xor bit_mask i.e 0111^0100 = 0011
        System.out.println(toggle_output); // 0011 i.e 3 will be our output.
    }
}
