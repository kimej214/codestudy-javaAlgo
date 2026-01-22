package day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeSet;

//회사에 있는 사람
//https://www.acmicpc.net/problem/7785
public class Java7785 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        TreeSet<String> list = new TreeSet<>();

        for (int i = 0; i < num; i++) {
            String[] member = br.readLine().split(" ");
            String name = member[0];
            String commute = member[1];

            if (commute.equals("enter")) {
                list.add(name);
            } else {
                list.remove(name);
            }
        }

        for (String name : list.descendingSet()) {
            System.out.println(name);
        }
    }
}
