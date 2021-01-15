package grade;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GradeDAO {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "java00";
		String pw = "java00";

		List<GradeVO> list = null;

		try {
			Class.forName(driver);
			System.out.println("1. 드라이버 존재");

			con = DriverManager.getConnection(url, id, pw);
			System.out.println("2. 오라클 연결");

			String sql = "SELECT gradeNo, gradeName" + " FROM grade" + " ORDER BY gradeNo DESC";
			System.out.println("3. sql 작성 : " + sql);

			pstmt = con.prepareStatement(sql);
			System.out.println("4. 실행객체 준비 완료");

			rs = pstmt.executeQuery();
			System.out.println("5. 실행 완료");

			if (rs != null) {
				while (rs.next()) {
					if (list == null)
						list = new ArrayList<GradeVO>();
					GradeVO vo = new GradeVO();
					vo.setGradeNo(rs.getInt("gradeNo"));
					vo.setGradeName(rs.getString("gradeName"));

					list.add(vo);

				} // end of while
			} // end of if

			System.out.println("+------------------------------------------+");
			System.out.println("+       GradeNo      /      GradeName      +");
			System.out.println("+------------------------------------------+");

			for (GradeVO vo : list) {
				System.out.print("      " + vo.getGradeNo() + "           /           ");
				System.out.println(vo.getGradeName());

			}
			System.out.println("6. 출력 완료");


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
				System.out.println("7. 닫기 완료");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
}
