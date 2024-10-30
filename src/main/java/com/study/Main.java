package com.study;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int n = N/4;

        System.out.println("long ".repeat(n) + "int");
    }
}