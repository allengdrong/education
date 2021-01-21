package project.portfolio.board.service;

import project.portfolio.board.controller.Service;
import project.portfolio.board.dao.BoardDAO;

public class BoardListService implements Service {

	BoardDAO dao = new BoardDAO();

	@Override
	public Object service(Object obj) throws Exception {
		// TODO Auto-generated method stub
		return dao.list();
	}

}
