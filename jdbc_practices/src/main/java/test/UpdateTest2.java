package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateTest2 {

	public static void main(String[] args) {
		DeptVo vo = new DeptVo();
		vo.setNo(11L);
		vo.setName("전략기획팀");

		Boolean result = update(vo);
		if (result) {
			System.err.println("성공!");
		}

	}

	private static Boolean update(DeptVo vo) {
		boolean result = false;
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = null;
		try {
			// 1. JDBC Driver 로딩
			Class.forName("org.mariadb.jdbc.Driver");

			// 2. 연결하기
			// 연결하려면 연결 url이 필요함 조소:포트/연결할DB
			// charset=uft8 --> 연결 옵션
			String url = "jdbc:mysql://127.0.0.1:3306/employees?charset=uft8";
			conn = DriverManager.getConnection(url, "hr", "hr");

			// 3. statement 생성
			sql = "update dept set name=? where no=?";
			pstmt = conn.prepareStatement(sql);
			// 4. 바인딩
			pstmt.setString(1, vo.getName());
			pstmt.setLong(2, vo.getNo());
			// 4. SQL 실행
			int count = pstmt.executeUpdate();

			result = count == 1;

		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패" + e);
		} catch (SQLException e) {
			System.out.println("error:" + e);
		} finally {
			try {
				if (pstmt != null) {
					pstmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return result;
	}

}
