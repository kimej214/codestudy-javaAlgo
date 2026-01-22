package day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;

// 수 정렬하기
// https://www.acmicpc.net/problem/2750
public class Java2750 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numLine = Integer.parseInt(br.readLine());
        Set<Integer> list = new TreeSet<>();

        for(int i=0; i<numLine ; i++){
            int numText = Integer.parseInt(br.readLine());
            list.add(numText);
        }
        for (int value : list) {
            System.out.println(value);
        }
    }
}
