package com.webjjang.board.service;

import com.webjjang.board.dao.BoardDAO;
import com.webjjang.board.vo.BoardVO;

public class BoardViewService {

	public BoardVO service(long no) throws Exception {
		System.out.println("BoardViewService.service().no" + no);
		BoardDAO dao = new BoardDAO();
		return dao.view(no);
	}

}
