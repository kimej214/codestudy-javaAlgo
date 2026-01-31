package day5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//팩토리얼
//https://www.acmicpc.net/problem/10872
public class Java10872 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int inputNumber = Integer.parseInt(br.readLine());
        int result = 1;

        for (int i = 1; i <= inputNumber; i++) {
            result *= i;
        }

        System.out.println(result);
    }
}
