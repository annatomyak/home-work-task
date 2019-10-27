package com.hillel.lecture_2;

/**
 * Created by alpa on 10/17/19
 */
public class WeightConverter {

    public double kilogramsToPounds(double kilograms) {
//        TODO implements result
        double result = 0.0;
        result=kilograms*2.20462D;
        return result;
    }

    public double poundsToKilograms(double pounds) {
//        TODO implements result
        double result = 0.0;

        result=pounds/2.2046d;
        return result;
    }

}
