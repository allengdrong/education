package project.portfolio.board.controller;

import java.util.List;
import com.webjjang.util.Input;
import com.webjjang.util.Output;
import project.portfolio.board.service.BoardDeleteService;
import project.portfolio.board.service.BoardListService;
import project.portfolio.board.service.BoardUpdateService;
import project.portfolio.board.service.BoardViewService;
import project.portfolio.board.service.BoardWriteService;
import project.portfolio.board.vo.BoardVO;
import project.portfolio.print.BoardPrint;

public class BoardController {

	static {
		System.out.println("BoardController 실행 시작");
		try {
			Class.forName("project.portfolio.util.DBInfo");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		Output.greeting("환영합니다");

		while (true) {
			try {
				Output.position("게시판입니다.");
				Output.menu("1.리스트 2.글보기 3.글쓰기", "4.글수정 5.글삭제 0.이전메뉴");
				String menu = Input.getString("메뉴 입력");

				switch (menu) {
					case "1":
						System.out.println("1.게시판 처리");
						List<BoardVO> list =
								(List<BoardVO>) ExeService.execute(new BoardListService(), null);
						BoardPrint.print(list);
						break;
					case "2":
						long no = Input.getLong("보여 줄 글번호 입력");
						BoardVO vo = (BoardVO) ExeService.execute(new BoardViewService(), no);
						BoardPrint.print(vo);
						break;
					case "3":
						BoardVO invo = new BoardVO();
						invo.setTitle(Input.getString("제목"));
						invo.setContent(Input.getString("내용"));
						invo.setWriter(Input.getString("작성자"));

						int writeResult =
								(Integer) ExeService.execute(new BoardWriteService(), invo);
						BoardPrint.print(writeResult, "게시판 글쓰기");
						break;
					case "4":
						BoardVO updateVO = (BoardVO) ExeService.execute(new BoardViewService(),
								Input.getLong("수정할 글번호 입력"));
						updateBoardVO(updateVO);
						System.out.println("BoardController.execute() 수정완료 후  vo" + updateVO);
						int updateResult =
								(Integer) ExeService.execute(new BoardUpdateService(), updateVO);
						BoardPrint.print(updateResult, "게시판 글수정");
						break;
					case "5":
						int deleteResult = (Integer) ExeService.execute(new BoardDeleteService(),
								Input.getLong("삭제할 글번호 입력"));
						BoardPrint.print(deleteResult, "게시판 글삭제");
						break;
					case "0":
						return;
					default:
						break;

				}// end of switch

				// end of while
			} catch (Exception e) {
				Output.printWithLine(e.getMessage(), "%", 40);
			}
		}

	} // end of main

	private static void updateBoardVO(BoardVO vo) throws Exception {
		Output.title("게시글 수정을 위한 데이터 수정 진행");
		while (true) {
			BoardPrint.print(vo);
			Output.menu("1.제목 2.내용 3.작성자", "0.수정완료 -1.수정취소");
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
			}
		}
	}
}
