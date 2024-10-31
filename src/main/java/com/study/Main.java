package com.study;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt(); // 도감에 있는 포켓몬 개수
        int M = scanner.nextInt(); // 맞춰야 하는 문제 개수

        Map<String, Integer> map = new HashMap<>();
        String[] array = new String[N];

        for (int i = 0; i < N; i++) {
            String poketmon = scanner.next();
            map.put(poketmon, i+1);
            array[i] = poketmon;
        }

        for (int i = 0; i < M; i++) {
            String question = scanner.next();

            // question이 숫자인지 확인
            try {
                int number = Integer.parseInt(question); // 숫자로 변환 시도
                System.out.println(array[number - 1]); // 배열에서 이름을 찾음
            } catch (NumberFormatException e) {
                System.out.println(map.get(question)); // 해시맵에서 번호를 찾음
            }
        }
    }
}