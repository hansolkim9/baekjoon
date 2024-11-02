package com.study;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] dp = new int[n + 1];
        dp[1] = 0; // 1은 1로 만드는 데 연산이 필요 없음

        for (int i = 2; i <= n; i++) {
            // 기본적으로 i에서 1을 뺀 경우
            dp[i] = dp[i - 1] + 1;

            // i가 2로 나누어떨어질 경우
            if (i % 2 == 0) {
                dp[i] = Math.min(dp[i], dp[i / 2] + 1);
            }

            // i가 3으로 나누어떨어질 경우
            if (i % 3 == 0) {
                dp[i] = Math.min(dp[i], dp[i / 3] + 1);
            }
        }

        System.out.println(dp[n]);
    }
}