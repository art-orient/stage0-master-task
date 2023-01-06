package com.epam.OOP;

public class Test {
    public static void main(String[] args) {
        Animal animal = new Animal("gray", 4, true);
        Animal bird = new Bird();
        Animal dog = new Dog();
        System.out.println(animal.getDescription());
        System.out.println(bird.getDescription());
        System.out.println(dog.getDescription());
    }
}
