package day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 색종이
// https://www.acmicpc.net/problem/2563
public class Java2563 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());

        // 도화지 (100x100)
        boolean[][] paper = new boolean[100][100];

        for (int i = 0; i < count; i++) {

            String line = br.readLine();
            StringTokenizer st = new StringTokenizer(line);

            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            // 색종이 영역 채우기 (10x10)
            for (int r = x; r < x + 10; r++) {
                for (int c = y; c < y + 10; c++) {
                    paper[r][c] = true;
                }
            }
        }

        // 검은 영역 넓이 계산
        int area = 0;
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if (paper[i][j]) {
                    area++;
                }
            }
        }

        System.out.println(area);
    }
}