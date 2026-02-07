package day6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


//N과 M (2)
//https://www.acmicpc.net/problem/15650
public class Java15650 {

    static int N, M;
    static int[] pick;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] num = br.readLine().split(" ");

        N = Integer.parseInt(num[0]);
        M = Integer.parseInt(num[1]);

        pick = new int[M];

        // 기존 코드처럼 i를 1부터 N까지 돌림
        for (int i = 1; i <= N; i++) {
            // 첫 번째 숫자는 i로 고정
            pick[0] = i;
            // 두 번째부터는 i+1 이상만 선택
            chooseNext(i + 1, 1);
        }
    }

    // start: 다음에 뽑을 수 있는 최소 숫자
    // depth: 지금까지 채운 개수
    static void chooseNext(int start, int depth) {

        // M개를 다 채웠으면 출력
        if (depth == M) {
            for (int k = 0; k < M; k++) {
                System.out.print(pick[k] + " ");
            }
            System.out.println();
            return;
        }

        // 기존 안쪽 for문 느낌을 재귀 안에서 유지
        for (int x = start; x <= N; x++) {
            pick[depth] = x;
            chooseNext(x + 1, depth + 1);
        }
    }

    //    static int N, M;
    //    static int[] arr;
    //
    //    public static void main(String[] args) throws IOException {
    //        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //        StringTokenizer st = new StringTokenizer(br.readLine());
    //
    //        N = Integer.parseInt(st.nextToken());
    //        M = Integer.parseInt(st.nextToken());
    //
    //        arr = new int[M];
    //
    //        dfs(1, 0);
    //    }
    //
    //    static void dfs(int start, int depth) {
    //
    //        if (depth == M) {
    //            for (int i = 0; i < M; i++) {
    //                System.out.print(arr[i] + " ");
    //            }
    //            System.out.println();
    //            return;
    //        }
    //
    //        for (int i = start; i <= N; i++) {
    //            arr[depth] = i;
    //            dfs(i + 1, depth + 1);
    //        }
    //    }
}
