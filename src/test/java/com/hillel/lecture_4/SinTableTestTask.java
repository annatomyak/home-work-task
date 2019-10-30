package com.hillel.lecture_4;

/**
 * Написать программу, которая печатает табличку значений sin(x), где x это каждые 10 градусов от 0 до 360
 */
public class SinTableTestTask {
    public static void main(String[] args) {
        String[] columnNames = {
                "degree",
                "sin x",

        };
        double result = 0;
        for (int i = 0; i <= 360; i = i + 10) {
            result = Math.sin(i);

            System.out.print(result);
            System.out.print(i);

        }

    }
}