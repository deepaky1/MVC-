package com.dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.conn.ConnectionFile;
import com.dto.User;

public class UserDaoImple implements UserDao{
       private ConnectionFile myConn;

	public UserDaoImple() {
		myConn =new ConnectionFile();
	}
     @Override
	public int insertUser(User user) {
		int i =0;
		try {
			Connection con =myConn.getConn();
			PreparedStatement ps = con.prepareStatement("insert into user(user_first_name,user_last_name,user_email,user_pass) values(?,?,?,?)");
			ps.setString(1, user.getUserFirstName());
			ps.setString(2, user.getUserLastName());
			ps.setString(3, user.getUserEmail());
			ps.setString(4, user.getUserPass());
			i = ps.executeUpdate();
			ps.close();
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return i;
	} 

	@Override
	public boolean login(User user) {
		System.out.println("enter dao");
		boolean flag =false;
		try {
			Connection con = myConn.getConn();
			PreparedStatement s = con.prepareStatement(
					"select * from user where user_email = ? and user_pass = ?");
			s.setString(1, user.getUserEmail());
			s.setString(2, user.getUserPass());
			ResultSet rs = s.executeQuery();
			System.out.println(user);
			if(rs.next()) {
				System.out.println("enter rs");
				flag = true;
				user.setUserFirstName(rs.getString(2));
				user.setUserLastName(rs.getString(3));
				user.setUserId(rs.getInt(1));
			
			}
			s.close();
		}catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		System.out.println("exit dao   "+flag);
		return flag;
	}
	
}