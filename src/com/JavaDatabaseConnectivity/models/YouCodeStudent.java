package com.JavaDatabaseConnectivity.models;

import java.sql.SQLException;

import com.JavaDatabaseConnectivity.controller.Controller;

public class YouCodeStudent {
	private String name;
	private String description;
	private String cin;

	public YouCodeStudent(String name, String description, String cin) {
		super();
		this.name = name;
		this.description = description;
		this.cin = cin;
	}

	public YouCodeStudent() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCin() {
		return cin;
	}

	public void setCin(String cin) {
		this.cin = cin;
	}

	public void addStudent(String name, String description, String cin) throws ClassNotFoundException, SQLException {
		Controller addStudent = new Controller();
		addStudent.add(name, description, cin);

	}

	public void editStudent() {
	}

	public void removeStudent() {
	}

	public void showStudent() {
	}
}
