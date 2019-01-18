package com.design_patterns.creational.prototype;

public class User {
	private String userName;
	private String level;
	private AccessControl accessControl;
	
	public User(String userName, String level, AccessControl accessControl){
		this.userName = userName;
		this.level = level;
		this.accessControl = accessControl;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public AccessControl getAccessControl() {
		return accessControl;
	}

	public void setAccessControl(AccessControl accessControl) {
		this.accessControl = accessControl;
	}
	
	public String getInfo(){
		return this.toString();
	}
	
	@Override
	public String toString(){
		StringBuilder sb  = new StringBuilder();
		sb.append("User Name: ").append(this.getUserName()).append('\n');
		sb.append("Level: ").append(this.getLevel()).append('\n');
		sb.append("Access Control Level").append('\n');
		sb.append("Control Level: ").append(this.getAccessControl().getControlLevel()).append('\n');
		sb.append("Access: ").append(this.getAccessControl().getAccess()).append('\n');
		return sb.toString();
	}
}
