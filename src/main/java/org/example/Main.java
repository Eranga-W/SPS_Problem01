package org.example;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        List<Long> fibList = new ArrayList<>();
        fibList.add(0L);
        fibList.add(1L);

        for (int i = 2; i < 100; i++) {
            fibList.add(fibList.get(i - 1) + fibList.get(i - 2));
        }

        System.out.println("Fibonacci Numbers: " + fibList);

    }
}