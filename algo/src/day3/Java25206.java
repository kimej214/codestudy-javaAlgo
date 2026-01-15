package day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 너의 평점은
// https://www.acmicpc.net/problem/25206
public class Java25206 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // (학점 × 평점) 누적
        double totalDegreeSum = 0;
        // 학점 누적
        double totalCredit = 0;

        for (int i = 0; i < 20; i++) {

            String degreeLine = br.readLine();
            String[] degreeInfo = degreeLine.split(" ");

            double credit = Double.parseDouble(degreeInfo[1]);
            String rank = degreeInfo[2];
            double degree = 0;

            switch (rank) {
                case "A+":
                    degree = 4.5;
                    break;
                case "A0":
                    degree = 4.0;
                    break;
                case "B+":
                    degree = 3.5;
                    break;
                case "B0":
                    degree = 3.0;
                    break;
                case "C+":
                    degree = 2.5;
                    break;
                case "C0":
                    degree = 2.0;
                    break;
                case "D+":
                    degree = 1.5;
                    break;
                case "D0":
                    degree = 1.0;
                    break;
                case "F":
                    degree = 0.0;
                    break;
                case "P":
                    continue;
            }

            totalDegreeSum += credit * degree;
            totalCredit += credit;
        }

        double result = totalDegreeSum / totalCredit;
        System.out.printf("%.6f%n", result);
    }
}
