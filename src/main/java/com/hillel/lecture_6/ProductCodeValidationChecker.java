package com.hillel.lecture_6;

import io.qameta.allure.Step;

import java.util.Arrays;
import java.util.regex.Pattern;

/**
 * Created by alpa on 11/2/19
 */
public class ProductCodeValidationChecker {


    @Step
    public boolean validateCode(String code) {

        boolean isValid = false;
        String string1 = code.substring(0, code.indexOf(" "));
        String string2 = code.substring(code.indexOf(" ")+1);

        int leng = string1.length();
        char[] code1Chars = string1.toCharArray();
        String[] numbers = new String[6];
        int counter = 0;
        int index = 0;


        for (int i = 0; i < code1Chars.length; i++) {
            if (Character.isDigit(code1Chars[i])) {
                numbers[index] = Character.toString(code1Chars[i]);
                index++;
                counter += 1;

            }
        }

        int[] results = new int [6];
        int res = 1;
        for (int i = 0; i < numbers.length ; i++) {
            if (i % 2 != 0) {
                String str = numbers[i-1] + numbers[i];
                int number = Integer.parseInt(str);
                res = res * number;
            }
        }

        if (string1.equals(string1.toUpperCase()) && res == Integer.parseInt(string2) && counter >= 6) {
            isValid = true;
        }



        return isValid;
    }
}
