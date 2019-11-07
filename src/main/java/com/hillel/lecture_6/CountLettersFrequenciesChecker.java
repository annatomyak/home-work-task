package com.hillel.lecture_6;

import io.qameta.allure.Step;

/**
 * Created by alpa on 11/2/19
 */
public class CountLettersFrequenciesChecker {


    @Step
    public String countLettersFrequencies(String text, char letter) {

//        TODO implements result
        String result = "";
        int     cnt = 0;
        for(int i = 0; i < text.length(); i++) {
            if( text.charAt(i) == letter)
                cnt++;
            result="Character "+"'"+letter+"'"+" repeated "+cnt+ " times";
        }

        return result;
    }
}
