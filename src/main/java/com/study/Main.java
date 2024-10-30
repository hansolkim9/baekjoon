package com.study;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int T  = scanner.nextInt();

        for (int i = 0; i < T; i++) {

            int N = scanner.nextInt();
            int D = scanner.nextInt();
            int count = 0;

            for (int j = 0; j < N; j++) {
                int vi = scanner.nextInt();
                int fi = scanner.nextInt();
                int ci = scanner.nextInt();

                if (fi >= ci*D/vi) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}