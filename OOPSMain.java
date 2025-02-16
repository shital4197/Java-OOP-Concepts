package com.oopsconcept;

public class OOPSMain {
	
	// Polymorphism: Demonstrating method overriding and dynamic method dispatch
	    public static void main(String[] args) {
	        Animal myDog = new Dog("Moti");        // Polymorphism: Animal reference, Dog object
	        Animal myCat = new Cat("Mini");

	        myDog.makeSound(); // Calls Dog's makeSound method
	        myCat.makeSound(); // Calls Cat's makeSound method

	        // Encapsulation in action
	        Owner o1 = new Owner();
	        o1.setOwnerName("Samir Jadhav");
	        System.out.println("Owner Name: " + o1.getOwnerName());

	        o1.setLocation("Pune");
	        System.out.println("Owner Location: " + o1.getLocation());
	    }
	}