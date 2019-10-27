package com.hillel.lecture_3;

/**
 * Created by alpa on 10/22/19
 */
public class PassFailChecker {

    public   void main(String[] args) {
        checkNumber(50);
        System.out.println("Done");
    }
    public String checkNumber(int mark) {

        if (mark>=50){
            String result = "PASS";
            return result;


        }
        else {String result = "FAIL";
            return result;
        }

    }
}
