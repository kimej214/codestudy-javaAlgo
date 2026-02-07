package day6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.NoSuchElementException;

// 하노이 탑 이동 순서
// https://www.acmicpc.net/problem/11729
public class Java11729 {

    static StringBuilder sb = new StringBuilder();

    static void push(int[] x, int[] topRef, int y) {
        int top = topRef[0];
        if (top < x.length) {
            x[top] = y;
            topRef[0] = top + 1;
        } else {
            throw new IllegalStateException();
        }
    }

    static int pop(int[] x, int[] topRef) {
        int top = topRef[0];
        if (top == 0) throw new NoSuchElementException();
        int result = x[top - 1];
        x[top - 1] = 0;
        topRef[0] = top - 1;
        return result;
    }

    // 스택을 실제로 움직이면서 출력까지 같이 하는 재귀
    static void move(int n,
                     int[] from, int[] fromTop, int fromId,
                     int[] via,  int[] viaTop,  int viaId,
                     int[] to,   int[] toTop,   int toId) {

        if (n == 1) {
            int disk = pop(from, fromTop);
            push(to, toTop, disk);
            sb.append(fromId).append(' ').append(toId).append('\n');
            return;
        }

        move(n - 1, from, fromTop, fromId, to, toTop, toId, via, viaTop, viaId);

        int disk = pop(from, fromTop);
        push(to, toTop, disk);
        sb.append(fromId).append(' ').append(toId).append('\n');

        move(n - 1, via, viaTop, viaId, from, fromTop, fromId, to, toTop, toId);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        int[] a = new int[num];
        int[] b = new int[num];
        int[] c = new int[num];

        // top을 값 하나 담는 배열로 두고 참조처럼 넘김
        int[] topA = new int[]{0};
        int[] topB = new int[]{0};
        int[] topC = new int[]{0};

        // 초기 상태: 1번 기둥에 큰 것부터 아래로 쌓기
        for (int disk = num; disk >= 1; disk--) {
            push(a, topA, disk);
        }

        long moves = (1L << num) - 1;
        sb.append(moves).append('\n');

        move(num, a, topA, 1, b, topB, 2, c, topC, 3);

        System.out.print(sb.toString());
    }
}