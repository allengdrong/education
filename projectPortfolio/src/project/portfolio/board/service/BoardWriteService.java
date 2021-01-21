package project.portfolio.board.service;

import project.portfolio.board.controller.Service;
import project.portfolio.board.dao.BoardDAO;
import project.portfolio.board.vo.BoardVO;

public class BoardWriteService implements Service {

	BoardDAO dao = new BoardDAO();

	@Override
	public Object service(Object obj) throws Exception {

		return dao.write((BoardVO) obj);
	}

}
