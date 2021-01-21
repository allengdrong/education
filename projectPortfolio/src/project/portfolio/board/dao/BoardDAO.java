package project.portfolio.board.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import project.portfolio.board.vo.BoardVO;
import project.portfolio.util.DBInfo;
import project.portfolio.util.sql.DAOSQL;

public class BoardDAO {

	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	// 게시판 리스트 ------------------------

	public List<BoardVO> list() throws Exception {
		List<BoardVO> list = null;

		try {
			con = DBInfo.getConnection();
			pstmt = con.prepareStatement(DAOSQL.BOARD_LIST);
			rs = pstmt.executeQuery();

			if (rs != null) {
				while (rs.next()) {
					if (list == null)
						list = new ArrayList<>();
					BoardVO vo = new BoardVO();
					vo.setNo(rs.getLong("no"));
					vo.setTitle(rs.getString("title"));
					vo.setWriter(rs.getString("writer"));
					vo.setWriteDate(rs.getString("writeDate"));
					vo.setHit(rs.getLong("hit"));

					list.add(vo);
				}
			}

			return list;
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("게시판 리스트 데이터 처리 중 오류가 발생되었습니다.");
		} finally {
			DBInfo.close(con, pstmt, rs);
		}
	} // end of list

	public BoardVO view(long no) throws Exception {
		BoardVO vo = null;

		try {
			con = DBInfo.getConnection();
			System.out.println(DAOSQL.BOARD_VIEW);
			pstmt = con.prepareStatement(DAOSQL.BOARD_VIEW);
			pstmt.setLong(1, no);
			rs = pstmt.executeQuery();

			if (rs != null & rs.next()) {

				vo = new BoardVO();
				vo.setNo(rs.getLong("no"));
				vo.setTitle(rs.getString("title"));
				vo.setContent(rs.getString("content"));
				vo.setWriter(rs.getString("writer"));
				vo.setWriteDate(rs.getString("writeDate"));
				vo.setHit(rs.getLong("hit"));

			}

			return vo;
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("게시판 글보기 처리 중 오류가 발생되었습니다.");
		} finally {
			DBInfo.close(con, pstmt, rs);
		}
	} // end of view



	public int increase(long no) throws Exception {
		int result = 0;

		try {
			con = DBInfo.getConnection();
			System.out.println(DAOSQL.BOARD_INCREASE);
			pstmt = con.prepareStatement(DAOSQL.BOARD_INCREASE);
			pstmt.setLong(1, no);;
			result = pstmt.executeUpdate();
			System.out.println("BoardDAO.increase() : 글보기 조회수 1증가 완료");
			return result;
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("게시판 글보기 조회수 1증가 처리 중 오류가 발생했습니다.");
		} finally {
			DBInfo.close(con, pstmt, rs);
		}
	} // end of view + 1

	public int write(BoardVO vo) throws Exception {

		int result = 0;

		try {
			con = DBInfo.getConnection();
			System.out.println(DAOSQL.BOARD_WRITE);
			pstmt = con.prepareStatement(DAOSQL.BOARD_WRITE);
			pstmt.setString(1, vo.getTitle());
			pstmt.setString(2, vo.getContent());
			pstmt.setString(3, vo.getWriter());

			result = pstmt.executeUpdate();
			System.out.println(" 글쓰기 완료");
			return result;

		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("게시판 글쓰기 처리 중 오류가 발생되었습니다.");
		} finally {
			DBInfo.close(con, pstmt, rs);
		}
	} // end of write

	public int update(BoardVO vo) throws Exception {

		int result = 0;

		try {
			con = DBInfo.getConnection();
			System.out.println(DAOSQL.BOARD_UPDATE);
			pstmt = con.prepareStatement(DAOSQL.BOARD_UPDATE);
			pstmt.setString(1, vo.getTitle());
			pstmt.setString(2, vo.getContent());
			pstmt.setString(3, vo.getWriter());
			pstmt.setLong(4, vo.getNo());

			result = pstmt.executeUpdate();
			System.out.println(" 글 수정 완료");
			return result;

		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("게시판 글 수정 처리 중 DB오류가 발생되었습니다.");
		} finally {
			DBInfo.close(con, pstmt, rs);
		}
	} // end of update

	public int delete(long no) throws Exception {

		int result = 0;

		try {
			con = DBInfo.getConnection();
			System.out.println(DAOSQL.BOARD_DELETE);
			pstmt = con.prepareStatement(DAOSQL.BOARD_DELETE);
			pstmt.setLong(1, no);


			result = pstmt.executeUpdate();
			System.out.println(" 글 삭제 완료");
			return result;

		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("게시판 글 수정 처리 중 DB오류가 발생되었습니다.");
		} finally {
			DBInfo.close(con, pstmt, rs);
		}
	}

}
