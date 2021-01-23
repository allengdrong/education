package goodsProjectTest.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import goodsProjectTest.vo.GoodsVO;

public class GoodsListDAO {

	public static void main(String[] args) {


		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "java00";
		String pw = "java00";

		List<GoodsVO> list = null;

		try {

			// 1. 드라이버 확인
			Class.forName(driver);

			// 2. 연결객체
			con = DriverManager.getConnection(url, id, pw);

			// 3. 쿼리 작성
			String sql = "select no, name, price " + " from goods " + " ORDER BY no DESC";

			// 4. 실행객체 & 데이터 셋팅
			pstmt = con.prepareStatement(sql);

			// 5. 실행
			rs = pstmt.executeQuery();

			// 6. 출력 -> 데이터 저장 후 리턴
			if (rs != null) {
				while (rs.next()) {
					if (list == null)
						list = new ArrayList<GoodsVO>();
					GoodsVO vo = new GoodsVO();

					vo.setNo(rs.getInt("no"));
					vo.setName(rs.getString("name"));
					vo.setPrice(rs.getInt("price"));

					list.add(vo);

				} // end of while
			} // end of if

			System.out.println("+------------------------------------------+");
			System.out.println("+  no  /      Name        /     price      +");
			System.out.println("+------------------------------------------+");

			for (GoodsVO vo : list) {
				System.out.print("   " + vo.getNo() + "   /    ");
				System.out.print(vo.getName() + "     /         ");
				System.out.print(vo.getPrice());
				System.out.println();
			}

			// 7. 닫기
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (con != null)
					con.close();
				if (pstmt != null)
					pstmt.close();
				if (rs != null)
					rs.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}

