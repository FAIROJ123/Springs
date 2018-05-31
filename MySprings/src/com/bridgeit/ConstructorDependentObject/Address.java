package com.bridgeit.ConstructorDependentObject;

public class Address {

	private String city;
	private String dist;
	private String village;
	
	public Address()
	{
		
	}
	
	public Address(String city,String dist,String village)
	{
		this.city=city;
		this.dist=dist;
		this.village=village;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDist() {
		return dist;
	}

	public void setDist(String dist) {
		this.dist = dist;
	}

	public String getVillage() {
		return village;
	}

	public void setVillage(String village) {
		this.village = village;
	}
	
	public String toString() {
		return "City:"+city+",Dist:"+dist+",village:"+village;
	}
}
