package com.design_patterns.creational.builder;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount account1 = new BankAccount.Builder(123456789, "Thejus").atBranch("Santa Clara").withOpeningBalance(1000.00).atRate(2.5).build();
		BankAccount account2 = new BankAccount.Builder(987654331, "Singh").atBranch("Hoffman Estates").build();
		
		System.out.println(account1.getDetails());
		
		System.out.println(account2.getDetails());
	}

}
