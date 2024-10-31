package com.study;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt(); // 동전 종류
        int K = scanner.nextInt(); // 목표값
        int[] coin = new int[N];

        for (int i = 0; i < N; i++) {
            coin[i] = scanner.nextInt();
        }
        Arrays.sort(coin);
        int result = 0;

        for (int i = N-1; i >= 0; i--) {
            result += K / coin[i];
            K %= coin[i];

            if (K == 0) {
                break;
            }
        }
        System.out.println(result);
    }
}