package com.hillel.lecture_7;

public class FractionNumbers {
   public double numberOne;
   public double numberTwo;

   public void plus(double numberOne,double numberTwo){
      System.out.println("Plus= "+(numberOne+numberTwo)); ;
   }
    public void minus(double numberOne,double numberTwo){
        System.out.println("minus= "+(numberOne-numberTwo)); ;
    }
    public void multiply(double numberOne,double numberTwo){
        System.out.println("multiply= "+(numberOne*numberTwo)); ;
    }

    public void divide(double numberOne,double numberTwo){
        System.out.println("divide= "+(numberOne/numberTwo)); ;
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
                "numberOne=" + numberOne +
                ", numberTwo=" + numberTwo +
                '}';
    }
}
