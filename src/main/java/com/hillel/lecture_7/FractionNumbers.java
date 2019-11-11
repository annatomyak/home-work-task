package com.hillel.lecture_7;

import io.qameta.allure.Step;

public class FractionNumbers {
   public double numberOne;
   public double numberTwo;

   public FractionNumbers(double numberOne, double numberTwo) {
    this.numberOne=numberOne;
    this.numberTwo=numberTwo;
    }

    public FractionNumbers() {

    }

    @Step
    public  double plus(){
      System.out.println("Plus= "+(this.numberOne+this.numberTwo));
      return this.numberOne+this.numberTwo;
   }
    @Step
    public double minus(){
        System.out.println("minus= "+(this.numberOne-this.numberTwo));
        return this.numberOne-this.numberTwo;
    }
    @Step
    public double multiply(){
        System.out.println("multiply= "+(this.numberOne*this.numberTwo));
        return this.numberOne*this.numberTwo;
    }
    @Step
    public double divide(){
        System.out.println("divide= "+(this.numberOne/this.numberTwo));
        return (this.numberOne/this.numberTwo);
    }
    public double getNumberOne() {
        return numberOne;
    }

    public void setNumberOne(double numberOne) {
        this.numberOne = numberOne;
    }

    public double getNumberTwo() {
        return numberTwo;
    }

    public void setNumberTwo(double numberTwo) {
        this.numberTwo = numberTwo;
    }

    @Override
    public String toString() {
        return "FractionNumbers{" +
                "numberOne=" + this.numberOne +
                ", numberTwo=" + this.numberTwo +
                '}';
    }
}
