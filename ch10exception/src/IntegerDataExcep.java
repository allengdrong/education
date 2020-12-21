import java.util.Scanner;

public class IntegerDataExcep {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		// 숫자 데이터를 하나 받아서 출력하는 프로그램 작성 - 예외처리
		while (true) {
			try {
				// 숫자 데이터 하나를 문자열로 입력 받고
				System.out.println("숫자를 입력하세요.");
				String data = scanner.nextLine();

				// 숫자로 변환한다.
				int number1 = Integer.parseInt(data);
				// 숫자를 출력한다.
				System.out.println("입력한 숫자 : " + number1);
				break;
				// 예외처리
			} catch (NumberFormatException e) {

				// 숫자 데이터가 아닙니다. 출력한다.
				System.out.println("숫자만 입력이 가능합니다.");

			}

		}
	}

}
