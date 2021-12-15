package com.payroll.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.payroll.model.Admin;

public class AdminDao {
	public boolean validateAdmin(Admin user) {
		String query="select * from users where email_id = '"+user.getEmailId()+"' and "
				+ "password = '"+user.getPassword()+"'" ;
		Connection con=ConnectionUtil.dbConnect();
		boolean flag=false;
		try {
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery(query);
			if(rs.next()) {
				System.out.println("Have a good day");
				flag=true;
			}
			else {
				flag=false;
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Query not executed correctly");
		}
		return  flag;
		
		
	}

}
