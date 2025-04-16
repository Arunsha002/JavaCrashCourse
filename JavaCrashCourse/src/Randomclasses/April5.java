package Randomclasses;

class Person{
	String name;
	
	Person(String names)
	{
		name = names;
		System.out.println("The Employee name is " +name);
	}
}

class Employee extends Person{
	
	Employee(String name){
		
		super(name);
		
	}
	
	
}

public class April5 {
	
public static void main(String[] args) {

Employee E1 = new Employee("Arun");

}
}
