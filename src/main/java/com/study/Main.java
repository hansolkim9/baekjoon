package com.study;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int M = scanner.nextInt();
        int N = scanner.nextInt();

        // 소수 판별을 위한 배열 초기화
        boolean[] isPrime = new boolean[N + 1];
        for (int i = 2; i <= N; i++) {
            isPrime[i] = true; // 모든 수를 소수로 가정
        }

        // 에라토스테네스의 체 알고리즘 적용
        for (int i = 2; i * i <= N; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= N; j += i) {
                    isPrime[j] = false;  // 소수가 아닌 수는 false로 설정
                }
            }
        }

        // M 이상 N 이하의 소수 출력
        StringBuilder result = new StringBuilder();
        for (int i = M; i <= N; i++) {
            if (isPrime[i]) {
                result.append(i).append("\n");
            }
        }
        System.out.print(result);
    }
}