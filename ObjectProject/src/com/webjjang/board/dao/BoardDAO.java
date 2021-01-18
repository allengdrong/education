package com.webjjang.board.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import com.webjjang.board.vo.BoardVO;
import com.webjjang.util.DBInfo;
import com.webjjang.util.sql.DAOSQL;

public class BoardDAO {

	// 필요한 객체 선언
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	// 게시판 리스트 -------------------------------------
	public List<BoardVO> list() throws Exception {

		// 실행한 결과를 저장하는 객체 선언
		List<BoardVO> list = null;

		// DB의 정보는 DBInfo 객체에 넣어놨다.

		try {
			// 1. 드라이버 확인 - DBInfo 에서 처리함.
			// 2. 연결객체
			con = DBInfo.getConnection();
			// 3. 쿼리작성 - DAOSQL에 선언됨.
			// 4. 실행객체 & 데이터 셋팅
			pstmt = con.prepareStatement(DAOSQL.BOARD_LIST);
			// 5. 실행
			rs = pstmt.executeQuery();
			// 6. 출력 -> 데이터 저장 후 리턴
			if (rs != null) {
				while (rs.next()) {
					// list null 이면 생성해야한다. - 한번만
					if (list == null)
						list = new ArrayList<>();
					// rs -> vo 저장을 위해 vo 객체 생성
					BoardVO vo = new BoardVO();
					vo.setNo(rs.getLong("no"));
					vo.setTitle(rs.getString("title"));
					vo.setWriter(rs.getString("writer"));
					vo.setWriteDate(rs.getString("writeDate"));
					vo.setHit(rs.getLong("hit"));

					// vo - > list로 저장
					list.add(vo);
				} // end of while
			} // end of if()

			return list;

		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("게시판 리스트 데이터 처리 중 오류가 발생되었습니다.");
		} finally {
			// 7. 닫기
			DBInfo.close(con, pstmt, rs);
		}



	}
}
