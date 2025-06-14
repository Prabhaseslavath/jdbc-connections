package creation;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.util.Scanner;

	public class delete {

		public static void main(String[] args) {
			
			try {
				Scanner scr = new Scanner(System.in);
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/", "root", "root");
				System.out.println("Enter the database name to be deleted : ");
				String sql ="drop database "+scr.next();
				PreparedStatement pmst = conn.prepareStatement(sql);
				int i = pmst.executeUpdate();
				if(i==0) {
					System.out.println("database deleted");
				}
				else {
					System.out.println("database not deleted");
				}
				conn.close();
				pmst.close();
				
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}