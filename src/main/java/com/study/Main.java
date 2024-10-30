package com.study;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int p = 0;

            int count = n;

            while (n >= k) {
                p = n/k; // 시켜먹을 수 있는 치킨의 수(추가될 쿠폰의 수)
                n = p + n%k; // 남은 도장 개수

                count += p;
            }
            System.out.println(count);
        }
    }
}