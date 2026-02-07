package day6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 재귀의 귀재
// https://www.acmicpc.net/problem/25501
public class Java25501 {

    static int count; // 재귀 호출 횟수 카운트

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int inputCount = Integer.parseInt(br.readLine());

        for(int i = 0; i<inputCount; i++) {
            String inputValue = br.readLine();
            System.out.println(isPalindrome(inputValue));
        }

    }
        public static int recursion(String s, int l, int r){
            count++;  // 호출될 때마다 증가

            if(l >= r) return 1;
            else if(s.charAt(l) != s.charAt(r)) return 0;
            else return recursion(s, l+1, r-1);
        }
        public static String isPalindrome(String s){
            count = 0;  // 문자열마다 초기화
            int result = recursion(s, 0, s.length() - 1);
            return result + " " + count;
        }

}
