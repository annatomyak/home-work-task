package com.hillel.lecture_6;

import io.qameta.allure.Step;

/**
 * Created by alpa on 11/2/19
 */
public class UpperLowerCaseChecker {


    @Step
    public String toUpperCase(String word) {

//        TODO implements result
        String result = "";
        result=word.toUpperCase();
        return result;
    }

    @Step
    public String toLowerCase(String word) {

//        TODO implements result
        String result = "";
        result=word.toLowerCase();
        return result;
    }

    @Step
    public String eachSentenceToUpperCase(String sentence) {
        String result = "";
      String delimeter = "(?<=\\. )";
        for (String word : sentence.split(delimeter)) {

            word = word.substring(0, 1).toUpperCase() + word.substring(1);
            result += word;
        }
        result = result.trim();

        return result;


    }

    @Step
    public String eachLetterToUpperCase(String sentence) {

//        TODO implements result
        String result = "";
        String[] arr = sentence.split(" ");
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < arr.length; i++) {
            sb.append(Character.toUpperCase(arr[i].charAt(0)))
                    .append(arr[i].substring(1)).append(" ");
        }
        return result=sb.toString().trim();

    }
}
