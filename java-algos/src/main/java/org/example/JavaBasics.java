package org.example;

public class JavaBasics {
    int a;
    static String b = "Welcome to DS Course";

    static int sum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static int countBitsForASpecificNumber(int number) {
        int noOf1Bits = 0;
        while(number != 0) {
            // check if the current bit is now
            if((number & 1) == 1) {
                noOf1Bits++;
            }
            number = number >>> 1;

        }
        return noOf1Bits;
    }

    public static void main(String[] args) {
        JavaBasics m = new JavaBasics();
        m.a = 5;
        System.out.println(m.a);
        System.out.println(JavaBasics.b);
        System.out.println(m.b);

        System.out.println(JavaBasics.sum(2, 4));

        int number = 6;

        System.out.println(number >> 1);

        System.out.println(number >> 2);
        System.out.println(number >> 3);

        System.out.println("Hello world!");

        int numberOfBits = JavaBasics.countBitsForASpecificNumber(256);
        System.out.println("Number of bits = " + numberOfBits);
    }
}