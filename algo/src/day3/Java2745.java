package day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 진법 변환
// https://www.acmicpc.net/problem/2745
public class Java2745 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        String value = st.nextToken();
        int numeralSystem = Integer.parseInt(st.nextToken());

        char[] text = value.toCharArray();
        int placeValue = 0;

        for (char c : text) {
            int digit;

            if (c >= '0' && c <= '9') {
                digit = c - '0';
            } else {
                digit = c - 'A' + 10;
            }
            placeValue = placeValue * numeralSystem + digit;
        }

        System.out.println(placeValue);
    }
}
