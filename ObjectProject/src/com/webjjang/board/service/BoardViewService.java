/*
 * 게시판 리스트를 해결하기 위한 객체 - BoardDAO 객체를 사용해서 DB에서 데이터를 수집해 온다. 작성일 : 2021.01.18 작성자 : 고선호
 */

package com.webjjang.board.service;

import com.webjjang.board.dao.BoardDAO;
import com.webjjang.main.controller.Service;

public class BoardViewService implements Service {

	BoardDAO dao = new BoardDAO();

	@Override
	public Object service(Object obj) throws Exception {
		// TODO Auto-generated method stub
		// 먼저 조회수 1 증가 시킨다. -> 글보기와 글수정할때 데이터를 가져오는 객체로 사용하는데 글보기에서는 증가, 글수정은 증가 안함으로 해야하나
		// 자바 프로젝트에서는 둘다 증가 시키는 것으로 개발.
		dao.increase((Long) obj);
		// 글보기 vo 데이터를 가져와서 넘겨준다.
		return dao.view((Long) obj);
	}

}
