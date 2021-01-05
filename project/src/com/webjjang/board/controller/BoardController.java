package com.webjjang.board.controller;

import java.util.List;
import java.util.Scanner;
import com.webjjang.board.service.BoardListService;
import com.webjjang.board.service.BoardViewService;
import com.webjjang.board.vo.BoardVO;
import com.webjjang.main.controller.Controller;

// [MainController] - Controller - Service -DAO
public class BoardController implements Controller {

	// 입력하는 객체 생성
	// 변수 = 지역변수 = 인스턴스변수(static이 없음) = 필드 = 멤버변수 = 속성
	Scanner scanner = new Scanner(System.in);

	// 모든 컨트롤러의 적용되는 통일된 메서드 형식 - 약속
	@Override // 재정의해서 사용하는 건지 확인해 주는 오버라이드 어노테이션
	public void execute() {
		// System.out.println(getClass().getSimpleName() + ".execute()");
		// System.out.println("BoardController.execute()");
		// 게시판의 처리 무한 반복 - 시작
		while (true) {

			try {
				// 위치 정보 출력
				System.out.println("+---------------------------------------+");
				System.out.println("+           위치 > main > 게시판                      +");
				System.out.println("+---------------------------------------+");
				// 메뉴 출력
				System.out.println("+---------------------------------------+");
				System.out.println("+        1.리스트  2.글보기  3.글쓰기                   +");
				System.out.println("+        4.글수정  5.글삭제  0.이전메뉴                +");
				System.out.println("+---------------------------------------+");
				// 메뉴 입력 메세지 출력
				System.out.print("메뉴 선택( 1~5, 0 ) --> ");
				// 메뉴 입력
				String menu = scanner.nextLine();
				// 메뉴에 대한 처리
				switch (menu) {
					case "1":
						System.out.println("게시판 리스트 처리");
						// 1. DB에서 여러개의 데이터를 가져오자 --> 만약에 오류가 나면 catch로 이동한다. 2. 출력은 실행되지 않는다.
						// --> BoardListService 생성하고 호출
						BoardListService boardListService = new BoardListService();
						List<BoardVO> list = boardListService.service();
						// 2. 가져온 데이터를 출력하자. -> 작성 소스 길이가 길다.(복잡) 메서드나 클래스를 만든다. -> 현재는 메서드를 만든다.
						print(list);
						break;
					case "2":
						// 1. DB에서 한개의 데이터를 가져오자 --> 만약에 오류가 나면 catch로 이동한다. 2. 출력은 실행되지 않는다.
						// 2. 가져온 데이터를 출력하자.
						System.out.println("게시판 글보기 처리");
						// 보여줄 글 번호를 받는다.
						long no = getNo();
						// DB에서 데이터를 가져온다. - Controller - Service - DAO
						BoardViewService boardViewService = new BoardViewService();
						BoardVO vo = boardViewService.service(no);
						print(vo);
						break;
					case "3":
						System.out.println("게시판 글쓰기 처리");
						// 1. 데이터를 입력한다. -> 오류가 나면 catch로 이동한다. 2. DB에 저장되는 부분은 실행되지 않는다.
						// 2. DB에 저장하자.
						break;
					case "4":
						System.out.println("게시판 글수정 처리");
						break;
					case "5":
						System.out.println("게시판 글삭제 처리");
						break;
					case "0":
						return; // 메서드를 빠져나가 호출한 곳으로 간다.
					// break;
					// switch, 반복문을 빠져 나간다.
					default:
						System.out.println("잘못된 메뉴를 선택하셨습니다.");
						break;

				} // end of switch

			} catch (Exception e) {

			}
		} // end of while
			// 게시판의 처리 무한 반복 - 끝
	}

	private List<BoardVO> boardListService() {
		// TODO Auto-generated method stub
		return null;
	}

	// 리스트를 출력하는 메서드
	private void print(List<BoardVO> list) {
		// 실행하는 위치와 전달받은 데이터의 테스트 출력
		System.out.println("BoardController.print().list : " + list);
		if (list != null && list.size() > 0) {
			// 데이터가 담겨져 있는 경우 출력을 한다.
			System.out.println(
					"+-------------------------------------------------------------------------------+");
			System.out.println(
					"     글번호         /       제목           /         작성자             /       작성일            /  조회수     ");
			System.out.println(
					"+-------------------------------------------------------------------------------+");
			// 데이터가 있는 만큼 모두 반복처리 한다.
			for (BoardVO vo : list) {
				System.out.println("  " + vo.getNo() + " / " + vo.getTitle() + " / "
						+ vo.getWriter() + " / " + vo.getWriteDate() + " / " + vo.getHit());
			}
			System.out.println(
					"-----------------------------------------------------------------------");
		} else { // 리스트가 null이거나 데이터가 담겨 있지 않는 경우
			System.out.println("+==============================+");
			System.out.println("      데이터가 존재하지 않습니다.      ");
			System.out.println("+==============================+");
		}
	}

	// 글보기를 출력하는 메서드
	private void print(BoardVO vo) {
		System.out.println("BoardController.print().vo : " + vo);
		System.out.println("+==============================+");
		System.out.println(" 글번호 : " + vo.getNo());
		System.out.println(" 제목 : " + vo.getTitle());
		System.out.println(" 내용 : " + vo.getContent());
		System.out.println(" 작성자 : " + vo.getWriter());
		System.out.println(" 작성일 : " + vo.getWriteDate());
		System.out.println(" 조회수 : " + vo.getHit());
		System.out.println("+==============================+");
	}

	private long getNo() {
		System.out.print("보여줄 글 번호를 입력하시오 -> ");
		// 데이터 입력 받기 long
		while (true) {
			try {
				String data = scanner.nextLine();
				return Long.parseLong(data);
			} catch (Exception e) {
				System.out.println(" <<< 숫자만 입력하셔야 합니다. >>> ");
			}

		}
	}


}
