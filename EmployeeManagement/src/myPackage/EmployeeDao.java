package myPackage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class EmployeeDao {
	public static void createEmployee(Employee employee)throws SQLException{
		Connection con = DB.connect();
		String query = Query.insert;
		PreparedStatement preparedStatement = con.prepareStatement(query);
		preparedStatement.setInt(1,employee.getId());
		preparedStatement.setString(2, employee.getName());
		preparedStatement.setString(3, employee.getEmail());
		preparedStatement.setInt(4, employee.getSalary());
		
		System.out.println("\n ps = " + preparedStatement +"\n" + employee);
		preparedStatement.executeUpdate();
		preparedStatement.close();	
	}
	
	public static void updateEmployee(int id, String name) throws SQLException{
		Connection con = DB.connect();
		String query = Query.update;
		PreparedStatement preparedStatement = con.prepareStatement(query);
		preparedStatement.setInt(2,id);
		preparedStatement.setString(1, name);
		System.out.println("\n ps = " + preparedStatement);
		preparedStatement.executeUpdate();
		preparedStatement.close();
	}
	
	public static ArrayList<Employee> readAllEmployes() throws SQLException{
		ArrayList<Employee> empList = new ArrayList<Employee>();
		Connection con = DB.connect();
		String query = Query.select;
		Statement statement = con.prepareStatement(query);
		System.out.println("\n st = "+statement);
		ResultSet rs = statement.executeQuery(query);
		
		while(rs.next()) {
			Employee emp = new Employee(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4));
			empList.add(emp);
		}
		statement.close();
		return empList;	
 	}
	
	public static void deleteEmployee(int id) throws SQLException{
		Connection con = DB.connect();
		String query = Query.delete;
		PreparedStatement preparedStatement = con.prepareStatement(query);
		preparedStatement.setInt(1,id);
		System.out.println("\n ps = " + preparedStatement);
		preparedStatement.executeUpdate();
		preparedStatement.close();
	}
	

}
