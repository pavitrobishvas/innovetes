package com.ayusha.user.data.models;


public class EmployeeAddressDataModel {

	
	private long id;

	 /** employee id **/
    private EmployeeDataModel employee ;

    /** address id **/
    private AddressDataModel address;
    /** address type **/
	private String addressType = "";
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public EmployeeDataModel getEmployee() {
		return employee;
	}
	public void setEmployee(EmployeeDataModel employee) {
		this.employee = employee;
	}
	public AddressDataModel getAddress() {
		return address;
	}
	public void setAddress(AddressDataModel address) {
		this.address = address;
	}
	public String getAddressType() {
		return addressType;
	}
	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}
	@Override
	public String toString() {
		return "EmployeeAddressDataModel [id=" + id + ", employee=" + employee + ", address=" + address
				+ ", addressType=" + addressType + "]";
	}
	
	
}
