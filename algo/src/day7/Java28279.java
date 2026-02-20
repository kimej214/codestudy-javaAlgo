package day7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

// 덱 2
// https://www.acmicpc.net/problem/28279
public class Java28279 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int commandCount = Integer.parseInt(br.readLine());

        List<Integer> deque = new LinkedList<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < commandCount; i++) {
            String command = br.readLine();
            boolean hasSpace = command.contains(" ");

            if (!hasSpace) {
                switch (command) {
                    case "3":
                        if (deque.isEmpty()) {
                            sb.append(-1).append('\n');
                        } else {
                            int first = deque.remove(0);
                            sb.append(first).append('\n');
                        }
                        break;

                    case "4":
                        if (deque.isEmpty()) {
                            sb.append(-1).append('\n');
                        } else {
                            int last = deque.remove(deque.size() - 1);
                            sb.append(last).append('\n');
                        }
                        break;

                    case "5":
                        sb.append(deque.size()).append('\n');
                        break;

                    case "6":
                        sb.append(deque.isEmpty() ? 1 : 0).append('\n');
                        break;

                    case "7":
                        if (deque.isEmpty()) {
                            sb.append(-1).append('\n');
                        } else {
                            sb.append(deque.get(0)).append('\n');
                        }
                        break;

                    case "8":
                        if (deque.isEmpty()) {
                            sb.append(-1).append('\n');
                        } else {
                            sb.append(deque.get(deque.size() - 1)).append('\n');
                        }
                        break;
                }
            } else {
                String[] input = command.split(" ");
                int inputCommand = Integer.parseInt(input[0]);
                int inputValue = Integer.parseInt(input[1]);

                if (inputCommand == 1) {
                    deque.add(0, inputValue);
                } else {
                    deque.add(deque.size(), inputValue);
                }
            }
        }

        System.out.print(sb.toString());
    }
}
