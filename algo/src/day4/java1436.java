package day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 영화감독 숌
// https://www.acmicpc.net/problem/1436
public class java1436 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int inputNum = Integer.parseInt(br.readLine());

        int count = 0;
        int num = 666;

        while (true) {
            String text = Integer.toString(num);

            if (text.contains("666")) {
                count++;

                if (count == inputNum) {
                    System.out.println(num);
                    break;
                }
            }

            num++;
        }
    }
}
