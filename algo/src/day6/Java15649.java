package day6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// N과 M (1)
// https://www.acmicpc.net/problem/15649
public class Java15649 {
    static int N, M;
    static int[] pick;
    static boolean[] used;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] num = br.readLine().split(" ");

        N = Integer.parseInt(num[0]);
        M = Integer.parseInt(num[1]);

        pick = new int[M];
        used = new boolean[N + 1];

        // 기존 코드처럼 i를 1부터 N까지 돌림
        for (int i = 1; i <= N; i++) {
            pick[0] = i;
            used[i] = true;          // 중복 방지 표시
            chooseNext(1);     // 두 번째 자리부터 채우기
            used[i] = false;         // 원상복구
        }
    }

    static void chooseNext(int depth) {

        // M개를 다 채웠으면 출력
        if (depth == M) {
            for (int k = 0; k < M; k++) {
                System.out.print(pick[k] + " ");
            }
            System.out.println();
            return;
        }

        // 기존 안쪽 for문 느낌을 재귀 안에서 유지
        for (int x = 1; x <= N; x++) {
            if (!used[x]) {          // 아직 안 쓴 숫자만 사용
                used[x] = true;
                pick[depth] = x;
                chooseNext(depth + 1);
                used[x] = false;     // 백트래킹(되돌리기)
            }
        }
    }
}

//package day6;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//
//public class Java15649 {
//    static int N, M;
//    static int[] pick;
//    static boolean[] used;
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String[] input = br.readLine().split(" ");
//
//        N = Integer.parseInt(input[0]);
//        M = Integer.parseInt(input[1]);
//
//        pick = new int[M];
//        used = new boolean[N + 1];
//
//        dfs(0);
//    }
//
//    static void dfs(int depth) {
//        // M개를 모두 고른 경우
//        if (depth == M) {
//            for (int i = 0; i < M; i++) {
//                System.out.print(pick[i] + " ");
//            }
//            System.out.println();
//            return;
//        }
//
//        // 1부터 N까지 모든 수 시도
//        for (int i = 1; i <= N; i++) {
//            if (!used[i]) {
//                used[i] = true;
//                pick[depth] = i;
//                dfs(depth + 1);
//                used[i] = false; // 백트래킹
//            }
//        }
//    }
//}