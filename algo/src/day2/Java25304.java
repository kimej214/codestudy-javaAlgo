package day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 영수증
// https://www.acmicpc.net/problem/25304
public class Java25304 {
    public static void main(String[] args) throws IOException {
        // 키보드 입력을 한 줄씩 읽기 위한 준비
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 첫줄: 영수증에 적힌 총 금액
        String totalMoneyLine = br.readLine();
        int totalMoney = Integer.parseInt(totalMoneyLine);

        // 두번째 줄: 물건 종류 개수
        String countLine = br.readLine();
        int itemTotalCount = Integer.parseInt(countLine);

        // 실제 계산된 금액을 저장할 변수
        int calculSum = 0;

        // 물건 개수만큼 반복하면서 가격 계산
        for (int i = 0; i < itemTotalCount; i++) {

            // 한 줄 입력 (예: "20000 5")
            String itemLine = br.readLine();

            // 공백 기준으로 나누기
            String[] itemInfo = itemLine.split(" ");

            int price = Integer.parseInt(itemInfo[0]); // 가격
            int count = Integer.parseInt(itemInfo[1]); // 개수

            // 가격*개수 계산해서 누적
            calculSum += price * count;
        }

        // 계산한 합계와 영수증 총액 비교
        System.out.print(calculSum == totalMoney ? "Yes" : "No");
    }
}
