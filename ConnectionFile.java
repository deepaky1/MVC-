package com.conn;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFile {
	private static final String DRIVER_CLASS ="com.mysql.cj.jdbc.Driver";
	private static final String URL ="jdbc:mysql://localhost:3306/Project";
	private static final String USER ="root";
	private static final String PASSWORD ="Password@2020";
	private Connection con;
	public Connection getConn() throws ClassNotFoundException, SQLException {
		if(con==null || con.isClosed()) {
			Class.forName(DRIVER_CLASS);
			con = DriverManager.getConnection(URL, USER, PASSWORD);
		}
		return con;
	}
	
	

}
