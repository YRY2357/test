package com.test.util;



import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;


public class DBUtil {
	protected 
	static String driver;
	static String url;
	static String name;
	static String pwd;
	static{
		Properties properties = new Properties();
		InputStream in = DBUtil.class.getResourceAsStream("sql.properties");
		try {
			properties.load(in);
			driver = properties.getProperty("driver");
			url = properties.getProperty("url");
			name = properties.getProperty("name");
			pwd = properties.getProperty("pwd");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static Connection getConnection(){
		Connection conn = null;
		
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url,name,pwd);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
	public static void cloneConection(Connection conn){
		if (conn!=null) {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
