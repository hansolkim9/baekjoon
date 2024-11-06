package com.study;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int red = scanner.nextInt();
        int green = scanner.nextInt();
        int blue = scanner.nextInt();

        System.out.println(3*red + 4*green + 5*blue);
    }
}