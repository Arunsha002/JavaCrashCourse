package com.lao.conditionalStatements;

public class Superherofinder2 {
	
	String superhero;
	
	Superherofinder2(String Name)
	{
		superhero  = Name;
	}
	
	public void superheroornot()
	{
		switch (superhero) {
		case "Daddy":
			System.out.println("Yes, he is a super hero");
			break;
		case "Ironman":
			System.out.println("Yes, he is a super hero");
			break;
		case "Superman":
			System.out.println("Yes, he is a super hero");
			break;
		case "Spiderman":
			System.out.println("Yes, he is a super hero");
			break;
		default:
			System.out.println("No, he is NOT a super hero");
		}
	}

	public static void main(String[] args) {
		Superherofinder2 finder2 = new Superherofinder2("addy");
				finder2.superheroornot();


	}

}
