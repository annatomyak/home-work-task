package com.hillel.lecture_4;

/**
 * Created by alpa on 10/25/19
 */
public class BinaryToDecimalChecker {

    public int fromDecimalToBinary(int value) {

        StringBuilder result = new StringBuilder();
        while(value >= 1) {
            if (value % 2 == 0)
                result.append("0");
            else
                result.append("1");
            value /= 2;
        }

        System.out.println(result.reverse());

        return new Integer(result.toString());
    }

    public int fromBinaryToDecimal(int value) {

        int result = Integer.parseInt(String.valueOf(value), 2);
          return result;
    }
}
