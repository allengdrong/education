package com.webjjang.main.controller;

import java.util.Scanner;
// [MainController] - Controller - Service -DAO
import com.webjjang.board.controller.BoardController;
import com.webjjang.memo.controller.MemoController;
import com.webjjang.notice.controller.NoticeController;

public class MainController {
	// 데이터를 입력하는 객체
	// 객체변수 = 전역변수 = 멤버변수 = 필드 =
	static Scanner scanner = new Scanner(System.in);

	// 접근제한자 - public : 공공의, protected :다른 패키지에서는 new 금지, default: 같은 패키지에서만 사용과 상속 가능, private : 같은
	// 클래스
	// static : 고정 클래스를 사용하게 되면 static이 먼저 메모리에 올라가게 된다.
	// void : 리턴 타입 - 메서드에서만 사용 : 값이 없다.
	// main( ) : 처리문을 가지고 있는 메서드
	// String[] : 문자열 배열타입의 변수 선언 - 매개변수
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 프로그램 시작 메세지
		System.out.println("+=======================================+");
		System.out.println("+         환영합니다. 좋은 시간 되세요                  +");
		System.out.println("+=======================================+");
		// 무한 반복 시작
		while (true) {

			// 위치 출력
			System.out.println("+---------------------------------------+");
			System.out.println("+               위치 > main               +");
			System.out.println("+---------------------------------------+");
			// 메뉴 출력
			System.out.println("+---------------------------------------+");
			System.out.println("+     1.게시판  2.공지사항  3.메모장  0.종료          +");
			System.out.println("+---------------------------------------+");
			// 메뉴 입력 메세지
			System.out.print("메뉴 선택( 1~3, 0 ) --> ");
			// 메뉴 입력 - 문자열, 웹상에서 서버에서 데이터를 받으면 모두 다 문자열이 된다.
			String menu = scanner.nextLine();
			// 메뉴 처리
			switch (menu) {
				case "1":
					System.out.println("게시판 처리");
					// 게시판 컨트롤러 객체 생성하고 호출한다.
					// BoardController boardController = new BoardController();
					// boardController.execute();
					// Controller 인터페이스 객체를 전달받아서 실행해주는 메서드에서 실행을 하도록 한다.
					execute(new BoardController());
					break;
				case "2":
					System.out.println("공지사항 처리");
					// NoticeController noticeController = new NoticeController();
					// noticeController.execute();
					execute(new NoticeController());
					break;
				case "3":
					System.out.println("메모장 처리");
					// MemoController memoController = new MemoController();
					// memoController.execute();
					execute(new MemoController());
					break;
				case "0":
					System.out.println("*****************************************");
					System.out.println("*               종료합니다.               *");
					System.out.println("*****************************************");
					// 0 : 프로그래머가 계획적으로 종료를 시켰다라고 하는 의미를 담고 있는 숫자 : 강제 정상 종료
					System.exit(0);
					break;
				default:
					System.out.println("잘못된 메뉴를 선택하셨습니다.");
					break;
			}

		}
		// 무한 반복 끝
	} // end of main()

	// 컨트롤러를 실행하는 메서드
	private static void execute(Controller controller) {
		System.out.println("MainController.execute(controller)");
		// 실행하려는(전달받은 controller)클래스의 이름.execute -> 출력
		System.out.println("실행객체와 메서드 : " + controller.getClass().getSimpleName() + ".execute()");
		// 실행하려는 객체의 메서드 호출
		controller.execute();
	}

}
