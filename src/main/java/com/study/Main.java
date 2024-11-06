package com.study;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int result = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = i; i * j <= n; j++) {
                result++;
            }
        }
        System.out.println(result);
    }
}