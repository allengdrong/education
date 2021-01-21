package project.portfolio.print;

import java.util.List;
import com.webjjang.util.Output;
import project.portfolio.board.vo.BoardVO;

public class BoardPrint {

	// 1. list 출력
	public static void print(List<BoardVO> list) {
		int cnt = 50;
		Output.title("리스트");

		Output.printWithLine(" 글번호 / 제목 / 작성자 / 작성일 / 조회수 ", "-", cnt);

		if (list == null) {
			System.out.println(" 데이터가 없습니다.");
		} else {
			for (BoardVO vo : list) {
				System.out.print("- " + vo.getNo());
				System.out.print(" / " + vo.getTitle());
				System.out.print(" / " + vo.getWriter());
				System.out.print(" / " + vo.getWriteDate());
				System.out.print(" / " + vo.getHit());
				System.out.println();
			}
		}
		Output.line("-", cnt);

	}

	public static void print(BoardVO vo) {
		int cnt = 50;
		Output.title("게시판 글보기");
		Output.line("-", cnt);
		if (vo == null) {
			System.out.println(" 해당 데이터가 없습니다. 글번호를 확인하세요.");
		} else {
			System.out.println("- 글번호 : " + vo.getNo());
			System.out.println("- 제   목 : " + vo.getTitle());
			System.out.println("- 내   용 : " + vo.getContent());
			System.out.println("- 작성자 : " + vo.getWriter());
			System.out.println("- 작성일 : " + vo.getWriteDate());
			System.out.println("- 조회수 : " + vo.getHit());

		}

		Output.line("-", cnt);

	}

	public static void print(int result, String msg) {
		// 한줄로 출력되는 문자의 반복 횟수
		int cnt = 50;
		// 제목 출력
		Output.title(msg);
		// 처리한 결과 출력
		if (result > 0)
			Output.printWithLine(msg + " 처리가 완료되었습니다.", "-", cnt);
		else
			Output.printWithLine(msg + " 처리에 실패하였습니다. 정보를 확인해 주세요.", "-", cnt);

	}
}
