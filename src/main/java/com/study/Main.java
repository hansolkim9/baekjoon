package com.study;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int result = -1;

        for (int i = N / 5; i >= 0; i--) {
            int remainder = N - (i * 5);
            if (remainder % 3 == 0) {
                result = i + (remainder / 3);
                break;
            }
        }
        System.out.println(result);
    }
}
