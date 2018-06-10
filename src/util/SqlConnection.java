package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SqlConnection {
	
	public static Connection connect() {
		Connection con = null;
		
		String password = "root";
		String user = "root";
		String url = "jdbc:mysql://localhost:3306/credit_line_db?user=" + user
				+ "&password=" + password;
		try {
			con = DriverManager.getConnection(url);

		} catch (SQLException e) {
			System.out.println("It was a problem with your connection");
			e.printStackTrace();
		}
		return con;
	}

}
