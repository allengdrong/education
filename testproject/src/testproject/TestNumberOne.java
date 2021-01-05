package testproject;

import java.util.Scanner;

public class TestNumberOne {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를 입력하시오");
		String data = scanner.nextLine();
		int number1 = Integer.parseInt(data);
		int number2 = 10;
		System.out.println("입력한 숫자 + 10 = " + (number1 + number2));

	}
}
