package org.example;
import java.util.*;
import java.lang.*;
public class Main {
    public static void main(String[] args) {
        int[] nums = {50, 2, 1, 9};

        String[] strNums = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strNums[i] = String.valueOf(nums[i]);
        }

        Arrays.sort(strNums, (a, b) -> (b + a).compareTo(a + b));

        String str = String.join("", strNums);

        System.out.println("Formed Number is " + str);

    }
}