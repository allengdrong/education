import java.util.Scanner;

public class MainController {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		//1. 인사말
		System.out.println("안녕하세요!");
		System.out.println("좋은 시간 되시기를 바랍니다.");
		System.out.println("-----------------------------------------");
		
		//while문을 이용해서 무한 반복 시킨다.
		while(true) {
			
			
			//2. 위치 정보 출력
			System.out.println("\\");
			System.out.println("-----------------------------------------");
			
			//3. 메뉴를 보여준다.
			System.out.println("1.공지사항 2.게시판 3.로그인");
			System.out.println("0.종료");
			System.out.println("-----------------------------------------");	
		
			// 4. 사용자가 메뉴를 선택하는 메시지 출력
			System.out.print("메뉴 선택[1~3, 0 숫자 중에 하나 입력] -->");	
			
			// 5. 사용자가 메뉴 선택 (입력-scanner)
			String data = scanner.nextLine();
			
			System.out.println("=========================================");
			// 6. 선택한 메뉴를 처리한다.
			int menu = Integer.parseInt(data);
			switch(menu) {
			case 1:
				System.out.println("공지사항 처리함. ~~~뻥");
				break; // break - while - switch 문과 반복문을 빠져 나간다. if 문은 아니다.
			case 2:
				System.out.println("게시판 처리함. ~~~뻥");
				break;
			case 3:
				System.out.println("로그인 처리함. ~~~뻥");
				break;
			case 0: // 종료
				System.out.println("좋은 시간 되셨나요?");
				System.out.println("bye bye!");
				// 프로그램 강제 종료
				System.exit(0); // 개발자에 의한 정상 강제 종료
			default : 
				System.out.println("잘못된 메뉴를 입력하셨습니다.");
			} // end of switch()
			System.out.println("=========================================");
		}	// end of while()
		
	} // end of main()

}	// end of MainController
