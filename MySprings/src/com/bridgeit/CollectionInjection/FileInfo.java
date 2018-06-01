package com.bridgeit.CollectionInjection;

import java.util.Date;

public class FileInfo {

	private String name;
	private int id;
	private Date postedDate;
	
	
	public FileInfo()
	{
		
	}
	public FileInfo(String name,int id,Date postedDate)
	{
		this.name=name;
		this.id=id;
		this.postedDate=postedDate;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getPostedDate() {
		return postedDate;
	}
	public void setPostedDate(Date postedDate) {
		this.postedDate = postedDate;
	}
	
	public String toString() {
		return "Name:"+name+", Id:"+id+", Date:"+postedDate;
	}
}
