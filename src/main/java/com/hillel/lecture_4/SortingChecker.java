package com.hillel.lecture_4;

import io.qameta.allure.Step;
import org.apache.commons.lang.ArrayUtils;

import java.util.Arrays;
import java.util.Collections;

/**
 * Created by alpa on 10/26/19
 */
public class SortingChecker {

    @Step
    public int[] fromMinToMax(int[] values) {

//        TODO implements result
        int[] result = new int[0];

        for(int i = 0; i <  values.length; i++) {
            Arrays.sort(values);
            result=values;
        }
        return result;
    }

    @Step
    public int[] fromMaxToMin(int[] values) {

//        TODO implements result
        int[] result = new int[0];

        result = Arrays.stream(values).boxed()
                .sorted(Collections.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();
        return result;
    }
}
