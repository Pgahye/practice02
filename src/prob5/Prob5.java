package prob5;

import java.util.Random;
import java.util.Scanner;

public class Prob5 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in); // 표준입력
		int count = 1;

		Random r = new Random();
		int k = r.nextInt(100) + 1;

		int min = 1;
		int max = 100;

		System.out.println("수를 결정하였습니다. 맞추어보세요.");
		while (true) {

			System.out.println(min + "-" + max);
			System.out.print(count + ">>");
			int number = scanner.nextInt();// 57

			if (number == k) {

				System.out.println("맞았습니다");
				System.out.println("다시하겠습니까??(y/n)");
				String answer = scanner.next();

				if (answer.equals("y")) {

					k = r.nextInt(100) + 1;
					min = 1;
					max = 100;
					count = 1;
					System.out.println(min + "-" + max);
					System.out.print(count + ">>");
					number = scanner.nextInt();// 57
					if (number < k && number >= min && number <= max) {

						min = number;
						System.out.println("더높게");

					}
					if (number > k && number >= min && number <= max) {

						max = number;
						System.out.println("더낮게");
					}
				} else {
					break;
				}

			} else {

				if (number < k && number >= min && number <= max) {

					min = number;
					System.out.println("더높게");

				}
				if (number > k && number >= min && number <= max) {

					max = number;
					System.out.println("더낮게");
				}

			}

			count++;

		}

	}

}