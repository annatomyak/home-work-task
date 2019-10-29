package com.hillel.lecture_4;

/**
 * Created by alpa on 10/25/19
 */
public class DecimalToHexadecimalChecker {

    public String fromDecimalToHexadecimal(int value) {

//        TODO implements result
        String result = "";
      result=Integer.toHexString(value).toUpperCase();
        return result;
    }

    public int fromHexadecimalToDecimal(String value) {

//        TODO implements result
        int result = 0;
        result=Integer.parseInt(String.valueOf(value), 16);
        return result;
    }
}
