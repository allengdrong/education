import java.util.Scanner;

public class DivisionByZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String data = null; // 선언만 했고 주소가 없는 것으로 초기화

		// 정상적인 처리가 될때 까지 무한 반복 시킨다.
		while (true) {
			// 정상적인 처리가 되도록 예외처리를 하시오.
			try {
				// 2개의 숫자를 입력하세요.
				System.out.println("첫번째 숫자를 입력하시오.");
				data = scanner.nextLine();
				int number1 = Integer.parseInt(data);
				System.out.println("두번째 숫자를 입력하시오.");
				data = scanner.nextLine();
				int number2 = Integer.parseInt(data);

				// 앞에 숫자를 뒤에 숫자로 나눈 결과를 출력하시오.
				// System.out.println(10 / 0);
				System.out.println("첫번째 숫자 : " + number1 + " / " + "두번째숫자 : " + number2 + " = "
						+ (number1 / number2));
				break;
			} catch (ArithmeticException e) {
				// 예외처리
				// 개발자를 위한 에러 출력
				// e.printStackTrace();
				// 사용자를 위한 에러 출력
				System.out.println("두번째 숫자는 0을 입력하시면 안됩니다.");
			} catch (NumberFormatException e) {
				// 숫자가 아닌 것이 들어 왔을때 예외처리
				// 개발자
				// e.printStackTrace();
				// 사용자를 위해서
				System.out.print("숫자만 입력이 가능합니다.");

			}
		} // end of while(true)
	}

}
