package com.study;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int H = scanner.nextInt();
        int result = 0;

        for (int i = 0; i < N; i++) {
            int a = scanner.nextInt();

            if (H >= a) {
                result++;
            }
        }

        System.out.println(result);
    }
}