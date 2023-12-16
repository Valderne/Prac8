package com.example.practise8;

import org.junit.Test;

import static org.junit.Assert.*;

public class ExampleUnitTest {

    @Test
    public void testFindMinValue_Positive() {
        char[] arr = {'a', 'b', 'c', 'd', 'e'};
        int expected = 'a';
        int actual = MainActivity.findMinValue(arr);
        assertEquals(expected, actual);
    }

    @Test
    public void testFindMinValue_Negative() {
        char[] arr = {};
        int expected = -1;
        int actual = MainActivity.findMinValue(arr);
        assertEquals(expected, actual, 0.0001);
    }

    @Test
    public void testFindSumOfNegatives_Positive() {
        int[] arr = {-1, -2, -3, -4, -5};
        int expected = -15;
        int actual = MainActivity.findSumOfNegatives(arr);
        assertEquals(expected, actual);
    }

    @Test
    public void testFindSumOfNegatives_Negative() {
        int[] arr = {1, 2, 3, 4, 5};
        int expected = 1;
        int actual = MainActivity.findSumOfNegatives(arr);
        assertEquals(expected, actual);
    }

    @Test
    public void testFindNthFibonacciNumber_Positive() {
        int n = 10;
        int expected = 34;
        int actual = MainActivity.findNthFibonacciNumber(n);
        assertEquals(expected, actual, 0.0001);
    }

    @Test
    public void testFindNthFibonacciNumber_Negative() {
        int n = -1;
        int expected = -1;
        int actual = MainActivity.findNthFibonacciNumber(n);
        assertEquals(expected, actual);
    }

    @Test
    public void testCalculateCurrent_Positive() {
        double voltage = 100;
        double resistance = 25;
        double expected = 4;
        double actual = MainActivity.calculateCurrent(voltage, resistance);
        assertEquals(expected, actual, 0.0001);
    }

    @Test
    public void testCalculateCurrent_Negative() {
        double voltage = 100;
        double resistance = -25;
        double expected = -1;
        double actual = MainActivity.calculateCurrent(voltage, resistance);
        assertEquals(expected, actual, 0.0001);
    }

}




