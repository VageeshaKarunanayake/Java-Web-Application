package Database;
import java.io.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import java.util.Date;


public class images extends connection {

		public static void UploadImg(String email,String photo)
		{
			try {
				ResultSet n;
				Integer num = null;
				double bytes;
				double kilobytes;
				connect();
				File file =new File(photo);
				bytes = file.length();
				kilobytes = (bytes / 1024);
				DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
				Date date = new Date();
				PreparedStatement NumCheck = conn.prepareStatement("SELECT MAX(num) FROM images WHERE email=?");
				NumCheck.setString(1,email);
				n = NumCheck.executeQuery();
				if (n.next()) {
					num = n.getInt(1);
				}
				
				if(num == null) {
					PreparedStatement DBINPUT = conn.prepareStatement("INSERT INTO images VALUES (?,?,?,?,?)");
					DBINPUT.setInt(1, 1);
					DBINPUT.setString(2,email);
					DBINPUT.setString(3,photo);
					DBINPUT.setDouble(4,kilobytes);
					DBINPUT.setString(5,dateFormat.format(date));
					DBINPUT.executeUpdate();
			 	conn.close();
				}else {
					PreparedStatement DBINPUT = conn.prepareStatement("INSERT INTO images VALUES (?,?,?,?,?)");
				 	DBINPUT.setInt(1, (num + 1));
					DBINPUT.setString(2,email);
				 	DBINPUT.setString(3,photo);
				 	DBINPUT.setDouble(4,kilobytes);
				 	DBINPUT.setString(5,dateFormat.format(date));
				 	DBINPUT.executeUpdate();
				 	conn.close();
					
				}
				
			} catch (Exception e) {
					System.out.println(e);
			}
		}
		
		public static ArrayList<String> GetImg(String email)
		{	
			ResultSet RS = null;
			ArrayList<String> ImgSet = null;
			try {
				connect();
				PreparedStatement DBOUTPUT = conn.prepareStatement("SELECT image FROM images WHERE email = ?");
			 	DBOUTPUT.setString(1,email);
			 	RS = DBOUTPUT.executeQuery();
			 	ImgSet = new ArrayList<>();
			 	while(RS.next())
				{
					ImgSet.add(RS.getString("image"));
				}
			 	conn.close();
			} catch (Exception e) {
					System.out.println(e);
			}
			
			return (ImgSet);
		}
		
		public static ArrayList<String> GetNum(String email)
		{	
			ResultSet RS = null;
			ArrayList<String> NumSet = null;
			try {
				connect();
				PreparedStatement DBOUTPUT = conn.prepareStatement("SELECT num FROM images WHERE email = ?");
			 	DBOUTPUT.setString(1,email);
			 	RS = DBOUTPUT.executeQuery();
			 	NumSet = new ArrayList<>();
			 	while(RS.next())
				{
					NumSet.add(RS.getString("num"));
				}
			 	conn.close();
			} catch (Exception e) {
					System.out.println(e);
			}
			
			return (NumSet);
		}
		
		public static ArrayList<String> GetDaTi(String email)
		{	
			ResultSet RS = null;
			ArrayList<String> DaTiSet = null;
			try {
				connect();
				PreparedStatement DBOUTPUT = conn.prepareStatement("SELECT daTi FROM images WHERE email = ?");
			 	DBOUTPUT.setString(1,email);
			 	RS = DBOUTPUT.executeQuery();
			 	DaTiSet = new ArrayList<>();
			 	while(RS.next())
				{
					DaTiSet.add(RS.getString("daTi"));
				}
			 	conn.close();
			} catch (Exception e) {
					System.out.println(e);
			}
			
			return (DaTiSet);
		}
		
		public static ArrayList<String> GetSize(String email)
		{	
			ResultSet RS = null;
			ArrayList<String> SizeSet = null;
			try {
				connect();
				PreparedStatement DBOUTPUT = conn.prepareStatement("SELECT size FROM images WHERE email = ?");
			 	DBOUTPUT.setString(1,email);
			 	RS = DBOUTPUT.executeQuery();
			 	SizeSet = new ArrayList<>();
			 	while(RS.next())
				{
					SizeSet.add(RS.getString("size"));
				}
			 	conn.close();
			} catch (Exception e) {
					System.out.println(e);
			}
			
			return (SizeSet);
		}
		
		public static void DeleteImg(String email,String num)
		{
			try {
				connect();
				PreparedStatement DBINPUT = conn.prepareStatement("DELETE FROM images WHERE email = ? and num = ?");
			 	DBINPUT.setString(1,email);
			 	DBINPUT.setString(2,num);
			 	DBINPUT.executeUpdate();
			 	conn.close();
			} catch (Exception e) {
					System.out.println(e);
			}
		}
}
