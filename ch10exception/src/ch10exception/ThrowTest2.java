package ch10exception;

import java.util.Scanner;

public class ThrowTest2 {

	static Scanner scanner = new Scanner(System.in);

	static int a, b;

	public static void main(String[] args) {
		try {
			// 정상처리
			// 1. 데이터를 받는다.
			inData();
			// 2. 나누기 연산을 한다.
			int result = divOp();
			// 3. 결과를 출력한다.
			print(result);
		} catch (NumberFormatException e) {
			// 예외처리
			System.out.println("숫자만 입력하셔야 합니다.");
		} catch (ArithmeticException e) {
			// 예외처리
			System.out.println("두번째 숫자는 0이 아니여야만 합니다. 모든 숫자는 0으로 나눌수 없습니다.");
		} catch (Exception e) {
			// 예외처리
			System.out.println("나누기 연산 수행 중 오류가 발생되었습니다.");
		}

		System.out.println("프로그램 종료");
	}

	// 데이터를 입력 받는 메서드
	static void inData() throws NumberFormatException {
		// 첫번째 데이터 받기
		System.out.println("첫번째 숫자를 입력하세요.");
		String data = scanner.nextLine();
		a = Integer.parseInt(data);

		// 두번째 데이터 받기
		System.out.println("두번째 숫자를 입력하세요.");
		data = scanner.nextLine();
		b = Integer.parseInt(data);
	}

	// 나누기를 연산하는 메서드
	static int divOp() throws ArithmeticException {
		return a / b;
	}

	// 결과를 출력하는 메서드
	static void print(int result) throws Exception {
		System.out.println(a + " / " + b + " = " + result);

	}
}
