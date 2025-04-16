package Randomclasses;

public class School {
	
	void display() {
		System.out.println("Hey this is School");
	}
	void display(int a) {
		System.out.println("The value of A is "+a);
	}
	

	public static void main(String[] args) {
		
		School schobj = new School();
		schobj.display();
		schobj.display(5);
		
}
}
