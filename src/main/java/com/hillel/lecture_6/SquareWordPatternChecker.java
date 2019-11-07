package com.hillel.lecture_6;

import io.qameta.allure.Step;

/**
 * Created by alpa on 11/2/19
 */
public class SquareWordPatternChecker {


    @Step
    public static String applySquareWordPattern(String word) {
        String result = "";
        StringBuffer sb;

        for (int i = 0; i < word.length(); i++) {
            sb = new StringBuffer();
            int j = i;  // Current index in str
            int k = 0;  // Current index in temp


            for (int k2 = j; k2 < word.length(); k2++) {
                sb.insert(k, word.charAt(j));
                k++;
                j++;
            }

            // Copying the first part from the point
            // of rotation.
            j = 0;
            while (j < i) {
                sb.insert(k, word.charAt(j));
                j++;
                k++;

            }
            result = result + sb.toString().concat(", ");




        } return result.substring(0, result.length() - 2);
    }
}