package com.hillel.lecture_3;

/**
 * Created by alpa on 10/22/19
 */
public class OddEvenChecker {


    public  void main(String[] args) {
        checkNumber(24);
        System.out.println("BYE");
    }

    public String checkNumber(int number) {
        if (number % 2 == 0) {
            String result = "Even Number";
            return result;

        } else {
            String result = "Odd Number";
            return result;
        }

    }
}
