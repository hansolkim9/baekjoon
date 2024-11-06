package com.study;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        int onionP = 1;
        int onionN = 1;

        for (int i = 1; i <= N; i++) {
            int c = 0;
            onionP += A;
            onionN += B;

            if (onionN > onionP) {
                c = onionP;
                onionP = onionN;
                onionN = c;
            } else if (onionN == onionP) {
                onionN -= 1;
            }
        }

        System.out.println(onionP + " " + onionN);
    }
}