package com.hillel.lecture_6;

import io.qameta.allure.Step;

/**
 * Created by alpa on 11/2/19
 */
public class LetterRemovalChecker {


    @Step
    public String removeLetter(String sentence, String letterFoRemove) {

//        TODO implements result
        String result = "";
        //char ch = letterFoRemove.charAt(0);
        for(int i = 0; i < sentence.length(); i++) {
            result=sentence.replace(letterFoRemove ,"");
        }
        return result;
        }
       ;
    }

