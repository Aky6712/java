package myPackage;

public class Query {
	static String insert = "INSERT INTO employee(id,name,email,salary) VALUES(?, ?, ?, ?)";
	static String update = "Update employee SET name = ? WHERE id = ?";
	static String delete = "DELETE FROM employee WHERE id = ?";
	static String select = "SELECT * FROM employee";

}
