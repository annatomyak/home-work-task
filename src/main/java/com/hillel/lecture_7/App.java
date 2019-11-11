package com.hillel.lecture_7;

public class App {
    public static void main(String[] args) {
        FractionNumbers fractionNumbers=new FractionNumbers();
        fractionNumbers.setNumberOne(1.5);
        fractionNumbers.setNumberTwo(2.5);
        System.out.println(fractionNumbers.toString());

        fractionNumbers.plus();
        fractionNumbers.minus();
        fractionNumbers.multiply();
        fractionNumbers.divide();
        fractionNumbers.toString();


    }

}


