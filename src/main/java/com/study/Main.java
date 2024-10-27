package com.study;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Queue<Integer> q = new LinkedList<>();

        int N = scanner.nextInt();
        int last = -1;

        for (int i = 0; i < N; i++) {
            String s = scanner.next();

            switch (s) {
                case "push":
                    last = scanner.nextInt();
                    q.add(last);
                    break;
                case "pop":
                    System.out.println(q.isEmpty() ? -1 : q.poll());
                    break;
                case "size":
                    System.out.println(q.size());
                    break;
                case "empty":
                    System.out.println(q.isEmpty() ? 1 : 0);
                    break;
                case "front":
                    System.out.println(q.isEmpty() ? -1 : q.peek());
                    break;
                case "back":
                    System.out.println(q.isEmpty() ? -1 : last);
                    break;
            }
        }
    }
}