/*
 * 공지 게시판 리스트를 해결하기 위한 객체 - NoticeDAO 객체를 사용해서 DB에서 데이터를 수집해 온다. 작성일 : 2021.01.18 작성자 : 고선호
 */

package com.webjjang.notice.service;

import com.webjjang.notice.dao.NoticeDAO;
import com.webjjang.notice.vo.NoticeVO;
import com.webjjang.main.controller.Service;

public class NoticeWriteService implements Service {

	NoticeDAO dao = new NoticeDAO();

	@Override
	public Object service(Object obj) throws Exception {
		// TODO Auto-generated method stub
		// 글쓰기 vo 데이터를 가져와서 넘겨준다.
		return dao.write((NoticeVO) obj);
	}

}
