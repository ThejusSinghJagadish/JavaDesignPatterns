package com.design_patterns.creational.prototype;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AccessControl userAccessControl1 = AccessControlProvider.getAccessControl("USER");
		User user1 = new User("Thejus", "User Level", userAccessControl1);
		
		AccessControl userAccessControl2 = AccessControlProvider.getAccessControl("USER");
		User user2 = new User("Singh", "User Level", userAccessControl2);
		
		user1.getAccessControl().setAccess("Access Denied");
		
		System.out.println(user1.getInfo());
		System.out.println(user2.getInfo());
	}

}
