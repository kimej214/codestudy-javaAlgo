package day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 행렬 덧셈
// https://www.acmicpc.net/problem/2738
public class Java2738 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int row = Integer.parseInt(st.nextToken());
        int column = Integer.parseInt(st.nextToken());

        int[][] matrixA = new int[row][column];
        int[][] matrixB = new int[row][column];

        for (int i = 0; i < row; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < column; j++) {
                matrixA[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < row; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < column; j++) {
                matrixB[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        StringBuilder numMatrixSum = new StringBuilder();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                numMatrixSum.append(matrixA[i][j] + matrixB[i][j]).append(" ");
            }
            numMatrixSum.append("\n");
        }

        System.out.print(numMatrixSum);
    }
}
