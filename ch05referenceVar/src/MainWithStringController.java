import java.util.Scanner;

public class MainWithStringController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		// 1. 인사
		System.out.println("안녕하세요.");
		// 무한반복 ------ 시작
		while (true) {
			// 메뉴 출력
			System.out.println("1.공지사항 2.게시판 3.로그인 0.종료");
			// 메뉴 선택
			String menu = scanner.nextLine();
			// 메뉴 처리
			/*
			 * if (menu.equals("1")) System.out.println("공지사항 처리함."); else if (menu.equals("2"))
			 * System.out.println("게시판 처리함."); else if (menu.equals("3"))
			 * System.out.println("로그인 처리함."); else if (menu.equals("0")) {
			 * System.out.println("종료합니다."); scanner.close(); System.exit(0); // 개발자에 의한 정상 종료 }
			 * else System.out.println("잘못된 메뉴를 선택했습니다.");
			 */

			// 무한반복 ------ 끝

			// switch case로 코딩
			switch (menu) {
				case "1":
					System.out.println("공지사항 처리함.");
					break;
				case "2":
					System.out.println("게시판 처리함.");
					break;
				case "3":
					System.out.println("로그인 처리함.");
					break;
				case "0":
					System.out.println("종료합니다.");
					scanner.close();
					System.exit(0);
				default:
					System.out.println("오류.");
					break;
			} // end of switch
		}
	}

}
