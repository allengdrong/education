/*
 * 모듈 컨트롤러 - 메인 메누를 입력하고 어떤 객체를 처리할지를 선택해서 처리해주는 객체(Controller) - 예외처리를 한다. 작성일 : 2021.01.18 작성자 :
 * 고선호
 */
package com.webjjang.board.controller;

import java.util.List;
import com.webjjang.board.service.BoardListService;
import com.webjjang.board.service.BoardViewService;
import com.webjjang.board.service.BoardWriteService;
import com.webjjang.board.vo.BoardVO;
import com.webjjang.main.controller.Controller;
import com.webjjang.main.controller.ExeService;
import com.webjjang.print.BoardPrint;
import com.webjjang.util.Input;
import com.webjjang.util.Output;

public class BoardController implements Controller {

	@SuppressWarnings("unchecked")
	@Override
	public void execute() {
		// TODO Auto-generated method stub

		// 게시판 처리를 위한 무한 루프
		while (true) {
			try {

				// 위치 정보 출력
				Output.position("main > board");
				// 메뉴 출력
				Output.menu("1.게시판리스트  2.게시판글보기  3.게시판글쓰기", "4.게시판글수정  5.게시판글삭제  0.이전메뉴",
						"글보기, 글수정, 글삭제를 하시려면 '1.게시판리스트'에서 먼저 글번호 확인요망");
				// 메뉴 입력
				String menu = Input.getString("메뉴 입력");
				// 메뉴 처리
				switch (menu) {
					case "1":
						// List<BoardVO>
						// 1. DB에서 데이터 가져오기
						List<BoardVO> list =
								(List<BoardVO>) ExeService.execute(new BoardListService(), null);
						// 2. 데이터 출력하기 - 데이터 가져오기에 실패(예외가 발생)하면 출력하러 가지 않는다.
						BoardPrint.print(list);
						break;
					case "2":
						// BoardVO
						// 0. 가져올 글 번호를 받는다. -> 있는 글번호 확인을 위해서 리스트를 먼저 실행해야 한다.(수동)
						long no = Input.getLong("보여 줄 글번호 입력");
						// 1. DB에서 데이터를 가져오기
						BoardVO vo = (BoardVO) ExeService.execute(new BoardViewService(), no);
						// 2. 데이터 출력하기
						BoardPrint.print(vo);
						break;
					case "3":
						// 1. 데이터를 수집해서 vo 객체에 넣는다.
						BoardVO invo = new BoardVO();
						invo.setTitle(Input.getString("제목"));
						invo.setContent(Input.getString("내용"));
						invo.setWriter(Input.getString("작성자"));
						// 2. BoardWriteService에 전달
						int writeResult =
								(Integer) ExeService.execute(new BoardWriteService(), invo);
						// 3. 결과에 대한 출력
						BoardPrint.print(writeResult, "게시판 글쓰기");
						break;
					case "4":
						// 1.~3. 글보기 -> 중복 -> 메서드 만들어야 하나 복사 붙여넣기로 해결하기로 한다.
						// 1. 수정할 글번호를 받는다.
						// 2. 수정할 데이터를 DB에서 가져온다.- 글보기 - BoardViewService
						// 가져온 데이터를 여러번(2번이상) 사용할때 반드시 변수에 저장해서 사용하세요.
						BoardVO updateVO = (BoardVO) ExeService.execute(new BoardViewService(),
								Input.getLong("수정할 글번호 입력"));
						// 3. 화면에 뿌린다. - 글보기 출력 -> 수정처리 while 안에서 출력

						// 4. 수정처리를 한다. -> 메서드 작성
						updateBoardVO(updateVO);
						System.out.println("BoardController.execute() 수정완료 후 vo : " + updateVO);

						// 5. 수정한 내용을 DB에 저장 -> BoardUpdateService

						// 6. 수정결과를 출력한다. print(result, msg)
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

	} // end of execute()

	// 수정을 위한 객체의 데이터 수정
	private void updateBoardVO(BoardVO vo) throws Exception {
		Output.title("게시글 수정을 위한 데이터 수정 진행");
		while (true) {
			BoardPrint.print(vo);
			Output.menu("1.제목  2.내용  3.작성자", "0.수정 완료(DB적용) -1.수정 취소");
			String menu = Input.getString("항목 선택");
			switch (menu) {
				case "1":
					vo.setTitle(Input.getString("제목"));
					break;
				case "2":
					vo.setContent(Input.getString("내용"));
					break;
				case "3":
					vo.setWriter(Input.getString("작성자"));
					break;
				case "0":
					return;
				case "-1":
					throw new Exception("게시판 수정이 취소되었습니다.");
				default:
					Output.printWithLine("잘못된 항목 번호 선택 - 항목 번호를 확인하세요.", "-", 50);
					break;
			}
		}
	}

}
