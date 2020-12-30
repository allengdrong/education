package ch10exception;

import java.util.Scanner;

public class ThrowTest {

	static Scanner scanner = new Scanner(System.in);

	static int a, b;

	public static void main(String[] args) {
		// 1. 데이터를 받는다.
		inData();
		// 2. 나누기 연산을 한다.
		int result = divOp();
		// 3. 결과를 출력한다.
		print(result);
	}

	// 데이터를 입력 받는 메서드
	static void inData() {
		try {
			// 정상처리
			// 첫번째 데이터 받기
			System.out.println("첫번째 숫자를 입력하세요.");
			String data = scanner.nextLine();
			a = Integer.parseInt(data);

			// 두번째 데이터 받기
			System.out.println("두번째 숫자를 입력하세요.");
			data = scanner.nextLine();
			b = Integer.parseInt(data);
		} catch (NumberFormatException e) {
			// 예외처리
			// 개발자 위한 코드
			e.printStackTrace();
			// 사용자를 위한 코드
			System.out.println("숫자만 입력하셔야 합니다.");
		}
	}

	// 나누기를 연산하는 메서드
	static int divOp() {
		try {
			// 정상처리
			return a / b;
		} catch (ArithmeticException e) {
			// 예외처리
			// 개발자
			e.printStackTrace();
			// 사용자
			System.out.println("숫자 0으로 나눌 수는 없습니다.");
			return -9999;
		}
	}

	// 결과를 출력하는 메서드
	static void print(int result) {
		System.out.println(a + " / " + b + " = " + result);

	}
}
