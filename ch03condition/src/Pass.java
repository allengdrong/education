import java.util.Scanner;

public class Pass {

	public static void main(String[] args) {
		
		// 입력받는 객체 Scanner 불러온다.(생성한다.-new)
		Scanner scanner = new Scanner(System.in);
		
		
		// 점수를 입력 받는다.
		System.out.println("점수를 입력하세요.");
		String data = scanner.nextLine(); // 숫자만 입력
		// 문자열을 숫자로 변환
		int score = Integer.parseInt(data);
		
		// 만약에 점수가 60점 이상이면 합격이라고 출력한다.
		// 그렇지 않으면(60점보다 적다.) 불합격이라고 출력한다.
		// if문처리가 끝나고 else문장(그렇지 않으면)이 나오면 if문이 계속 이어지는 것이다.
		if(score >= 60)
			System.out.println("합격입니다.");
		
		else
			System.out.println("불합격입니다.");
		
		// 프로그램이 종료된다라고 출력한다.
		System.out.println("프로그램이 종료됩니다.");
		
		scanner.close();
		
	}

}