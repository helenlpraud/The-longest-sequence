package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] numbs = new int[size];
        int[] num = new int[size];
        int lastSequence = 0;
        int sequence = 1;
        int max = -100_000;
        int j = 0;
        for (int i = 0; i < size; i++) {
            numbs[i] = scanner.nextInt();
        }
        for (int i = 1; i < numbs.length; i++) {
            if (numbs[i] < numbs[i - 1]) {
                lastSequence = sequence;
                num[j] = lastSequence;
                j++;
                sequence = 1;
            } else {
                sequence++;
                if (i == numbs.length - 1) {
                    num[j] = sequence;
                }
            }
        }
        for (int a:num) {
            if (a >= max) {
                max = a;
            }
        }
        if (size == 1) {
            max = 1;
        }
        System.out.println(max);
    }
}
