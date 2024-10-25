package com.study;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        int S = 0;  // 비트마스크를 위한 정수 초기화
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            int x;

            switch (command) {
                case "add":
                    x = Integer.parseInt(st.nextToken());
                    S |= (1 << x);  // x번째 비트를 1로 설정
                    break;
                case "remove":
                    x = Integer.parseInt(st.nextToken());
                    S &= ~(1 << x);  // x번째 비트를 0으로 설정
                    break;
                case "check":
                    x = Integer.parseInt(st.nextToken());
                    sb.append((S & (1 << x)) != 0 ? 1 : 0).append("\n");
                    break;
                case "toggle":
                    x = Integer.parseInt(st.nextToken());
                    S ^= (1 << x);  // x번째 비트를 반전
                    break;
                case "all":
                    S = (1 << 21) - 1;  // 1부터 20까지 모두 1로 설정
                    break;
                case "empty":
                    S = 0;  // 집합을 비움
                    break;
            }
        }
        System.out.print(sb);
    }
}