package com.lao.conditionalStatements;

public class LetsHaveACoffee {
	
	boolean iscupempty=false;
	
	public void checkthecup() {
		if(iscupempty)
		{
			System.out.println("Fill the Cup as it is Empty");
		}
		else
		{
			System.out.println("Here's your coffee, Have it!");
		}
	}

	public static void main(String[] args) {
		
		LetsHaveACoffee coffee =  new LetsHaveACoffee();
		coffee.checkthecup();
	}

}
