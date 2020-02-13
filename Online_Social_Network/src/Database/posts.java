package Database;

import java.sql.*;

public class posts extends connection{
			public static void setpost(String email,String post)
			{
				try {
					connect();
					PreparedStatement DBINPUT = conn.prepareStatement("INSERT INTO posts VALUES (?,?)");
				 	DBINPUT.setString(1,email);
				 	DBINPUT.setString(2,post);
				 	DBINPUT.executeUpdate();
				} catch (Exception e) {
					System.out.println(e);
			}
			}


}
