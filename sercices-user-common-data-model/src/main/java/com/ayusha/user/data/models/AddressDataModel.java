package com.ayusha.user.data.models;


public class AddressDataModel {
	
	
    private long id; 
    /** address one **/
	private String addrLineOne ="";
	
	 /** address two **/
	private String addrLineTwo ="";
	
	 /** city **/
	private String city ="";

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAddrLineOne() {
		return addrLineOne;
	}

	public void setAddrLineOne(String addrLineOne) {
		this.addrLineOne = addrLineOne;
	}

	public String getAddrLineTwo() {
		return addrLineTwo;
	}

	public void setAddrLineTwo(String addrLineTwo) {
		this.addrLineTwo = addrLineTwo;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	
	
}
