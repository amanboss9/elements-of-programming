package primitive;

public class SwapBits {

    private static long swapBits(long x, int i, int j) {
        // Extract the i-th and j-th bits, and see if they differ.
        if (((x >> i) & 1) !=((x >> j) & 1)){
            // i-th and j-th bits differ. We will swap them by flipping their values.
            // Select the bits to flip with bitMask. Since x^1 = 0 when x = 1 and 1
            // when x = 0, we can perform the flip XOR .
            long bitMask = (1L << i)|(1L << j);
            System.out.println("BitMask: " + Long.toBinaryString(bitMask));
            x ^= bitMask;
        }

        return x;
    }


    public static void main(String[] args) {
        long num = 73;
        System.out.println("Binary format of given number: "+ Long.toBinaryString(73));
        long result = swapBits(num, 6,1);
        System.out.println("Binary format of result: "+ Long.toBinaryString(result));
    }
}
