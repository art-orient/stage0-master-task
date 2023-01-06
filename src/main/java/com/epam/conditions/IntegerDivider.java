package com.epam.conditions;

public class IntegerDivider {

    public void printCompletelyDivided(int dividend, int divider) {
        if (divider == 0) {
            System.out.println("division by zero");
        } else {
            int value = dividend / divider;
            String result = value * divider == dividend ? "can be divided completely" : "cannot be divided completely";
            System.out.println(result);
        }
    }

}
