package com.study;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt(); // 듣도 못한 사람 수
        int M = scanner.nextInt(); // 보도 못한 사람 수

        Set<String> unheard = new HashSet<>();
        Set<String> unseen = new HashSet<>();

        // 듣도 못한 사람을 Set에 추가
        for (int i = 0; i < N; i++) {
            unheard.add(scanner.next());
        }

        // 보도 못한 사람을 Set에 추가
        for (int j = 0; j < M; j++) {
            String name = scanner.next();
            if (unheard.contains(name)) {
                unseen.add(name);  // 듣도 못한 사람에 포함된 경우에만 unseen에 추가
            }
        }

        // 결과 리스트 정렬
        List<String> resultList = new ArrayList<>(unseen);
        Collections.sort(resultList);

        // 출력
        System.out.println(resultList.size());
        for (String name : resultList) {
            System.out.println(name);
        }
    }
}