package db_connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DB_Connect {

	static Connection connection = null;
//	static String databaseName = "";
	static String url = "jdbc:mysql://localhost:3306/" ;
	static String username = "root"; 
	static String password = "root";

	public static void main(String[] args)
			throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		List<Customers> list = new ArrayList<Customers>();
		Class.forName("com.mysql.cj.jdbc.Driver");
		connection = DriverManager.getConnection(url, username, password);
		PreparedStatement ps = connection.prepareStatement("SELECT * FROM ovaledge.customer;");
		ResultSet rs = ps.executeQuery();
	
		while(rs.next()) {
			Customers cus = new Customers();
			cus.setCustomer_id(rs.getInt("customer_id"));
			cus.setCustomer_name(rs.getString("cust_name"));
			cus.setCity(rs.getString("city"));
			cus.setGrade(rs.getInt("grade"));
			cus.setSalesman_id(rs.getInt("salesman_id"));
	//		list.add(cus.setCustomer_id(rs.getString("customer_id")));
	//		System.out.print("Customer_ID ::"+cus.getCustomer_id());
	//		cus.setCustomer_name(rs.getString("cust_name"));
	//		System.out.print("\tCustomer_Name ::"+cus.getCustomer_name());
	//		cus.setCity(rs.getString("city"));
	//		System.out.print("\tCity ::"+cus.getCity());
	//		cus.setGrade(rs.getString("grade"));
	//		System.out.print("\t\tGrade ::"+cus.getGrade());
	//		cus.setSaleman_id(rs.getString("salesman_id"));
	//		System.out.println("\tSalesman_ID ::"+cus.getSaleman_id());
			list.add(cus);
		}
//		System.out.println(list.size());
		for (Customers customers : list) {
			System.out.println(customers);
		}
	}
}