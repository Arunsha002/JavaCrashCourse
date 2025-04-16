package com.lao.javaLearning;

public class CollectAmount 
{
	
	Integer collectedAmount = 5000;
	Integer collectedamountandreturned()
	{
		System.out.println("Collected Amount is " + collectedAmount);
		return collectedAmount;
		
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		CollectAmount amountobj = new CollectAmount();
		Integer amount = amountobj.collectedamountandreturned();
		System.out.println("Got the amount son " + amount);	

	}

}
