package com.study;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] time = new int[N];

        for (int i = 0; i < N; i++) {
            time[i] = scanner.nextInt();
        }

        Arrays.sort(time);
        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += time[i];
            time[i] = sum;
        }
        sum = 0;
        for (int i = 0; i < N; i++) {
            sum += time[i];
        }
        System.out.println(sum);
    }
}