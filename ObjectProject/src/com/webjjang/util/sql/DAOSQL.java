package com.webjjang.util.sql;

public class DAOSQL {

	// 게시판에 활용되는 쿼리
	// 1. 리스트
	public static final String BOARD_LIST
	// 3) 붙여진 순서 번호 중에서 페이지(1)에 알맞은 데이터 가져오기
			= " select rnum, no, title,  writer, to_char(writeDate, 'yyyy.mm.dd') writeDate, hit"
					+ " from ( "
					// 2) 가져온 원본 데이터에 순서 번호 붙이기
					+ " select rownum rnum, no, title,  writer, writeDate, hit from ( "
					// 1) 원본 데이터 가져오기
					+ " select no, title,  writer, writeDate, hit from board" + " order by no desc "
					+ " ) " + " ) where rnum between 1 and 10";

}
