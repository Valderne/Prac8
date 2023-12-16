package com.example.practise8;
public class MainActivity {

    public static int findMinValue(char[] arr) {
        if (arr == null || arr.length == 0) {
            return -1;
        }

        int minValue = Integer.MAX_VALUE;
        for (char c : arr) {
            if (c < minValue) {
                minValue = c;
            }
        }
        return minValue;
    }

    public static int findSumOfNegatives(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            if (i < 0) {
                sum += i;
            } else {
                return 1; // Return 1 if a non-negative element is found
            }
        }
        return sum;
    }

    public static int findNthFibonacciNumber(int n) {
        if (n <= 0) {
            return -1;
        }

        if (n == 1 || n == 2) {
            return n - 1;
        }

        return findNthFibonacciNumber(n - 1) + findNthFibonacciNumber(n - 2);
    }

    public static double calculateCurrent(double voltage, double resistance) {
        if (resistance <= 0) {
            return -1;
        }

        return voltage / resistance;
    }


}



