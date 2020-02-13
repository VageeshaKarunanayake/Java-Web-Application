package Database;

import java.sql.*;

public class login extends connection{

	public static String dbOutput(String email,String PW){
			 String s = null;
			try {
			
				connect();
				PreparedStatement DBOUTPUT = conn.prepareStatement("SELECT email FROM users WHERE email=? AND PW=?");
				DBOUTPUT.setString(1, email);
				DBOUTPUT.setString(2, PW);
				ResultSet RS = DBOUTPUT.executeQuery();
				
				if(RS.next()) 
					s = RS.getString("email");
				else
					s = null;
		    
				conn.close();
				}catch(Exception e) {
				
					System.out.println(e);
				}
			return s;
	}
}

