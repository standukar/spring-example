package com.abc.rab3.pojos;

public class Driver {
	private int id;
	private String name;
	private String license;
	
	private address address; 
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLicense() {
		return license;
	}
	public void setLicense(String license) {
		this.license = license;
	}
	public address getAddress() {
		return address;
	}
	public void setAddress(address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Driver [id=" + id + ", name=" + name + ", license=" + license + ", address=" + address + "]";
	}
	
	
	
	

}
