package com;
import java.sql.*;


public class jdbcmysql {
	//public static void main(String args[]) {
	
	public void connectDB(User u) {	
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
			*/
			String s="INSERT INTO user_db(account,password,email) VALUES ('"+u.getAccount()+"','"+u.getPassword()+"','"+u.getEmail()+"')";
			stt.execute(s);
			
			/*ResultSet res =stt.executeQuery("SELECT * FROM user_db");
			
			while (res.next()) {
				System.out.println(res.getString("account") +" "+res.getString("password") +" "+res.getString("email"));
				System.out.println("�L�X��Ʈw");
			}
			*/
			
			System.out.println("�s�W��Ʀ��\");
			
		} catch (Exception e) {
			System.out.println("�s������");
			e.printStackTrace();
		}
	}
	//public static void main(String args[]) {
	public String queryDB(String ra) {
		Connection con =null;
		String url ="jdbc:mysql://localhost:3306/db_user?serverTimezone=UTC&useUnicode=true&characterEncoding=utf8&useSSL=false";
		String only="xxxxx";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			con =DriverManager.getConnection(url,"root","888888");
			
			if(!con.isClosed()) {
				System.out.println("�s�����\");
			}
			
			String a="aab";
			Statement stt=con.createStatement();							
			ResultSet res =stt.executeQuery("SELECT * FROM user_db WHERE account='aab'");
		
			only="�s�����\";
			if(res.next()){                   //�w���U���b��(�����ۦP��->true
				System.out.println(res.getString("account") );
				only="true";
			}else {                              //�S���U���b��->false
				only="false";
				System.out.println("NO data");
			}
		} catch (Exception e) {
			System.out.println("�s������");
			e.printStackTrace();
			only="�S�s�WDB";
		}
		return only;
	}
	/*public static void main(String args[]) {
		Connection con =null;
		String url ="jdbc:mysql://localhost:3306/db_user?serverTimezone=UTC&useUnicode=true&characterEncoding=utf8&useSSL=false";
		String only="xxxxx";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			con =DriverManager.getConnection(url,"root","888888");
			
			if(!con.isClosed()) {
				System.out.println("�s�����\");
			}
			
			String a="aab";
			Statement stt=con.createStatement();							
			ResultSet res =stt.executeQuery("SELECT * FROM user_db WHERE account='aab'");
		
			only="�s�����\";
			if(res.next()){                   //�w���U���b��(�����ۦP��->true
				System.out.println(res.getString("account") );
				only="true";
			}else {                              //�S���U���b��->false
				only="false";
				System.out.println("NO data");
			}
		} catch (Exception e) {
			System.out.println("�s������");
			e.printStackTrace();
			only="�S�s�W";
		}
		
	}*/
}
