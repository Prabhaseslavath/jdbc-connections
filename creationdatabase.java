package creation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class creationdatabase {

	public static void main(String[] args) {

//		loading database
//		creating connection
//		creating statement
//		two types
//		static statement,preparedstatement
//		statement execution
//		closing
		
		try {
			Scanner scr = new Scanner(System.in);
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/", "root", "root");
			System.out.println("Enter the database name : ");
			String sql ="create database "+scr.next();
			PreparedStatement pmst = conn.prepareStatement(sql);
			int i = pmst.executeUpdate();
			if(i>0) {
				System.out.println("database created");
			}
			else {
				System.out.println("database not created");
			}
			conn.close();
			pmst.close();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}