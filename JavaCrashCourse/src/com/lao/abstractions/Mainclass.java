package com.lao.abstractions;

abstract class Vehicle {
	abstract void speed();
	void engine() {
		System.out.println("This is a Engine Component");
	}
}

class Bike extends Vehicle{
	void speed() {
		System.out.println("The Speed of the Bike is 100kmph");
	}
	
	void engine() {
		System.out.println("This is a Bike's Engine");
	}
}
	

class Car extends Vehicle {

void speed() {
	
	System.out.println("The Speed of the Car is 200kmph");
}
}	
public class Mainclass {

	public static void main(String[] args) {
	Bike b1 = new Bike();
	b1.speed();
	b1.engine();
	
	Car c1 = new Car();
	c1.engine();
	
	}
}


