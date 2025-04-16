package com.lao.javaLearning;

public class BankAccount {
	
	Long accountNumber = 12345678l;
	String holderName = "Arun";
	Integer accountBalance = 1000;
	 Integer debitedAmount = 200;
	
	public void findbalance()
	{
		System.out.println("Balance is " + accountBalance);
	}
	
	public void deductamount()
	{
		accountBalance = accountBalance - debitedAmount;
		System.out.println("The Deducted amount is " + debitedAmount + ", The New balance is " + accountBalance );
	}

	public static void main(String[] args) {
		//ClassName ObjectName = New  ClassName();
		
		BankAccount account = new BankAccount();
		account.findbalance();
		account.deductamount();
	}

}
