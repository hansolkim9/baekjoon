package com.study;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        System.out.print(n + " ");

        while (true) {
            if (n == 1) {
                break;
            } else if (n%2 == 0) {
                n = n/2;
                System.out.printf("%d ", n);
            } else if (n%2 == 1) {
                n = n * 3 + 1;
                System.out.printf("%d ", n);
            }
        }
    }
}