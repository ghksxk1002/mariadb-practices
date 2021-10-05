package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertTest01 {

	public static void main(String[] args) {
		insert("영업");
		insert("개발");
		insert("기획");

	}

	private static boolean insert(String name) {
		boolean result = false;
		Connection conn = null;
		Statement stmt = null;
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
			stmt = conn.createStatement();

			// 4. SQL 실행
			sql = "insert into dept values(null, '" + name + "')";
			int count = stmt.executeUpdate(sql);

			result = count == 1;
			System.out.println("연결성공");

		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패" + e);
		} catch (SQLException e) {
			System.out.println("error:" + e);
		} finally {
			try {
				if (stmt != null) {
					stmt.close();
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
