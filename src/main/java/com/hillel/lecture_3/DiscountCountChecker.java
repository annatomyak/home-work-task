package com.hillel.lecture_3;

/**
 * Created by alpa on 10/22/19
 */
public class DiscountCountChecker {

    public double checkDiscountCount(double price) {
        double result = 0.0;
        if (price>1000){
            result=price*0.85d;
        }
        else {result=0.0;
        }
        return result;
    }
}
