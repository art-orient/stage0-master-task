package com.epam.OOP;

public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    String getDescription() {
        String article = hasFur ? "a" : "no";
        return "This animal is mostly " + color + ". It has " + numberOfPaws + " paws and " +
                article + " fur.";
    }
}
