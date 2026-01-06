package day1;

// 1998년생인 내가 태국에서는 2541년생?!
// https://www.acmicpc.net/problem/18108

import java.util.Scanner;

public class java18108 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String year = sc.nextLine();
        int buddhistEra = Integer.parseInt(year);
        int diffYear = 543;

        System.out.println(buddhistEra-diffYear);
    }

}
