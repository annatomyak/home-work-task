package com.hillel.lecture_4;

/**
 * Написать программу, которая выводит все символы (char) в промежутке от 135 до 255
 */
public class PrintCharTestTask {
    public static void main(String[] args) {
        System.out.print("ASCII символы и коды:\n № символ OCT  HEX\n");
        for (int i = 135; i < 255; i++) {
            char ch = (char) i;

            System.out.printf(String.valueOf(ch));
        }
    }
}

