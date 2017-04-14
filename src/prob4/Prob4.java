package prob4;

import java.util.Scanner;

public class Prob4 {

	public static void main(String[] args) {

		char[] c1 = reverse("Hello World");
		printCharArray(c1);

		char[] c2 = reverse("java programming!");
		printCharArray(c2);

	}

	public static char[] reverse(String str) {

		int length = str.length();
		char[] result = str.toCharArray();
		char[] change = str.toCharArray();
		int j = length - 1;

		// System.out.print(length);

		for (int i = 0; i < length; i++) {

			change[i] = result[j];
			j--;

		}

		return change;
		/* 코드를 완성합니다 */
	}

	public static void printCharArray(char[] array) {

		for (int i = 0; i < array.length; i++) {

			System.out.print(array[i]);

		}

		System.out.println();
	}
}
