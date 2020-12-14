import java.util.Scanner;

	// 
	public class InputTwoNumberAndAddOutput{

		// 시작하는 main() 만들기
		// args - arguments - 논쟁에 대한 결정이 되어지는 백데이터
		// [] - 여러개 - 배열 - String[] - 문자열 여러개
		public static void main(String[] args) {

			// 입력 받는 객체 생성 - 2 번 입력하는 데이터를 아래 객체로 다 받는다.

			Scanner scanner = new Scanner(System.in);
			System.out.println("첫번째 숫자를 입력하세요:");
			String data = scanner.nextLine();

			// data 는 숫자로 입력을 해야 오류가 나지 않는다. Integer.parseInt(문자열)

			int number1 = Integer.parseInt(data);
			System.out.println("두번째 숫자를 입력하세요:");
			data = scanner.nextLine();
			int number2 = Integer.parseInt(data);
			int number3 = number1 + number2;

			// 문자열인 경우 "+" 연산은 이어 붙이기가 된다.

			System.out.println(number1 + " + " + number2 + " = " + number3);
	}

}