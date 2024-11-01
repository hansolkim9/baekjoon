package com.study;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt(); // 저장할 사이트 수
        int M = scanner.nextInt(); // 찾을 사이트 수
        scanner.nextLine(); // 개행 문자 처리

        Map<String, String> passwordMap = new HashMap<>();

        for (int i = 0; i < N; i++) {
            String site = scanner.next();
            String password = scanner.next();
            passwordMap.put(site, password);
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < M; i++) {
            String site = scanner.next();
            result.append(passwordMap.get(site)).append("\n");
        }

        System.out.print(result.toString());
    }
}