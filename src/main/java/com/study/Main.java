package com.study;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();

        int[][] dp = new int[41][2];
        dp[0][0] = 1;
        dp[0][1] = 0;
        dp[1][0] = 0;
        dp[1][1] = 1;

        // 채우기
        for (int i = 2; i <= 40; i++) {
            dp[i][0] = dp[i - 1][0] + dp[i - 2][0];
            dp[i][1] = dp[i - 1][1] + dp[i - 2][1];
        }

        // 테스트 케이스 입력 및 출력
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < T; i++) {
            int n = scanner.nextInt();
            result.append(dp[n][0]).append(" ").append(dp[n][1]).append("\n");
        }
        System.out.print(result);
    }
}