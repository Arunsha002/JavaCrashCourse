package Randomclasses;

public class Find {
	
	void evenorodd(int a){
		if(a%2==0)
			System.out.println( a +" is a even number");
		else
			System.out.println( a +" is a odd number");
	}

	public static void main(String[] args) {
		Find find1 = new Find();
		find1.evenorodd(8);

	}

}
