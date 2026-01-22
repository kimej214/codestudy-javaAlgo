package day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;

// 최소공배수
// https://www.acmicpc.net/problem/1934
public class Java1934 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());

        for (int i=0; i< count; i++) {
            String[] inputNum = br.readLine().split(" ");
            int x = Integer.parseInt(inputNum[0]);
            int y = Integer.parseInt(inputNum[1]);

            Set<Integer> xList = new TreeSet<>();
            for (int j = 1; j <= x; j++) {
                if(x % j==0){
                    xList.add(j);
                }
            }

            Set<Integer> yList = new TreeSet<>();
            for (int j = 1; j <= y; j++) {
                if(y % j==0){
                    yList.add(j);
                }
            }

            int common = 1;
            for(int value : xList) {
                if (yList.contains(value)) {
                    common = value;
                }
            }

            System.out.println(x*y/common);

        }
    }
}
