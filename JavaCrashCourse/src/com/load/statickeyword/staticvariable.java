package com.load.statickeyword;

public class staticvariable 
{	
	static int A=1;
	int B=2;

	public void function()
	{
	System.out.println("The Value is A is " + A);	
	}
	public static void main(String[] args) 
	{
	staticvariable objstatic = new staticvariable();
	System.out.println("The value of A is " + A);
	System.out.println("The value of B is " + objstatic.B);
	staticvariable objstatic2 = new staticvariable();
	objstatic2.A = 3;
	objstatic2.function();
	}

}
