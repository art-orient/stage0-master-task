package com.epam.conditions;

public class TriangleSidesValidator {

    public void validate(double firstSide, double secondSide, double thirdSide) {
        boolean isValid = firstSide + secondSide > thirdSide &&
                secondSide + thirdSide > firstSide &&
                firstSide + thirdSide > secondSide;
        if (isValid) {
            System.out.println("this is a valid triangle");
        } else {
            System.out.println("it's not a triangle");
        }
    }

}
