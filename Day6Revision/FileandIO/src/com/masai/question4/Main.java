package com.masai.que4;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("start");
		System.out.println("Enter your Name");

		String name = sc.next();
		System.out.println("Enter your Account No");

		int Acc_No = sc.nextInt();
		System.out.println("Enter your Money");

		double balance = sc.nextDouble();

		Bank_Account a = new Bank_Account();
		a.setName(name);
		a.setAcc_No(Acc_No);

		if (a.getBalance() > balance) {
			double d = a.getBalance() - balance;
			a.setBalance(d);
			File c = new File("newFile.txt");
			try {
				FileWriter e = new FileWriter(c);

				e.write("Name is " + a.getName());
				e.write("  Account No is " + a.getAcc_No());
				e.write(" Available balance " + a.getBalance());
				e.close();
			} catch (Exception e) {
				// TODO: handle exception
				throw new ServerDownException("Server down");
			}
		} else {
			Exception e = new Exception("Your Account have Low Blance");
			System.out.println(e.getMessage());

		}
	}
}

