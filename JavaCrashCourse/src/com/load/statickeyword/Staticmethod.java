package com.load.statickeyword;

public class Staticmethod {
	
	public static void method1()
	{
		System.out.println("This is a static method");
	}
	
	public void method2()
	{
		System.out.println("This is a Non-static method");
		method1();
	}

	public static void main(String[] args) {

		Staticmethod callmethod = new Staticmethod();
		callmethod.method2();
	}

}
