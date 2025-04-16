package com.lao.inheritance;

class a{
	int a;
}

class b extends a{
	int b;
}

class c extends b{
	int c;
}

public class ABC {

	public static void main(String[] args) {
		c c1 = new c();
		c1.c=3;
		c1.b=2;
		c1.a=1;
		System.out.println("The value of class c is "+c1.c);
		System.out.println("The value of class b is "+c1.b);
		System.out.println("The value of class a is "+c1.a);
		

	}

}
