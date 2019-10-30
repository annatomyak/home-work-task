package com.hillel.lecture_4;

import io.qameta.allure.Step;

import java.util.Arrays;

/**
 * Created by alpa on 10/26/19
 */
public class ReverseStringChecker {

    @Step
    public String getReversString(String value) {

//        TODO implements result
        String result = "";
        for(int i=value.length()-1; i>=0; i--) {
            result = result + value.charAt(i);
        }
        return result;


    }

}
