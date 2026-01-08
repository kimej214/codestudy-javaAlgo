package day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//팰린드롬인지 확인하기
//https://www.acmicpc.net/problem/10988
public class java10988 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String text = br.readLine();
        int length = text.length();

        char[] reversedText = new char[length];

        // 뒤집기
        for (int i = length - 1; i >= 0; i--) {
            reversedText[length - 1 - i] = text.charAt(i);
        }

        boolean isPalindrome = true;

        // 원본 문자열과 뒤집은 배열 비교
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) != reversedText[i]) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println(isPalindrome ? 1 : 0);
    }
}
