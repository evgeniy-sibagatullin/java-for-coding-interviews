package org.example;

public class LeetCode338CountingBits {
    public static int[] countBits(int n) {
        int[] res = new int[n + 1];
        int shift = 1, count = 1;

        for (int i = 1; i <= n; i++) {
            res[i] = res[i - shift] + 1;

            if (--count == 0) count = shift <<= 1;
        }
        return res;
    }

    public static int countBitsForASpecific(int number) {
        int noOf1Bits = 0;
        while(number != 0) {
            number = number & number - 1;
            noOf1Bits++;
        }
        return noOf1Bits;
    }
}
