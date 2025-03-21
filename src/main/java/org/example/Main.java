package org.example;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        int[] numList = {1,2,3};
        char[] chList = {'a','b','c'};

        List<Object> list = new ArrayList<>();

        int i = 0, j = 0;
        while (i < numList.length || j < chList.length) {
            if (i < numList.length) {
                list.add(numList[i]);
                i++;
            }
            if (j < chList.length) {
                list.add(chList[j]);
                j++;
            }
        }

        System.out.println("Combined List: " + list);




    }
}