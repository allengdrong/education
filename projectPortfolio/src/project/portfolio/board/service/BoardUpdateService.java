package project.portfolio.board.service;

import project.portfolio.board.controller.Service;
import project.portfolio.board.dao.BoardDAO;
import project.portfolio.board.vo.BoardVO;

public class BoardUpdateService implements Service {

	BoardDAO dao = new BoardDAO();

	@Override
	public Object service(Object obj) throws Exception {

		return dao.update((BoardVO) obj);
	}

}
