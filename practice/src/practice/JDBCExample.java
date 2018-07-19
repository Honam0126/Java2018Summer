package practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCExample {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");

			Connection conn = 
					DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","root", "s123");
			System.out.println("Success connect Mysql server");
		} catch (ClassNotFoundException e) {
			//System.out.println("Driver Error");
			e.printStackTrace();
		} catch (SQLException e) {
			//System.out.println("Query Error");
			e.printStackTrace();
		}
	}

}
