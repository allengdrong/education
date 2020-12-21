import java.util.Scanner;

public class ThreeItemOp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// 숫자를 입력 받는다.
		// 60점 이상이면 합격 미만이면 불합격을 출력한다.
		System.out.println("점수를 입력하세요.");
		String data = scanner.nextLine();
		int score = Integer.parseInt(data);
		if (score >= 60)
			System.out.println("합격");
		else
			System.out.println("불합격");
		// 삼항연산자 = 조건 연산자
		// (조건)?true의처리:false의 처리
		// (score >= 60)? System.out.println("합격"):System.out.println("불합격");
		System.out.println((score >= 60) ? "합격" : "불합격");
		String result = (score >= 60) ? "합격" : "불합격";
		System.out.println(result);


	}

}
