package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FizzBuzzTask {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(countFizzBuzzPlainFor(createFizzBuzzInput(1, 100))));
        System.out.println(Arrays.toString(countFizzBuzzForEach(createFizzBuzzInput(1, 100))));
        System.out.println(Arrays.toString(countFizzBuzzStream(createFizzBuzzInput(1, 100))));

        System.out.println(Arrays.toString(countFizzBuzzPlainFor(createFizzBuzzInput(100, 200))));
        System.out.println(Arrays.toString(countFizzBuzzForEach(createFizzBuzzInput(100, 200))));
        System.out.println(Arrays.toString(countFizzBuzzStream(createFizzBuzzInput(100, 200))));
    }

    public static int[] countFizzBuzzPlainFor(List<Integer> input) {
        int[] result = new int[3]; // 0 for Fizz, 1 for Buzz, 2 for FizzBuzz

        //noinspection ForLoopReplaceableByForEach
        for (int i = 0; i < input.size(); i++) {
            checkNumber(input.get(i), result);
        }

        return result;
    }

    public static int[] countFizzBuzzForEach(List<Integer> input) {
        int[] result = new int[3]; // 0 for Fizz, 1 for Buzz, 2 for FizzBuzz

        for (int number : input) {
            checkNumber(number, result);
        }

        return result;
    }

    public static int[] countFizzBuzzStream(List<Integer> input) {
        int[] result = new int[3]; // 0 for Fizz, 1 for Buzz, 2 for FizzBuzz

//        input.stream().forEach(num -> checkNumber(num, result));
        input.forEach(number -> checkNumber(number, result));

        return result;
    }

    /**
     * % 3 == 0 - Fizz
     * % 5 == 0 - Buzz
     * For both conditions - FizzBuzz
     */
    private static void checkNumber(int number, int[] fizzBuzzArray) {
        if (isFizz(number) && isBuzz(number)) fizzBuzzArray[2]++;
        else if (isBuzz(number)) fizzBuzzArray[1]++;
        else if (isFizz(number)) fizzBuzzArray[0]++;
    }

    private static boolean isFizz(int number) { return number % 3 == 0; }

    private static boolean isBuzz(int number) { return number % 5 == 0; }

    /**
     * @param start - inclusive
     * @param end - inclusive
     */
    private static List<Integer> createFizzBuzzInput(int start, int end) {
        List<Integer> data = new ArrayList<>();
        for (int i = start; i <= end; i++) data.add(i);
        return data;
    }
}
