package com.load.statickeyword;

public class staticblock {
	
	static {
		System.out.println("This is a static block");
	}
	
	{
		System.out.println("This is a Non- static block");
	}

	public static void main(String[] args) {
		
		System.out.println("This is the Main Method");
		@SuppressWarnings("unused")
		staticblock blocks = new staticblock();
		
	}

}
