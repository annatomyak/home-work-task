package com.hillel.lecture_4;

/**
 * Написать программу, которая печатает табличку значений sin(x), где x это каждые 10 градусов от 0 до 360
 */
public class SinTableTestTask {
    public static void main(String[] args) {
        table();
    }
    public static double table(){
        double result = 0d;
        String leftAlignFormat = "| %-9s | %-10f |%n";

        System.out.format("+-----------+------------+%n");
        System.out.format("| degree    | sin x      |%n");
        System.out.format("+-----------+------------+%n");
        for (int i = 0; i <= 360; i = i + 10) {
            result = Math.sin(i);
            System.out.format(leftAlignFormat,i, result);
    }
        System.out.format("+-----------+------------+%n");
        return result;


    }

}