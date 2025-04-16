package Randomclasses;

public class Garden {
	
	int apple = 50;
	int applecount = 5;
	
	void totalapples() {
		System.out.println(apple*applecount);
	}

	public static void main(String[] args) {
		Garden gar = new Garden();
		gar.totalapples();

	}

}
