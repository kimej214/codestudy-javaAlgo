package day7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 약수
// https://www.acmicpc.net/problem/1037
public class Java1037 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int inputCount = Integer.parseInt(br.readLine());

        // StringTokenizer st = new StringTokenizer(br.readLine());
        String[] number = br.readLine().split(" ");

        int min = Integer.parseInt(number[0]); // Integer.MAX_VALUE
        int max = Integer.parseInt(number[0]); // Integer.MIN_VALUE

        for(int i =0; i<inputCount; i++) {
            int value = Integer.parseInt(number[i]); // Integer.parseInt(st.nextToken())
            if(value < min) {
                min = value;
            }
            if(value > max) {
                max = value;
            }
        }
        System.out.println(max*min);
    }
}
