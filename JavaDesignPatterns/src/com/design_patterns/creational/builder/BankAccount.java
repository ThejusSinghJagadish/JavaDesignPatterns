package com.design_patterns.creational.builder;

public class BankAccount {
	
	public static class Builder{
		private long accountNumber;
		private String user;
		private String branch;
		private double openingBalance;
		private double roi;
		
		public Builder(long accountNumber, String user){
			this.accountNumber = accountNumber;
			this.user = user;
		}
		
		public Builder atBranch(String branch){
			this.branch = branch;
			return this;
		}
		
		public Builder withOpeningBalance(double openingBalance){
			this.openingBalance = openingBalance;
			return this;
		}
		
		public Builder atRate(double roi){
			this.roi = roi;
			return this;
		}
		
		public BankAccount build(){
			return new BankAccount(this.accountNumber, this.user, this.branch, this.openingBalance, this.roi);
		}
	}
	
	private long accountNumber;
	private String user;
	private String branch;
	private double openingBalance;
	private double roi;
	
	private BankAccount(long accountNumber, String user, String branch, double openingBalance, double roi) {
		this.accountNumber = accountNumber;
		this.user = user;
		this.branch = branch;
		this.openingBalance = openingBalance;
		this.roi = roi;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public double getOpeningBalance() {
		return openingBalance;
	}

	public void setOpeningBalance(double openingBalance) {
		this.openingBalance = openingBalance;
	}

	public double getRoi() {
		return roi;
	}

	public void setRoi(double roi) {
		this.roi = roi;
	}
	
	public String getDetails(){
		return this.toString();
	}
	
	@Override
	public String toString(){
		StringBuilder sb = new StringBuilder("**************************");
		sb.append('\n').append("Account Info");
		sb.append('\n').append("**************************");
		sb.append('\n').append("Account # :").append(this.accountNumber);
		sb.append('\n').append("User :").append(this.user);
		sb.append('\n').append("Branch :").append(this.branch);
		sb.append('\n').append("Balance :").append("$").append(this.openingBalance);
		sb.append('\n').append("ROI :").append(this.roi).append("%");
		sb.append('\n').append("--------------------------").append('\n').append('\n');
		
		return sb.toString();
	}
}
