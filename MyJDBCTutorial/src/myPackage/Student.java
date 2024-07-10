package myPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Student {

	public void createDatabase() {
	// connection established 
		
		try {
			String url = "jdbc:mysql://localhost:3306/";
			//String db = "dbjdbc";
			String userName = "root";
			String password = "1234";
			Connection conn = DriverManager.getConnection(url,userName,password);	
			//statement create
			Statement stm =  conn.createStatement();
			
			
			//execute query
			String query = "create database dbjdbc";
			stm.execute(query);
			System.out.println("Database created Successfully");
			conn.close(); 	//connection close
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void createTable() {
	}


	public void createData() {
		try {
			String url = "jdbc:mysql://localhost:3306/";
			String db = "dbjdbc";
			String userName = "root";
			String password = "1234";
			Connection conn = DriverManager.getConnection(url+db,userName,password);	
			
			
			
			//execute query
			String query = "INSERT into student (sid,sname,semail) VALUES (?,?,?)";
			
			//statement create
			PreparedStatement pstm =  conn.prepareStatement(query);
			pstm.setInt(1, 20);
			pstm.setString(2, "sonu");
			pstm.setString(3, "sonu@gmail.com");
			pstm.executeUpdate();
			System.out.println("Data Inserted Successfully");
			conn.close(); 	//connection close
		}catch (Exception e) {
			e.printStackTrace();
		}
		 
	}

	public void readData() {
		try {
			String url = "jdbc:mysql://localhost:3306/";
			String db = "dbjdbc";
			String userName = "root";
			String password = "1234";
			Connection conn = DriverManager.getConnection(url+db,userName,password);	
			
			
			
			//execute query
			String query = "SELECT * FROM student";
			
			//statement create
			Statement stm =  conn.createStatement();
			ResultSet rs = stm.executeQuery(query);
			while(rs.next()) {
				System.out.println("Id = "+rs.getInt(1));
				System.out.println("Name = "+rs.getString(2));
				System.out.println("Email = "+rs.getString(3));
			}
			System.out.println("Read Successfully");
			conn.close(); 	//connection close
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	public void updateData() {
		try {
			String url = "jdbc:mysql://localhost:3306/";
			String db = "dbjdbc";
			String userName = "root";
			String password = "1234";
			Connection conn = DriverManager.getConnection(url+db,userName,password);	
			
			
			
			//execute query
			String query = "update student set sid = ? where sname = ?";
			
			//statement create
			PreparedStatement pstm =  conn.prepareStatement(query);
			pstm.setInt(1, 30);
			pstm.setString(2, "sonu");
			
			pstm.executeUpdate();
			System.out.println("Data Update Successfully");
			conn.close(); 	//connection close
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	public void deleteData() {
		
		try {
			String url = "jdbc:mysql://localhost:3306/";
			String db = "dbjdbc";
			String userName = "root";
			String password = "1234";
			Connection conn = DriverManager.getConnection(url+db,userName,password);	
			
			
			
			//execute query
			String query = "DELETE from student WHERE sid = ?";
			
			//statement create
			PreparedStatement pstm =  conn.prepareStatement(query);
			pstm.setInt(1,30);
			pstm.execute();
			System.out.println("Data deleted Successfully");
			conn.close(); 	//connection close
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
