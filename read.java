package creation;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class read {
    public static void main(String[] args) {
        try (Scanner scr = new Scanner(System.in)) {
            System.out.println("Enter the database:");
            String url = "jdbc:mysql://localhost:3306/" + scr.next();

           

            try {
            	 Class.forName("com.mysql.cj.jdbc.Driver");
            	Connection conn = DriverManager.getConnection(url, "root", "root");
            String sql="select  * from employee";
                 PreparedStatement pmst = conn.prepareStatement(sql);
                 
                 ResultSet rs = pmst.executeQuery();

                while (rs.next()) {
                    System.out.println("ID: " + rs.getInt("id"));
                    System.out.println("Name: " + rs.getString("name"));
                    System.out.println("Email: " + rs.getString("email"));
                    System.out.println("Salary: " + rs.getString("salary"));
                    System.out.println("Mobile Number: " + rs.getString("mobilenumber"));
                    System.out.println("Employee Role: " + rs.getString("employeeroll"));
                }
                System.out.println("Valid user");
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        }
    }
}