package com.MODEL;

public class User {
    protected int id;
    protected String first_name;
    protected String last_name;
    protected String street;
    protected String address;
    protected String city;
    protected String email;
    protected String phone;
    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public User(String first_name, String last_name, String street, String address, String city, String email,
			String phone) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.street = street;
		this.address = address;
		this.city = city;
		this.email = email;
		this.phone = phone;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int id, String first_name, String last_name, String street, String address, String city, String email,
			String phone) {
		super();
		this.id = id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.street = street;
		this.address = address;
		this.city = city;
		this.email = email;
		this.phone = phone;
	}
	

    






   
}
