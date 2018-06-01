package com.bridgeit.CollectionInjection;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Employee {

	private String name;
	private int id;
	private String desig;
	private List files;     //String collection list dependancy injection.
	private List fileuser;  // No String collection injection. 
	private Map users;      //String collection MAP injection.
	private Map usersInfo;  //No string collection MAP injection.

	public Employee() {

	}

	public Map getUsersInfo() {
		return usersInfo;
	}

	
	public Employee(String name, int id, String desig, List files, List fileuser, Map users, Map usersInfo) {
		super();
		this.name = name;
		this.id = id;
		this.desig = desig;
		this.files = files;
		this.fileuser = fileuser;
		this.users = users;
		this.usersInfo = usersInfo;
	}

	public void setUsersInfo(Map usersInfo) {
		this.usersInfo = usersInfo;
	}

	public Map getUsers() {
		return users;
	}

	public void setUsers(Map users) {
		this.users = users;
	}

	public List getFileuser() {
		return fileuser;
	}

	public void setFileuser(List fileuser) {
		this.fileuser = fileuser;
	}

	public List getFiles() {
		return files;
	}

	public void setFiles(List files) {
		this.files = files;
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

	public String getDesig() {
		return desig;
	}

	public void setDesig(String desig) {
		this.desig = desig;
	}

	public void dislay() {
		System.out.println("Name:" + name + ", Id:" + id + ", desig:" + desig);
		System.out.println("File names are:");
		Iterator it=files.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("File users are:");
		Iterator itr=fileuser.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("Users in Map:");
		Set set = users.entrySet();
		Iterator  iterator = set.iterator();
		while(iterator.hasNext())
		{
			
			Entry<FileInfo,User> entry= (Entry<FileInfo, User>) iterator.next();
			System.out.println("File Name:"+entry.getKey()+", UserName:"+entry.getValue());
		}
		System.out.println("Users Information is:");
		Set<Entry<FileInfo,User>> sets = usersInfo.entrySet();
		Iterator<Entry<FileInfo,User>>  iterator1 = sets.iterator();
		while(iterator1.hasNext())
		{
			Entry<FileInfo,User> entry= (Entry<FileInfo, User>) iterator1.next();
			FileInfo fi = (FileInfo) entry.getKey();
			User user = (User) entry.getValue();
			System.out.println("File Information:");
			System.out.println(fi);
			System.out.println("User information:");
			System.out.println(user);
		}
	}
}
