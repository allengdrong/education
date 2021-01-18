/*
 * 모듈 컨트롤러 - 메인 메누를 입력하고 어떤 객체를 처리할지를 선택해서 처리해주는 객체(Controller) - 예외처리를 한다. 작성일 : 2021.01.18 작성자 :
 * 고선호
 */
package com.webjjang.board.controller;

import com.webjjang.board.service.BoardListService;
import com.webjjang.main.controller.Controller;
import com.webjjang.main.controller.ExeService;
import com.webjjang.util.Input;
import com.webjjang.util.Output;

public class BoardController implements Controller {

	@Override
	public void execute() {
		// TODO Auto-generated method stub

		// 게시판 처리를 위한 무한 루프
		while (true) {
			try {

				// 위치 정보 출력
				Output.position("main > board");
				// 메뉴 출력
				Output.menu("1.게시판리스트  2.게시판글보기  3.게시판글쓰기", "4.게시판글수정  5.게시판글삭제  0.이전메뉴");
				// 메뉴 입력
				String menu = Input.getString("메뉴 입력");
				// 메뉴 처리
				switch (menu) {
					case "1":
						ExeService.execute(new BoardListService(), null);
						break;
					case "2":
						break;
					case "3":
						break;
					case "4":
						break;
					case "5":
						break;
					case "0":
						// 이전메뉴
						return;
					default:
						break;
				} // end of switch()

			} catch (Exception e) {

			} // end of try{} catch() {}

		} // end of while

	}

}
