package com.hillel.lecture_10.calculator;

public class EngineeringCalculator extends AbstractCalculator {
    public EngineeringCalculator(int numberOne, int numberTwo) {
        super(numberOne, numberTwo);
    }


    public double sin() {
      return Math.sin(numberOne);
    }
    public double cos() {
      return   Math.cos(numberOne);
    }
    public double tan() {
        return Math.tan(numberOne);
    }
    public double exp() {
      return   Math.exp(numberOne);
    }
}
