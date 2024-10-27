package com.study;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        HashMap<Integer, Integer> cardCount = new HashMap<>();

        // 상근이의 숫자 카드 개수 저장
        for (int i = 0; i < N; i++) {
            int num = scanner.nextInt();
            cardCount.put(num, cardCount.getOrDefault(num, 0) + 1);
        }

        int M = scanner.nextInt();
        StringBuilder result = new StringBuilder();

        // 각 숫자의 개수를 빠르게 조회
        for (int i = 0; i < M; i++) {
            int num = scanner.nextInt();
            result.append(cardCount.getOrDefault(num, 0)).append(" ");
        }
        System.out.println(result);
    }
}