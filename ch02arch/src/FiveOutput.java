import java.util.Scanner;

	public class FiveOutput {

		public static void main(String[] args) {

			Scanner scanner = new Scanner(System.in);
			System.out.println("첫번째 숫자를 입력하세요");
			String data = scanner.nextLine();
			int number1 = Integer.parseInt(data);
			System.out.println("두번째 숫자를 입력하세요");
			data = scanner.nextLine();
			int number2 = Integer.parseInt(data);

			int number3 = number1 + number2;
			int number4 = number1 - number2;
			int number5 = number1 * number2;
			int number6 = number1 / number2;
			int number7 = number1 % number2;

			System.out.println(number1 + "+" + number2 + "="+ number3);
			System.out.println(number1 + "-" + number2 + "="+ number4);
			System.out.println(number1 + "*" + number2 + "="+ number5);
			System.out.println(number1 + "/" + number2 + "="+ number6);
			System.out.println(number1 + "%" + number2 + "="+ number7);

			scanner.close();

		}

}