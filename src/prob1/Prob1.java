package prob1;

import java.util.Scanner;

public class Prob1 {
	public static void main(String[] args) {

		int[] money = { 50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1 }; // 배열을
																			// 건들면
																			// 안댐
		System.out.println("금액을 입력하시오");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();

		System.out.println("금액" + number);
		System.out.println();

		for (int i = 0; i < money.length; i++) {

			int result = number / money[i];
			System.out.println(money[i] + "원:" + result + "개");
			number = number - (result * money[i]);

		}
		
		scanner.close();

	}
}