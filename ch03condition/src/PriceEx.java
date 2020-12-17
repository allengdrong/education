import java.util.Scanner;

public class PriceEx {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("나이를 입력하세요.");
		
		String data = scanner.nextLine();
		
		int age = Integer.parseInt(data);
		
		System.out.println("당신의 나이는 " + age + "세 입니다.");
		
		
		int price = 1250;
		if(age < 0)
			System.out.println("나이 입력 오류");
		else if(age<7)
			price = 0;
		
		else if(age<13) // 5원 단위 절삭
			price = (int)(price * 0.3) / 10 * 10 ;
		
		else if(age<19)
			price = (int)(price * 0.5) / 10 * 10 ;
		
		else if(age<65)
			; // 정상가 그대로 지불해야하므로 price 기본값으로 처리, 아무 동작이 일어나지 않는다.
		
		else
			price = 0;
		
		
		if(age < 0);
		else
		
		System.out.println("요금은 " + price + "원 입니다");
		
		System.out.println("종료됩니다.");
		
		scanner.close();
	}

}
