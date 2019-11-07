package com.hillel.lecture_6;

import io.qameta.allure.Step;

/**
 * Created by alpa on 11/2/19
 */
public class CountWordsOfEachLengthChecker {

    @Step
    public int countNumberOfWorldWithLength(String sentence, int wordLength) {

    String[] words = sentence.replace(".","").replace(",","").split(" ");
    int count = 0;
       for (int i = 0; i < words.length; i++) {
           if (words[i].length() == wordLength) {
             count++;
            }
       }
       return count;
   }

    }



