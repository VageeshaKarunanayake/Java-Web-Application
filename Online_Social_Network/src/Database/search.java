package Database;

import java.sql.*;
import java.util.*;

public class search extends connection {

	public static ArrayList<String> dbSearch(String s){
		ResultSet RS = null;
		ArrayList<String> search = null;
		try {
		connect();
	 	PreparedStatement DBOUTPUT = conn.prepareStatement("SELECT UN FROM users WHERE  UN = ? OR UN LIKE ?");
	 	DBOUTPUT.setString(1, s);
	 	DBOUTPUT.setString(2, s + "%");
	 	RS = DBOUTPUT.executeQuery();
	    
	 	search = new ArrayList<>();
	 	while(RS.next())
		{
			search.add(RS.getString("UN"));	
		}
	 	
		}catch(Exception e) {
			
			System.out.println(e);
		}
		
		return (search);
}
}
