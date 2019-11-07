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

//        TODO implements result
        boolean isValid = false;
        String[] arrString=code.split(" ");
        String code1 = code.substring(0, code.indexOf(" "));
        String code2 = code.substring(code.indexOf(" ")+1);

        int a=Integer.parseInt(arrString[1]);
      String  str = arrString[0].replaceAll("\\D+","");
     String[] arrString1=str.split("(?<=\\G.{2})");
        int[] arrayInt = Arrays.asList(arrString1).stream().mapToInt(Integer::parseInt).toArray();

        int pr=1;
        for(int x=0; x<arrayInt.length; x++) {
            pr *= arrayInt[x];

        }
        if (pr==a){
            isValid=true;

        }


        else {
            isValid=false;
        }
        return isValid;
    }
}
