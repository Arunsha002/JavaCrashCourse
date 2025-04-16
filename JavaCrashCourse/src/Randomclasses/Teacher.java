package Randomclasses;

public class Teacher {
	String myname;

	Teacher()
	{
		System.out.println("Teacher");
	}
	void setname(String myname) {
		this.myname = myname;
	}
	public static void main(String[] args) {
		Teacher T1 = new Teacher();
		T1.setname("Mark");
		System.out.println(T1.myname);

	}

}
