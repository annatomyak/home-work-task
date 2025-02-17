package com.hillel.lecture_2;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/17/19
 */
public class TemperatureConverter {

    @Step
    public double celsiusToFahrenheit(double celsius) {
//       TODO implements result Convert Celsius to Fahrenheit
        double result = 0.0;
        result=(celsius*9D/5D) +32D;
        return result;
    }

    @Step
    public double fahrenheitToCelsius(double fahrenheit) {
//        TODO implements result convert Fahrenheit to Celsius
        double result = 0.0;
        result= ((fahrenheit-32D)*5D/9D);
        return result;
    }

    @Step
    public double celsiusToKelvin(double celsius) {
//        TODO implements result convert Celsius to Kelvin
        double result = 0.0;
        result=celsius+273.16D;
        return result;
    }
}
