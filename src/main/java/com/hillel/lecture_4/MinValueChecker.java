package com.hillel.lecture_4;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/25/19
 */
public class MinValueChecker {

    @Step
    public int getValue(int[] value) {

//        TODO implements result

        int result = 0;
        int min=value[0];
        for(int x: value) {
            if(x < min) min = x;
            result=min;
        }
       /* for (int i = 0; i < value.length; i++) {
            if (value[i] < value[i]) {
                result = i;
            }

        }*/
        return result;
    }
}