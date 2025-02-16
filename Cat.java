package com.oopsconcept;

// Inheritance: Cat class inherits from Animal
class Cat extends Animal {
    Cat(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println(name + " meows: Meow meow!");
    }
}
