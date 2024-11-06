package com.study;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); // 컴퓨터 수
        int m = scanner.nextInt(); // 연결된 쌍의 수

        // 그래프를 인접 리스트로 표현
        List<Integer>[] graph = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }

        // 연결 정보 입력
        for (int i = 0; i < m; i++) {
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            graph[u].add(v);
            graph[v].add(u);
        }

        // BFS를 사용하여 1번 컴퓨터부터 시작
        boolean[] visited = new boolean[n + 1];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        visited[1] = true;

        int infectedCount = 0;

        while (!queue.isEmpty()) {
            int computer = queue.poll();
            for (int connected : graph[computer]) {
                if (!visited[connected]) {
                    visited[connected] = true;
                    queue.add(connected);
                    infectedCount++;
                }
            }
        }

        System.out.println(infectedCount);
    }
}