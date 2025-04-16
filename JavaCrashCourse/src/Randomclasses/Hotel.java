package Randomclasses;

public class Hotel {
	
	int Tea;
	int Coffee;
	int Boost;
	int Horlicks;
	int Milk;

	public static void main(String[] args) {
		
		Hotel server1 = new Hotel();
		server1.Tea = 10;
		server1.Coffee = 20;
		System.out.println("Cost of Tea " + server1.Tea);
		Hotel server2 = new Hotel();
		server2.Boost=40;
		System.out.println("Cost of Coffee " + server1.Coffee);
		System.out.println("Cost of Boost " + server2.Boost);
	


	}

}
