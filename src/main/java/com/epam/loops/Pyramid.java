package com.epam.loops;

public class Pyramid {

    public void printPyramid(int cathetusLength) {
        for (int i = 1; i <= cathetusLength; i++) {
            for (int j = 0; j < cathetusLength; j++) {
                if (cathetusLength - j <= i) {
                    System.out.print(cathetusLength - j);
                } else {
                    System.out.print(" ");
                }
            }
            for (int j = 2; j <= cathetusLength; j++) {
                if (j < i + 1) {
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }

}
