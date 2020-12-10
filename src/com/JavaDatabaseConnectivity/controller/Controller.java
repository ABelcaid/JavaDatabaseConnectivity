package com.JavaDatabaseConnectivity.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.JavaDatabaseConnectivity.models.DbConnection;

public class Controller {

	String url = "jdbc:mysql://localhost:3306/java_db";
	String username = "root";
	String password = "";

	DbConnection connection = new DbConnection(url, username, password);

	public void add(String name, String description, String cin) throws ClassNotFoundException, SQLException {

// the mysql insert statement

		String query = " insert into youcode (name, description, cin)" + " values (?, ?, ?)";

// create the mysql insert Preparedstatement

		Connection con = connection.connection();
		PreparedStatement preparedStmt = con.prepareStatement(query);
		preparedStmt.setString(1, name);
		preparedStmt.setString(2, description);
		preparedStmt.setString(3, cin);

// execute the preparedstatement
		preparedStmt.execute();
	}
}
