package db_connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DB_Connection {
	static Connection connection = null;
//	static String databaseName = "";
	static String url ="jdbc:mysql://localhost:3306/";
	static String username = "root";
	static String password = "root";
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		connection = DriverManager.getConnection(url,username,password);
		PreparedStatement ps = connection.prepareStatement("SELECT * FROM ovaledge.customer;");
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			System.out.print("Customer_ID: "+rs.getInt("customer_id"));
			System.out.print(",\t Customer_Name: "+rs.getString("cust_name"));
			System.out.print(",\t City: "+rs.getString("city"));
			System.out.print(",\t\t Grade: "+rs.getString("grade"));
			System.out.println(",\t Salesman_ID: "+rs.getInt("salesman_id"));
		}
	}

}
