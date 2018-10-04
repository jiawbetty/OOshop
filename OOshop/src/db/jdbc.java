package db;
import java.sql.*;
 
public class jdbc {
	//public static void main(String args[]) {
	public static void connectDB() {	
		Connection con =null;
		String url ="jdbc:mysql://localhost:3306/db_user?serverTimezone=UTC&useUnicode=true&characterEncoding=utf8&useSSL=false";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			con =DriverManager.getConnection(url,"root","888888");
			Statement stt=con.createStatement();
			
			/*stt.execute("CREATE DATABASE IF NOTEXISTS test");
			stt.execute("USE test");
			
			stt.execute("DROP TABLE IF EXISTs people");
			stt.execute("CREATE TABLE people(" +
						"id BIGINT NOT NULL AUTO_INCREMENT,"
						+"fname VARCHAR(25),"
						+"lname VARCHAR(25),"
						+"PRIMARY KEY(id)"
						+ ")");
			
			stt.execute("INSERT INTO people(fname,lname) VALUES"+
						"('Joe','Bloggs'),('Mary','bloggs'),('Jill','Hill')");
			*/
			ResultSet res =stt.executeQuery("SELECT * FROM user_db");
			
			while (res.next()) {
				System.out.println(res.getString("account") +" "+res.getString("password") +" "+res.getString("email"));
				System.out.println("印出資料庫");
			}
			
			if(!con.isClosed()) {
				System.out.println("連接成功");
			}
		} catch (Exception e) {
			System.out.println("連接失敗");
			e.printStackTrace();
		}
	}
	
}
