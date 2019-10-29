package com.hillel.lecture_3;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/22/19
 */
public class NumberInWordChecker {

    @Step
    public String getNumberIfElse(int number) {
        String result ="";
        if (number == 1) {
            result = "ONE";

        } else if (number == 2) {
            result = "TWO";

        } else if (number == 3) {
            result = "THREE";

        } else if (number == 4) {
            result = "FOUR";
        } else if (number == 5) {
            result = "FIVE";
        } else if (number == 6) {
            result = "SIX";
        } else if (number == 7) {
            result = "SEVEN";
        } else if (number == 8) {
            result = "EIGHT";

        } else if (number == 9) {
            result = "NINE";
        } else {
            result = "OTHER";

        }return result;
    }

    @Step
    public String getNumberSwitchCase(int number) {
        String result = "";
        switch (number){
            case 1:
                result = "ONE";
            case 2:
                result = "TWO";
            case 3:
                result = "THREE";
            case 4:
                result = "FOUR";
            case 5:
                result = "FIVE";
            case 6:
                result = "SIX";
            case 7:
                result = "SEVEN";

            case 8:
                result = "EIGHT";

            case 9:
                result = "NINE";

            default:
                result = "OTHER";

        } return result;
    }


}
