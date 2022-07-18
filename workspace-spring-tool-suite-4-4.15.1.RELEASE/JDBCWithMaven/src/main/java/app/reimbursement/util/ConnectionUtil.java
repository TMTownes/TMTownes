package app.reimbursement.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {
	
	public static Connection getNewConnection() throws SQLException {
		
		Connection conn = DriverManager.getConnection(
						System.getenv(),
						System.getenv(),
						System.getenv()
						);
		return conn;
	}

}
