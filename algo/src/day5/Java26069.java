package day5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

//붙임성 좋은 총총이
//https://www.acmicpc.net/problem/26069
public class Java26069 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int inputLineCount = Integer.parseInt(br.readLine());

        Set<String> dance = new HashSet<>();
        dance.add("ChongChong");

        for (int i = 0; i < inputLineCount; i++) {
            String[] line = br.readLine().split(" ");
            String a = line[0];
            String b = line[1];

            if (dance.contains(a) || dance.contains(b)) {
                dance.add(a);
                dance.add(b);
            }
        }

        System.out.println(dance.size());
    }
}
