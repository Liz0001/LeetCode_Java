package com.liu0001.Convert_the_Temperature_2469;

/*
2469. Convert the Temperature

You are given a non-negative floating point number rounded to two
decimal places celsius, that denotes the temperature in Celsius.

You should convert Celsius into Kelvin and Fahrenheit and return
it as an array ans = [kelvin, fahrenheit].

Return the array ans. Answers within 10-5 of the actual answer will be accepted.
 */

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {

        double[] ans = convertTemperature(36.5);

        System.out.println(Arrays.toString(ans));
    }

    public static double[] convertTemperature(double celsius) {

        double[] arr = new double[2];
        arr[0] = (celsius + 273.15);
        arr[1] = (celsius * 1.80 + 32.00);
        return arr;
    }
}
