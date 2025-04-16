package com.lao.javaLearning;

public class Animal {
	
	String AnimalName;
	String AnimalType;

	Animal(String name, String type){
		AnimalName = name;
		AnimalType = type;
	}
	
	public void animaldetails() {
		System.out.println("Animal name is " + AnimalName + " Animal Type is " + AnimalType);
	}
	

	public static void main(String[] args) {
		
		Animal ani1 = new Animal("Cat", "Silent");
		ani1.animaldetails();
		Animal ani2 = new Animal("Dog", "Violent");
		ani2.animaldetails();

	}

}
