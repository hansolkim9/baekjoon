package com.study;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] sequence = new int[n];
        for (int i = 0; i < n; i++) {
            sequence[i] = scanner.nextInt();
        }

        Stack<Integer> stack = new Stack<>();
        StringBuilder result = new StringBuilder();
        int current = 1;

        for (int i = 0; i < n; i++) {
            int target = sequence[i];

            // target에 도달할때까지 push
            while (current <= target) {
                stack.push(current);
                result.append("+\n");
                current++;
            }

            // stack의 최상단값이 target인지 확인
            if (stack.peek() == target) {
                stack.pop();
                result.append("-\n");
            } else {
                System.out.println("NO");
                return;
            }
        }
        System.out.println(result.toString());
    }
}