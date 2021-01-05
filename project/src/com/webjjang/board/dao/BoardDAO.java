package com.webjjang.board.dao;

import java.util.ArrayList;
import java.util.List;
import com.webjjang.board.vo.BoardVO;

// MainController - Controller - Service - [DAO]
public class BoardDAO {

	// 다른 패키지에서 접근 가능 : public
	// 처리하고 나면 BoardVO가 여러개 담겨져 있는 컬렉션(List)를 리턴해준다.
	// 메서드 이름은 list()

	// 1. 게시판 리스트
	public List<BoardVO> list() {
		System.out.println("BoardDAO.list()");
		List<BoardVO> list = null; // 데이터를 저장할 객체 선언
		// 데이터를 DB에서 가져와서 list에 넣어준다. -> 강제로 데이터 처리
		// 1. list를 객체 생성한다.
		list = new ArrayList<BoardVO>();

		// 2. 데이터를 가져온다.
		// -데이터를 저장할 vo 객체 생성
		BoardVO vo1 = new BoardVO();
		// 데이터 강제 입력 - 글번호, 제목, 작성자, 작성일, 조회수
		vo1.setNo(10);
		vo1.setTitle("자바");
		vo1.setWriter("고선호");
		vo1.setWriteDate("2020.12.31");
		vo1.setHit(100);

		list.add(vo1);

		// -데이터를 저장할 vo 객체 생성
		BoardVO vo2 = new BoardVO();
		// 데이터 강제 입력 - 글번호, 제목, 작성자, 작성일, 조회수
		vo2.setNo(9);
		vo2.setTitle("오라클");
		vo2.setWriter("손흥민");
		vo2.setWriteDate("2020.12.30");
		vo2.setHit(151);

		list.add(vo2);

		// 데이터가 잘 담겨져 있는지 출력
		System.out.println("BoardDAO.list().list : " + list);

		return list;
	} // end of list()

	public BoardVO view(long no) throws Exception {
		BoardVO vo = new BoardVO();
		// 값을 셋팅
		vo.setNo(10);
		vo.setTitle("자바");
		vo.setContent("자바짱");
		vo.setWriter("고선호");
		vo.setWriteDate("2020.12.31");
		vo.setHit(123);

		// 출력 테스트
		System.out.println("BoardDAO.view().vo : " + vo);

		return vo;
	}

}
