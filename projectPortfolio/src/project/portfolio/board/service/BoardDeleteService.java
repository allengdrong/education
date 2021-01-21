package project.portfolio.board.service;

import project.portfolio.board.controller.Service;
import project.portfolio.board.dao.BoardDAO;

public class BoardDeleteService implements Service {

	BoardDAO dao = new BoardDAO();

	@Override
	public Object service(Object obj) throws Exception {

		return dao.delete((long) obj);
	}

}
