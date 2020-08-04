package com.ayusha.user.data.models;

import java.util.Date;
import java.util.UUID;


public class EmployeeDataModel {
	
    private long id;
	
    /** employee name **/
	private String name="";
	
	/** employee dob **/
	private String dateOfBirth="";

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public EmployeeDataModel(long id, String name, String dateOfBirth) {
		super();
		this.id = id;
		this.name = name;
		this.dateOfBirth = dateOfBirth;
	}
	
	public EmployeeDataModel() {
	}

	@Override
	public String toString() {
		return "EmployeeDataModel [id=" + id + ", name=" + name + ", dateOfBirth=" + dateOfBirth + "]";
	}
	
	

}
