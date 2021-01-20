/*
 * 이미지 게시판 리스트를 해결하기 위한 객체 - ImageDAO 객체를 사용해서 DB에서 데이터를 수집해 온다. 작성일 : 2021.01.18 작성자 : 고선호
 */

package com.webjjang.image.service;

import com.webjjang.image.dao.ImageDAO;
import com.webjjang.image.vo.ImageVO;
import com.webjjang.main.controller.Service;

public class ImageWriteService implements Service {

	ImageDAO dao = new ImageDAO();

	@Override
	public Object service(Object obj) throws Exception {
		// TODO Auto-generated method stub
		// 글쓰기 vo 데이터를 가져와서 넘겨준다.
		return dao.write((ImageVO) obj);
	}

}
