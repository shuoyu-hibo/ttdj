package com.bz.db;

import java.io.FileInputStream;
import java.sql.*;
import java.util.*;

import com.bz.util.*;
import common.CommonConst;

public class DBConnection {
	
	private Connection conn = null;
	
	public DBConnection() throws Exception {
		
		String strDriver = CommonConst.DB_DRIVER_CLASSNAME;
		String strUrl = CommonConst.DB_URL;
		String strUName = CommonConst.DB_USER;
		String strPassword = CommonConst.DB_PWD;
		
		Class.forName(strDriver);
		conn = DriverManager.getConnection(strUrl, strUName, strPassword);
		
	}
	
	
	public Connection getConnection() throws Exception {
		if(conn.isClosed())   
			throw new Exception("Cannot connect to database");
			
		return conn;
	}
	
	
	public static void main(String[] args){
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:MySQL://127.0.0.1:3306/microblog";
		String user = "root";
		String password = "root";
		Connection conn = null;
		
		try {
			Class.forName(driver);
			
			conn = DriverManager.getConnection(url, user, password);   
			if(!conn.isClosed())   
			  System.out.println("Succeeded connecting to the Database!");
			else
				System.out.println("Cannot connect to the Database!");
			
		}
		catch (Exception Exp) {
			Exp.printStackTrace();
		}
		finally {
			try {
				if (conn != null) {
					conn.close();
				}
			}
			catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}

}
