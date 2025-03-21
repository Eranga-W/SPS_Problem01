package org.example;

public class Main {
    public static void main(String[] args) {
        int[] numList = {10, 20, 30, 40};
        int forSum = 0;
        int whileSum = 0;
        int recSum = 0;

        //for-loop
        for (int i = 0; i < numList.length; i++) {
            forSum += numList[i];
        }

        //while-loop
        int j=0;
        while (j < numList.length) {
            whileSum += numList[j];
            j++;
        }

        System.out.println("Sum of for-loop = " + forSum);
        System.out.println("Sum of while-loop = " + whileSum);
        System.out.println("Sum of recursion = " + getSum(numList,numList.length));
    }
    //recursion
    public static int getSum(int[] arr, int n) {
        if (n == 0) {
            return 0;
        }
        return arr[n - 1] + getSum(arr, n - 1);
    }
}