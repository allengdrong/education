/*
 * 게시판 리스트를 해결하기 위한 객체 - BoardDAO 객체를 사용해서 DB에서 데이터를 수집해 온다. 작성일 : 2021.01.18 작성자 : 고선호
 */

package com.webjjang.board.service;

import com.webjjang.board.dao.BoardDAO;
import com.webjjang.board.vo.BoardVO;
import com.webjjang.main.controller.Service;

public class BoardWriteService implements Service {

	BoardDAO dao = new BoardDAO();

	@Override
	public Object service(Object obj) throws Exception {
		// TODO Auto-generated method stub
		// 글쓰기 vo 데이터를 가져와서 넘겨준다.
		return dao.write((BoardVO) obj);
	}

}
