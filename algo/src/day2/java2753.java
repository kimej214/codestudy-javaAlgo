package day2;

import java.util.Scanner;

// 윤년
// https://www.acmicpc.net/problem/2753
public class java2753 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        boolean leapYear = (year%4==0 && year%100!=0) || year%400==0;

        System.out.println(leapYear ? 1 : 0);
    }

}
