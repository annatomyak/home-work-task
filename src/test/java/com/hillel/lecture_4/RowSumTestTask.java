package com.hillel.lecture_4;

/**
 * Написать программу, которая считает сумму двух колонок. Если
 * одна из колонок больше, вывести, какая именно больше. Если
 * колонки одинаковы - вывести результат в виде:
 * | row_1 | row_2 | sum |
 * | 2 | 5 | 7 |
 */
public class RowSumTestTask {
    public static void main(String[] args) {
       summOfRow();
    }
    public static int summOfRow() {
        int result = 0;
        String leftAlignFormat = "| %-5s | %-5d | %-5d |%n";

        System.out.format("+------------------------+%n");
        System.out.format("| row1  | row 2 |  summ  |%n");
        System.out.format("+------------------------+%n");

        for (int i = 0; i<10; i++){
            int a = (int) ( Math.random() * 200-100 );
            int b = (int) ( Math.random() * 200-100 );
            result= a+b;
            System.out.format(leftAlignFormat, a, b, result);
        }
        System.out.format("+-----------------+------+%n");
        return result;


    }
}
