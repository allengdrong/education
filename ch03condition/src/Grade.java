import java.util.Scanner;

//점수를 받아서 평점을 내는 프로그램
// ~ 0 : 입력 오류
// 0 <= score < 60 : F -> 0<= && score < 60
// 60 <= score < 70 : D
// 70 <= score < 80 : C
// 80 <= score < 90 : B
// 90 <= score < 100 : A
// 100 < score : 입력 오류

public class Grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 입력 받는 객체(Scanner)를 생성한다.
		Scanner scanner = new Scanner(System.in);
		
		
			// 점수를 입력 받는다.
			System.out.println("점수를 입력하세요.");
		String data = scanner.nextLine();
		
		// 숫자로 변환한다.
		int score = Integer.parseInt(data);
		
			//점수를 출력
			System.out.println("점수는 " + score + " 입니다.");
		
		
		//평점을 구한다.
		String grade = "";
	
		// ~ 0 : 입력 오류
		// 0 <= score < 60 : F -> 0<= && score < 60
		// 60 <= score < 70 : D
		// 70 <= score < 80 : C
		// 80 <= score < 90 : B
		// 90 <= score < 100 : A
		// 100 < score : 입력 오류
		if(score < 0 ) grade = "입력오류";
		else if(0 <= score && score < 60) grade = "F";
		else if(60 <= score && score < 70) grade = "D";
		else if(70 <= score && score < 80) grade = "C";
		else if(80 <= score && score < 90) grade = "B";
		else if(90 <= score && score <= 100) grade = "A";
		else if(score > 100) grade = "입력오류";
		
		
			// 구한 평점을 출력한다.
			System.out.println("학점은 " + grade + " 입니다.");
		
			//프로그램 종료 메세지 출력
			System.out.println("프로그램 종료");
			
			grade = "";
			if(score < 0 ) grade = "입력오류";
			else if(score < 60) grade = "F";
			else if(score < 70) grade = "D";
			else if(score < 80) grade = "C";
			else if(score < 90) grade = "B";
			else if(score <= 100) grade = "A";
			else grade = "입력오류";
			
			System.out.println("학점은 " + grade + " 입니다.");
			
			//프로그램 종료 메세지 출력
			System.out.println("프로그램 종료");
		
			scanner.close();
	}

}
