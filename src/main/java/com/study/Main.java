package com.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        int k = (int) Math.round(n * 0.15);
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(reader.readLine());
        }

        Arrays.sort(arr);
        int sum = 0;
        for (int i = k; i < n - k; i++) {
            sum += arr[i];
        }

        int m = n - 2 * k;
        System.out.println((int) Math.round((double) sum / m));
    }
}