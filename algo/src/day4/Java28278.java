package day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

//스택
//https://www.acmicpc.net/problem/28278
public class Java28278 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());

        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < count; i++) {

            String input = br.readLine();
            boolean hasSpace = input.contains(" ");

            if (!hasSpace) {
                switch (input) {
                    case "2":
                        if (list.isEmpty()) {
                            System.out.println(-1);
                        } else {
                            System.out.println(list.remove(list.size() - 1));
                        }
                        break;
                    case "3":
                        System.out.println(list.size());
                        break;
                    case "4":
                        System.out.println(list.isEmpty()? 1 : 0);
                        break;
                    case "5":
                        if (list.isEmpty()) {
                            System.out.println(-1);
                        } else {
                            System.out.println(list.get(list.size() - 1));
                        }
                        break;
                }
            } else {
                String[] command = input.split(" ");
                int inputValue = Integer.parseInt(command[1]);
                list.add(inputValue);
            }

        }
    }
}
