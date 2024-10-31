package com.study;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt(); // 테스트 케이스

        for (int i = 0; i < T; i++) {
            int N = scanner.nextInt(); // 문서 개수
            int M = scanner.nextInt(); // 찾는 문서 위치
            Queue<Document> queue = new LinkedList<>();
            int maxPriority = 0; // 현재 최대 중요도 추적

            for (int j = 0; j < N; j++) {
                int priority = scanner.nextInt();
                queue.add(new Document(j, priority));
                maxPriority = Math.max(maxPriority, priority); // 최대 중요도 갱신
            }

            int printOrder = 0; // 출력순서

            // 인쇄 순서 결정
            while (!queue.isEmpty()) {
                Document current = queue.poll();

                // 더 높은 중요도 있는지 확인
                boolean hasHigherPriority = false;
                for (Document doc : queue) {
                    if (doc.priority > current.priority) {
                        hasHigherPriority = true;
                        break;
                    }
                }

                if (hasHigherPriority) {
                    queue.add(current);
                } else {
                    printOrder++;
                    if (current.index == M) {
                        System.out.println(printOrder);
                        break;
                    }
                }
            }
        }
    }
}

class Document {
    int index, priority;

    public Document(int index, int priority) {
        this.index = index;
        this.priority = priority;
    }
}
