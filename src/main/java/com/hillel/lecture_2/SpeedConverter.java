package com.hillel.lecture_2;

/**
 * Created by alpa on 10/17/19
 */
public class SpeedConverter {

    public double speedKmToMi(double speedKm) {
//        TODO implements result
        double result = 0.0;
        result=speedKm* 0.6214D;
        return result;
    }

    public double speedMiToKm(double speedMi) {
//        TODO implements result
        double result = 0.0;
        result=speedMi/ 0.6214D;
        return result;
    }


}
