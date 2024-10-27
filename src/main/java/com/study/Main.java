package com.study;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int K = scanner.nextInt();

        Queue<Integer> q = new LinkedList<>();
        StringBuilder result = new StringBuilder("<");

        for (int i = 1; i <= N; i++) {
            q.add(i);
        }

        while (!q.isEmpty()) {
            for (int i = 1; i < K; i++) {
                q.add(q.poll());
            }
            result.append(q.poll());
            if (!q.isEmpty()) {
                result.append(", ");
            }
        }
        result.append(">");
        System.out.println(result);
    }
}