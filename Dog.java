package com.oopsconcept;

// Inheritance: Dog class inherits from Animal
class Dog extends Animal {
    Dog(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println(name + " barks: Woof woof!");
    }
}