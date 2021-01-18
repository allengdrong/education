/*
 * 메인 메누를 입력하고 어떤 객체를 처리할지를 선택해서 처리해주는 객체(Controller)
 */

package com.webjjang.main.controller;

import com.webjjang.board.controller.BoardController;
import com.webjjang.util.Input;
import com.webjjang.util.Output;

public class MainController {

	static {
		System.out.println("MainController 실행 시작");
		// 프로젝트가 시작과 동시에 처리해야할 내용을 여기에 넣는다.
		// DB 드라이버 확인
		try {
			// 1. 드라이버 확인을 한다. - 모든 DB처리 프로그램에서 처리를 하지 않아도 된다.
			Class.forName("com.webjjang.util.DBInfo");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 프로그램 시작하면서 환영인사
		Output.greeting("환영합니다.");

		// 메인처리 무한 루프
		while (true) {
			// 위치 출력
			Output.position("main");
			// 메뉴 출력
			Output.menu("1.공지사항  2.이미지게시판  3.질문답변", "4.게시판  5.메시지  6.로그인", "0.종료");
			// 메뉴 입력
			String menu = Input.getString("메뉴 입력");
			// 메뉴 처리
			switch (menu) {
				case "1":
					System.out.println("1.공지사항 처리");
					break;
				case "2":

					break;
				case "3":

					break;
				case "4":
					System.out.println("4. 게시판 처리");
					execute(new BoardController());
					break;
				case "5":

					break;
				case "6":

					break;
				case "0":
					// 작별인사
					Output.greeting("사용해 주셔서 감사합니다.");
					// 종료
					System.exit(0);
				default:

					break;
			}
		} // end of while


	} // end of main()

	// moduleController를 실행하는 메서드 - 인터페이스
	private static void execute(Controller controller) {
		Output.exePos(controller.getClass().getSimpleName() + ".execute()");
		controller.execute();
	}

}
