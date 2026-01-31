package day5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

//피보나치 수 5
//https://www.acmicpc.net/problem/10870
public class Java10870 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());

        List<Integer> result = new ArrayList<>();
        result.add(0);
        result.add(1);

        for (int i = 2; i <= input; i++) {
            result.add(result.get(i - 1) + result.get(i - 2));
        }

        System.out.println(result.get(input));

    }
}
