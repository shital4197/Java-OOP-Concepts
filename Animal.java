package com.oopsconcept;

	// Abstraction: Abstract class with an abstract method
	abstract class Animal {
	    String name;

	    Animal(String name) {   // Cunstructor 
	        this.name = name;
	    }

	    abstract void makeSound(); // Abstract method
	}

	// Encapsulation: Class with private fields and public getter/setter methods
	class Owner {
	    private String OwnerName;   // variables 
		private String Location;
		
		// Getter and Setter Methods
		public String getOwnerName() {
			return OwnerName;
		}
		public void setOwnerName(String ownerName) {
			this.OwnerName = ownerName;
		}
		public String getLocation() {
			return Location;
		}
		public void setLocation(String location) {
			Location = location;
		}
	    
	  
	}


