package com.bridgeit.CollectionInjection;

public class User {

	private String name;
	private String city;
	private String filename;
	
	public User()
	{
		
	}
	
	public User(String name,String city,String filename)
	{
		this.name=name;
		this.city=city;
		this.filename=filename;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}
	public String toString()
	{
		return "Name:"+name+", City:"+city+", Filename:"+filename;
	
	}
}
