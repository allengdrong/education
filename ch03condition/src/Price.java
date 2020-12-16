import java.util.Scanner;

/*
 * 지하철 요금 계산하는 프로그램
 * 연령을 입력합니다.
 * age < 0 : 입력오류
 * age 7세 미만 : 무료
 * age 7세 이상 13세 미만 : 30%
 * age 13세 이상 19세 미만 : 50%
 * age 19세 이상 65세 미만 : 1,250
 * age 65세 이상 : 무료
 */

public class Price {

	public static void main(String[] args) {
		// 입력받는 객체 생성
		Scanner scanner = new Scanner(System.in);
		
		// 메시지 출력
			System.out.println("나이를 입력하세요.");
			
		// 나이 입력한다.
		
		// String을 int 바꾼다.
		String data = scanner.nextLine();
		int age = Integer.parseInt(data);
		
		// 입력 받은 나이를 출력한다.
			System.out.println("나이는 " + age + "세 입니다.");
		
		// 나이에 맞는 요금을 계산한다.
		String price = "1250"; // 기본값 1250원
		
		
		if(age < 0) price = "입력오류";
		else if(age < 7) price = "무료";
		else if(age < 13) price = Integer.toString(Integer.parseInt(price) * 3 / 10) + "원";
		else if(age < 19) price = Integer.toString(Integer.parseInt(price) * 5 / 10) + "원";
		else if(age < 65) price = "1250원";
		else price = "무료";
		
		
		// 요금을 출력한다.
			System.out.println("요금은 " + price + "입니다.");
		
		// 종료 메시지
			System.out.println("프로그램 종료");
			
		// 입력객체 닫기
		scanner.close();

	}

}
