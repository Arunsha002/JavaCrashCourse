package Randomclasses;

public class parameters {
	
	void sum(int a, int b)
	{
		System.out.println(a+b);
	}
	void mul(int a, int b, int c)
	{
		System.out.println(a*b*c);
	}
	void div(int a, int b)
	{
		System.out.println(a/b);
	}

	public static void main(String[] args) {
		parameters add = new parameters();
		add.sum(10,20);
		add.mul(10, 20, 30);
		parameters div = new parameters();
		div.div(100, 2);
		
	}

}
