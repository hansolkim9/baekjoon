package com.study;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int sum = 0;
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
            sum += arr[i];
        }
        Arrays.sort(arr);

        // 최빈값 계산
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // 가장 높은 빈도 찾기
        int maxFrequency = Collections.max(frequencyMap.values());

        // 빈도가 maxFrequency인 숫자들을 모으기
        List<Integer> modeList = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() == maxFrequency) {
                modeList.add(entry.getKey());
            }
        }

        // 최빈값이 여러 개일 경우 두 번째로 작은 값 선택
        Collections.sort(modeList);
        int mode = (modeList.size() > 1) ? modeList.get(1) : modeList.get(0);

        System.out.println((int) Math.round((double) sum/N)); // 산술평균
        System.out.println(arr[(N-1)/2]); // 중앙값
        System.out.println(mode); // 최빈값
        System.out.println(arr[N-1] - arr[0]); // 범위
    }
}
