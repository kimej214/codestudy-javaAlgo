package day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//알파벳 찾기
//https://www.acmicpc.net/problem/10809
public class java10809 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String textLine = br.readLine();

        int length = textLine.length();
        char[] text = textLine.toCharArray();

        int[] alphabet = new int[26];
        Arrays.fill(alphabet, -1);

        for (int i = 0; i < length; i++) {
            char current = text[i];

            int index = current - 'a';

            if (alphabet[index] == -1) {
                alphabet[index] = i;
            }
        }

        for (int i = 0; i < 26; i++) {
            System.out.print(alphabet[i] + " ");
        }
    }

}
