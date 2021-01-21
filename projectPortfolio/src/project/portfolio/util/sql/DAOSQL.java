package project.portfolio.util.sql;

public class DAOSQL {

	public static final String BOARD_LIST
	// 1. 리스트
			= " select rnum, no, title, writer, to_char(writeDate, 'yyyy.mm.dd') writeDate, hit"
					+ " from ( "
					// 2) 가져온 원본 데이터에 순서 번호 붙이기
					+ " select rownum rnum, no, title, writer, writeDate, hit from ( "
					// 1) 원본 데이터 가져오기
					+ " select no, title, writer, writeDate, hit from board" + " order by no desc "
					+ " ) " + " ) where rnum between 1 and 10";

	// 2. 글보기
	public static final String BOARD_VIEW =
			" select no, title, content, writer, to_char(writeDate, 'yyyy.mm.dd') writeDate, hit"
					+ " from board where no = ? ";

	// 2-1. 조회수 증가
	public static final String BOARD_INCREASE = " update board set hit = hit + 1 where no = ? ";

	// 3. 글쓰기
	public static final String BOARD_WRITE =
			" insert into board(no, title, content, writer) values(board_seq.nextval, ?, ?, ?)";

	// 4. 글수정
	public static final String BOARD_UPDATE =
			" update board set title = ?, content = ?, writer = ? where no = ? ";

	// 5. 글삭제
	public static final String BOARD_DELETE = " delete from board where no = ? ";
}
