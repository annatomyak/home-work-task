package com.hillel.lecture_3;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/22/19
 */
public class QuadraticEquationChecker {

    @Step
    public String checkQuadraticEquation(double a, double b, double c) {


        String result = "";
        double discriminant = Math.pow(b, 2) - 4 * a * c;
        if (discriminant > 0 && a != 0) {
            double x1 = (-b + Math.sqrt(discriminant)) /( 2d * a);
            double x2 = (-b - Math.sqrt(discriminant)) / (2d * a);
            result = "Discriminant: " + discriminant + ", x1: " + x1 + ", x2: " + x2;
        } else if (discriminant < 0 && a != 0) {
            result = "No roots on the set of real numbers!";
        } else if (a == 0) {
            result = "The 'a' coefficient should not be zero!";
        } else {
            double x1 = -b /( 2 * a);
            result = "Two real, identical roots: [x1 && x2] = " + x1;

        }
        return result;
    }

}
