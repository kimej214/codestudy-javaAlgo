package day7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 별 찍기 - 10
// https://www.acmicpc.net/problem/2447
public class Java2447 {

    static boolean[][] idx;

    static void erase(int row, int col, int size) {
        if (size < 3) return;

        int unit = size / 3;

        // 가운데 블록 false 처리
        for (int i = row + unit; i < row + 2 * unit; i++) {
            for (int j = col + unit; j < col + 2 * unit; j++) {
                idx[i][j] = false;
            }
        }

        // 나머지 칸 재귀 호출
        for (int br = 0; br < 3; br++) {
            for (int bc = 0; bc < 3; bc++) {
                if (br == 1 && bc == 1) continue; // 가운데 제외
                erase(row + br * unit, col + bc * unit, unit);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());

        idx = new boolean[count][count];

        for (int i = 0; i < count; i++) {
            Arrays.fill(idx[i], true);
        }

        erase(0, 0, count);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count; j++) {
                sb.append(idx[i][j] ? '*' : ' ');
            }
            sb.append('\n');
        }
        System.out.print(sb);
    }
}