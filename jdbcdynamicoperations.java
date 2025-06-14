package dynamicoperations;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import com.mysql.cj.jdbc.JdbcConnection;
import com.mysql.cj.jdbc.JdbcPreparedStatement;

	public class dynamicexample {

		private static final String Driver = "com.mysql.cj.jdbc.Driver";
		private static final String username = "root";
		private static final String password = "root";
		private static final String Scanner = null;
		private static Connection conn;
		private static PreparedStatement pmst;
		private static String sql;
		private static String url;

		public static void main(String[] args) {
			try (Scanner scr = new Scanner(System.in)) {
				int value;
				do {
					displaymenu();
					value = Integer.parseInt(scr.next());

					switch (value) {
					case 1:
						createdatabase();
						break;
					case 2:
						deletedatabase();
						break;
					case 3:
						addemployee();
						break;
					case 4:
						updateemployeenumber();
						break;
					case 5:
						updateemployeeemail();
						break;
					case 6:
						allrecords();
						break;
					case 7:
						recordbyroll();
						break;
					case 8:
						recordbyemployeemobilenumber();
						break;
					case 9:
						recordsalary();
						break;
					case 10:
						recordemail();
						break;
					case 11:
						employeelogin();
						break;
					case 12:
						System.exit(0);
						break;

					default:
						System.out.println("invaild option");
						break;
					}

				} while (value > 0);
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		

		private static void employeelogin() {
			// TODO Auto-generated method stu
			try    {
				Scanner scr = new Scanner(System.in);
				System.out.println("Enter the database:");
		        String url = "jdbc:mysql://localhost:3306/" + scr.next();
		        Class.forName(Driver);

		        conn = DriverManager.getConnection(url, username, password);
		        String sql = "select * from employee where email = ? AND id = ?";
		        pmst = conn.prepareStatement(sql);
		        System.out.println("Enter email:");
		        pmst.setString(1, scr.next());
		        System.out.println("Enter id:");
		        pmst.setString(2, scr.next());
		        ResultSet rs = pmst.executeQuery();
		        if (rs.next()) {
		            System.out.println("Login successful!");
		        } else {
		            System.out.println("Invalid email or password.");
		        }
		    } catch (Exception e) {
		        e.printStackTrace();
		    }
		}
		private static void recordbyemployeemobilenumber() {
			// TODO Auto-generated method stub
			try   {
				Scanner scr = new Scanner(System.in);
				System.out.println("enter the database");
				
				String url = "jdbc:mysql://localhost:3306/" + scr.next();
				Class.forName(Driver);
				conn=DriverManager.getConnection(url,username,password);
				String sql="select * from employee where mobilenumber=?";
				pmst=conn.prepareStatement(sql);
				System.out.println("enter the mobilenumber:");
				pmst.setString(1, scr.next());
			    ResultSet rs = pmst.executeQuery();
			   // pmst.executeQuery();
			    		while(rs.next()) {
			    			System.out.println("id: "+rs.getInt("id"));
			    			System.out.println("name: "+rs.getString("name"));
			    			System.out.println("email: "+rs.getString("email"));
			   		}
			    		System.out.println("valid user");
			    		
			
			    pmst.close();
			    conn.close();
               } catch(Exception e) {
				e.printStackTrace();
			
			}
		}

		private static void recordemail() {
			// TODO Auto-generated method stub
			try   {
				Scanner scr = new Scanner(System.in);
				System.out.println("enter the database");
				
				String url = "jdbc:mysql://localhost:3306/" + scr.next();
				Class.forName(Driver);
				conn=DriverManager.getConnection(url,username,password);
				String sql="select * from employee where email=?";
				pmst=conn.prepareStatement(sql);
				System.out.println("enter the email:");
				pmst.setString(1, scr.next());
			    ResultSet rs = pmst.executeQuery();
			   // pmst.executeQuery();
			    		while(rs.next()) {
			    			System.out.println("id: "+rs.getInt("id"));
			    			System.out.println("name: "+rs.getString("name"));
			    			System.out.println("email: "+rs.getString("email"));
			   		}
			    		System.out.println("valid user");
			    		
			
			    pmst.close();
			    conn.close();
               } catch(Exception e) {
				e.printStackTrace();
			
			}
		}
			

		private static void recordsalary() {
			
	      
			// TODO Auto-generated method stub
			try   {
				Scanner scr = new Scanner(System.in);
				System.out.println("enter the database");
				
				String url = "jdbc:mysql://localhost:3306/" + scr.next();
				Class.forName(Driver);
				conn=DriverManager.getConnection(url,username,password);
				String sql="select * from employee where salary=?";
				pmst=conn.prepareStatement(sql);
				System.out.println("enter the salary:");
				pmst.setString(1, scr.next());
			    ResultSet rs = pmst.executeQuery();
			   // pmst.executeQuery();
			    		while(rs.next()) {
			    			System.out.println("id: "+rs.getInt("id"));
			    			System.out.println("name: "+rs.getString("name"));
			    			System.out.println("email: "+rs.getString("email"));
			   		}
			    		System.out.println("valid user");
			    		
			
			    pmst.close();
			    conn.close();
               } catch(Exception e) {
				e.printStackTrace();
			
			}

		}
			

		private static void recordbyroll() {
			// TODO Auto-generated method stub
			try   {
				Scanner scr = new Scanner(System.in);
				System.out.println("enter the database");
				
				String url = "jdbc:mysql://localhost:3306/" + scr.next();
				Class.forName(Driver);
				conn=DriverManager.getConnection(url,username,password);
				String sql="select * from employee where id=?";
				pmst=conn.prepareStatement(sql);
				System.out.println("enter the id:");
				pmst.setString(1, scr.next());
			    ResultSet rs = pmst.executeQuery();
			   // pmst.executeQuery();
			    		while(rs.next()) {
			    			System.out.println("id: "+rs.getInt("id"));
			    			System.out.println("name: "+rs.getString("name"));
			    			System.out.println("email: "+rs.getString("email"));
			   		}
			    		System.out.println("valid user");
			    		
			
			    pmst.close();
			    conn.close();
               } catch(Exception e) {
				e.printStackTrace();
			
			}
		}

		private static void allrecords() {
			// TODO Auto-generated method stub
			try   {
				Scanner scr = new Scanner(System.in);
				System.out.println("enter the database");
				
				String url = "jdbc:mysql://localhost:3306/" + scr.next();
				Class.forName(Driver);
				conn=DriverManager.getConnection(url,username,password);
				String sql="select * from employee";
				pmst=conn.prepareStatement(sql);
				//System.out.println("enter the database:");
				//pmst.setString(1, scr.next());
			    ResultSet rs = pmst.executeQuery();
			   // pmst.executeQuery();
			    		while(rs.next()) {
			    			System.out.println("id: "+rs.getInt("id"));
			    			System.out.println("name: "+rs.getString("name"));
			    			System.out.println("email: "+rs.getString("email"));
			    			System.out.println("salary: "+rs.getString("salary"));
			    			System.out.println("mobilenumber: "+rs.getString("mobilenumber"));
			    			System.out.println("employeeroll: "+rs.getString("employeeroll"));
			   		}
			    		System.out.println("valid user");
			    		
			
			    pmst.close();
			    conn.close();
               } catch(Exception e) {
				e.printStackTrace();
			
			}
		}


		private static void updateemployeeemail() {
			
			// TODO Auto-generated method stub
			try   {
				Scanner scr = new Scanner(System.in);
				System.out.println("enter the database");
				Class.forName(Driver);
	
			String url = "jdbc:mysql://localhost:3306/" + scr.next();
			conn=DriverManager.getConnection(url, username, password);
				String sql ="update employee set id = ?, name = ?, email = ?, salary=?,employeeroll=? where email = ?";
			    pmst = conn.prepareStatement(sql);
			    System.out.println("enter new id :");
			    pmst.setString(1, scr.next());
			    System.out.println("enter  new name:");
			    pmst.setString(2, scr.next());
			    System.out.println("enter new  email :");
			    pmst.setString(3, scr.next());
			    System.out.println("enter new  salary :");
			    pmst.setString(4, scr.next());
			    System.out.println("enter new  employeeroll:");
			    pmst.setString(5, scr.next());
			    System.out.println("enter the email to update:");
			    pmst.setString(6, scr.next());
			    int i = pmst.executeUpdate();
			    if(i>0) {
			    	System.out.println("data succesfully updated");
			    }
			    else {
			    	System.out.println("data is not inserted");
			    }
				
			}
			catch (Exception e) {
				e.printStackTrace();
			}
	}

		private static void updateemployeenumber() {
		
			// TODO Auto-generated method stub
				
				
				try   {
					Scanner scr = new Scanner(System.in);
					System.out.println("enter the database");
					Class.forName(Driver);
		
				String url = "jdbc:mysql://localhost:3306/" + scr.next();
				conn=DriverManager.getConnection(url, username, password);
					String sql ="update employee set id = ?, name = ?, email = ?, salary=?,employeeroll=? where mobilenumber = ?";
				    pmst = conn.prepareStatement(sql);
				    System.out.println("enter new id :");
				    pmst.setString(1, scr.next());
				    System.out.println("enter  new name:");
				    pmst.setString(2, scr.next());
				    System.out.println("enter new  email :");
				    pmst.setString(3, scr.next());
				    System.out.println("enter new  salary :");
				    pmst.setString(4, scr.next());
				    System.out.println("enter new  employee :");
				    pmst.setString(5, scr.next());
				    System.out.println("enter the mobile number to update:");
				    pmst.setString(6, scr.next());
				    int i = pmst.executeUpdate();
				    if(i>0) {
				    	System.out.println("data succesfully updated");
				    }
				    else {
				    	System.out.println("data is not inserted");
				    }
					
				}
				catch (Exception e) {
					e.printStackTrace();
				}
		}

		private static void addemployee() {
			try    {
				Scanner scr = new Scanner(System.in);
				System.out.println("enter the database");
				String url = "jdbc:mysql://localhost:3306/" + scr.next();
				Class.forName(Driver);

				conn = DriverManager.getConnection(url, username, password);
          		String sql = "insert into employee(id,name,email,salary,mobilenumber,employeeroll)values(?,?,?,?,?,?)";
				pmst = conn.prepareStatement(sql);
				System.out.println("enter id :");
				pmst.setString(1, scr.next());
				System.out.println("enter name:");
				pmst.setString(2, scr.next());
				System.out.println("enter email:");
				pmst.setString(3, scr.next());
				System.out.println("enter salary :");
				pmst.setString(4, scr.next());
				System.out.println("enter mobilenumber :");
				pmst.setString(5, scr.next());
				System.out.println("enter employeeroll :");
				pmst.setString(6, scr.next());
				int i = pmst.executeUpdate();
				if (i > 0) {
					System.out.println("data inserted");
				} else {
					System.out.println("data is not inserted");
				}

			} catch (Exception e) {
				e.printStackTrace();
			}

		}

		private static  void deletedatabase() {
			try  {
				Scanner scr = new Scanner(System.in);
				Class.forName(Driver);
				conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/", username, password);
				System.out.println("Enter the delete database name : ");
				String sql = "drop database " + scr.next();
				pmst = conn.prepareStatement(sql);
				int i = pmst.executeUpdate();
				if (i == 0) {
					System.out.println("database deleted");
				} else {
					System.out.println("database not deleted");
				}
				conn.close();
				pmst.close();

			} catch (Exception e) {
				e.printStackTrace();
			}

		}

		private static void createdatabase() {
			try  {
				Scanner scr = new Scanner(System.in);
				Class.forName(Driver);
				conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/", username, password);
				System.out.println("Enter the database name : ");
				String sql = "create database " + scr.next();
				pmst = conn.prepareStatement(sql);
				int i = pmst.executeUpdate();
				if (i > 0) {
					System.out.println("database created");
				} else {
					System.out.println("database not created");
				}
				conn.close();
				pmst.close();

			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		private static void displaymenu() {

			System.out.println("_");
			System.out.println("Developed By : prabhas ");
			System.out.println("Role : Java Developer ");
			System.out.println("_");
			System.out.println("choose any method which u want to perform :");
			System.out.println("\t1.Create Database");
			System.out.println("\t2.Delete Database");
			System.out.println("\t3.Add Employee");
			System.out.println("\t4.update Employee By mobilenumber");
			System.out.println("\t5.update Employee By Email");
			System.out.println("\t6.All Records");
			System.out.println("\t7.Find Record By EmployeeRoll");
			System.out.println("\t8.Find Record By employeemobilenumber");
			System.out.println("\t9.Find Record By Salary");
			System.out.println("\t10.Find Record By employee email");
			System.out.println("\t11.Employee login");
			System.out.println("\t12.exit");
			System.out.println("_");

		}
	}
