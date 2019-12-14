package com.hillel.lecture_14;

import java.util.*;

/**
 * Created by alpa on 12/5/19
 */
public class ArraysChecker {


    public ArrayList getReversList(List<String> list) {
        ArrayList result = new ArrayList<>();
        //  Collections.reverse(list);
        for (int i = list.size() - 1; i >= 0; i--) {
            result.add(list.get(i));
        }
        return result;
    }

    public String getLongestString(List<String> list) {

        String result = "";
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i).length() > result.length()) {
                result = list.get(i);
            }
        }
        return result;

    }

    public List<String> changeIndex(List<String> list) {

        list.set(1, "Star Lord");
        list.set(3, "Captain America");


        return list;
    }


    public List<String> removeDuplicates(List<String> list) {
        List correctedList = new ArrayList(); Set a = new HashSet();
        a.addAll(list);
        correctedList.addAll(a);
        return correctedList;
    }
        public List<String> sortList (List<String>list){

//
            return list;
        }

}