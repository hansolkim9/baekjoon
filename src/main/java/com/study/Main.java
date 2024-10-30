package com.study;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int h = scanner.nextInt();
        int v = scanner.nextInt();

        int x = Math.max(h, n-h);
        int y = Math.max(v, n-v);

        System.out.println(x*y*4);
    }
}