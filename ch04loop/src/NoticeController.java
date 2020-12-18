import java.util.Scanner;

public class NoticeController {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		// 입력 객체 불러온다. - 객체 생성 - new
		
		// 1. 환영인사 - 공지사항에 들어오심.
		System.out.println("안녕하세요!");
		System.out.println("공지사항 게시판입니다.\r");
		
		// 무한반복 - while
		while(true) {
			
			// 2. 위치 출력 - "/공지사항
			System.out.println("<공지사항 게시판>");
			
			System.out.println("---------------------------");
			
			// 3. 메뉴 출력
				// 1.리스트 2.글쓰기 3.글보기
				// 4.글수정 5.글삭제 0.종료 - 강제 정상 종료
			System.out.println("1.리스트 2.글쓰기 3.글보기");
			System.out.println("4.글수정 5.글삭제 0.종료");
			System.out.println("---------------------------");
			
			// 4. 메뉴 입력 메시지
			System.out.print("메뉴 선택 [1~5], 0 숫자 중에 하나 입력 :");
			
			// 5. 메뉴 입력
			String data = scanner.nextLine();
			System.out.println("===========================");
			
			// 6. 입력한 메뉴 처리 뻥치기 - switch()
			int menu = Integer.parseInt(data);
			switch(menu) {
			case 1:
				System.out.println("공지사항 리스트 입니다.\r");
				break;
			case 2:
				System.out.println("글쓰기\r");
				break;
			case 3:
				System.out.println("글보기\r");
				break;
			case 4:
				System.out.println("글수정\r");
				break;
			case 5:
				System.out.println("글삭제\r");
				break;
			case 0:
				System.out.println("공지사항 게시판을 종료합니다.\r");
				System.exit(0);
			default:
				System.out.println("잘못된 메뉴를 입력하셨습니다.\r");

			}
			System.out.println("===========================\r");

		
		}
		
	}
	
}
