package com.hillel.lecture_2;

/**
 * Created by alpa on 10/17/19
 */
public class DistanceConverter {


    public double metersToInches(double meters) {
//        TODO implements result
        double result= meters*39.37d;
        return result;
    }

    public double inchesToMeters(double inches) {
//        TODO implements result
        double result=inches/39.37d;
        return result;
    }

    public double milesToKilometres(double miles) {
//        TODO implements result
        double result=1.609d*miles;
        return  result ;
    }

    public double kilometresToMiles(double kilometres) {
//        TODO implements result

        double result=kilometres/1.609d;
        return result ;
    }
}
