package com.masai.que4;

public class Bank_Account {

	private String name;
	private int Acc_No;
	private double balance = 1000;

	public Bank_Account(String name, int acc_No, double balance) {
		super();
		this.name = name;
		Acc_No = acc_No;
		this.balance = balance;
	}

	public Bank_Account() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAcc_No() {
		return Acc_No;
	}

	public void setAcc_No(int acc_No) {
		Acc_No = acc_No;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Bank_Account [name=" + name + ", Acc_No =" + Acc_No + ", balance = " + balance + "]";
	}

}
