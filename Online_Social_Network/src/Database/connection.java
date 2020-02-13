package Database;

import java.sql.*;

public class connection {

	protected static Connection conn;
	
	public static void connect() {
	try {
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/online_social_network", "root" , "1234");
	 	
	}catch(Exception e) {
		
		System.out.println(e);
	}
}
}
