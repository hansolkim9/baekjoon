package com.study;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt(); // 듣도 못한 사람
        int M = scanner.nextInt(); // 보도 못한 사람
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < N; i++) {
            map.put(scanner.next(), 0);
        }

        for (int j = 0; j < M; j++) {
            String name = scanner.next();
            if (map.containsKey(name)) { // 듣도 못한 사람 중 보도 못한 사람만 카운트 증가
                map.put(name, 1); // 값을 1로 설정해 듣도 보도 못한 사람 표시
            }
        }

        // 값이 1인 키를 list에 추가
        List<String> resultList = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                resultList.add(entry.getKey());
            }
        }

        // 리스트 정렬 및 출력
        Collections.sort(resultList);
        System.out.println(resultList.size());
        for (String name : resultList) {
            System.out.println(name);
        }
    }
}