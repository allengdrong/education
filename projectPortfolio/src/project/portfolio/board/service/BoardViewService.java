package project.portfolio.board.service;

import project.portfolio.board.controller.Service;
import project.portfolio.board.dao.BoardDAO;

public class BoardViewService implements Service {

	BoardDAO dao = new BoardDAO();

	@Override
	public Object service(Object obj) throws Exception {
		// TODO Auto-generated method stub
		dao.increase((Long) obj);
		return dao.view((Long) obj);
	}

}
