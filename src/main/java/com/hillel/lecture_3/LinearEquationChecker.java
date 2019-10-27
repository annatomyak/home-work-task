package com.hillel.lecture_3;

/**
 * Created by alpa on 10/22/19
 */
public class LinearEquationChecker {

    public double linearEquation(int a, int b) {
        double result =0;
        if (a!=0){
            result=-(b/a);
        }
        else if (a==0 && b!=0){
            result=0.0d;
        }
        else{
            result=0.0d;
        }
        return result;
    }
}
