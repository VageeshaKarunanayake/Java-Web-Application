package Database;

import java.sql.*;

public class register extends connection{

	public static void dbInput(String FN,String LN,String Gen,String UN,String email,String PW,int cn) {
		try {
			connect();
		 	PreparedStatement DBINPUT =conn.prepareStatement("INSERT INTO users VALUES (?,?,?,?,?,?,?)");
		 	DBINPUT.setString(1,FN);
		 	DBINPUT.setString(2,LN);
		 	DBINPUT.setString(3,Gen);
		 	DBINPUT.setString(4,UN);
		 	DBINPUT.setString(5,email);
		 	DBINPUT.setString(6,PW);
		 	DBINPUT.setInt(7,cn);
		 	DBINPUT.executeUpdate();
		 	
		 	conn.close();
		 	
		}catch(Exception e) {
			System.out.println(e);
		}
	
}
}