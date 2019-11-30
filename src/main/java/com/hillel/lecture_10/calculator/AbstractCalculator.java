package com.hillel.lecture_10.calculator;

public abstract class AbstractCalculator {

    public int numberOne;
    public int numberTwo;
    public int result;

    public AbstractCalculator(int numberOne, int numberTwo) {
        this.numberOne=numberOne;
        this.numberTwo=numberTwo;
    }

    public int plus() {
        return numberOne+numberTwo;
    }

    public int minus() {
        return numberOne-numberTwo;
    }

    public int multiplication() {
        return  numberOne*numberTwo;
    }

    public double division() {
        return numberOne/numberTwo;
    }


}
