package com.hillel.lecture_2;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/16/19
 */
public class Formulas {

    @Step
    public double calculate9Formula(double x) {
        double result = 0.0;
        result= 1.1f*Math.exp(-x)+Math.abs(Math.cos(Math.sqrt(Math.PI*x)))-(3f/8f);
        return result;
    }

    @Step
    public double calculate10Formula(double x) {
        double result = 0.0;
        result=(1.0/3.0)*Math.sqrt(Math.abs(Math.sin(x)))*Math.cbrt(Math.exp(0.12*x));
        return result;
    }

    @Step
    public double calculate11Formula(double x) {
        double result = 0.0;
        result= 2 * Math.PI * x - Math.abs(Math.sin(Math.sqrt(10.5 * x))) * 1.0 / (Math.cbrt(Math.pow(x,2)) + 1.0 / 7.0);;
        return result;
    }

    @Step
    public double calculate12Formula(double x) {
        double result = 0.0;
        result=(Math.log(Math.sqrt(Math.abs(2-x))+1.2))*((1/(2+Math.exp(-x))))+Math.cbrt(2/x);
        return result;
    }

    @Step
    public double calculate13Formula(double x) {
        double result = 0.0;
        result = (Math.pow(Math.exp(-2 + x), (1/2)))*(1/(Math.sqrt(Math.pow(x, 2)+Math.pow(x, 4)+Math.log(Math.abs(x-3.14d)))));
        return result;
    }
}
