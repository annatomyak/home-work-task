package com.hillel.lecture_7;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Write class to represent FractionNumbers
 * This class should contain two fields.
 * This class should contain methods to perform basic math operations:
 * plus, minus, multiply, divide
 * Also, this class should have toString method to print numbers into standard output
 * Add tests for check functionality of FractionNumber class
 */
public class FractionNumbersTestTask {

    public FractionNumbers numbers = new FractionNumbers(0.5,0.3);
    public FractionNumbers negativeNumbers = new FractionNumbers(-0.5,-0.3);



    @Test
    public void plusTest() {
        double expectedResult = 0.8;
        assertEquals(numbers.plus(), expectedResult);

    } @Test
    public void plusTestWithNegativeNumbers() {
        double expectedResult = -0.8;
        assertEquals(negativeNumbers.plus(), expectedResult);

    }
    @Test
    public void minusTest(){
        double expectedResult = 0.2;
        assertEquals(numbers.minus(), expectedResult);

}
    @Test
    public void minusTestWithNegativeNumbers(){
        double expectedResult = -0.2;
        assertEquals(negativeNumbers.minus(), expectedResult);
    }
    @Test
    public void multiplyTest (){
        double expectedResult = 0.15;
        assertEquals(numbers.multiply(), expectedResult);
    }
    @Test
    public void multiplyTestWithNegativeNumbers (){
        double expectedResult = 0.15;
        assertEquals(negativeNumbers.multiply(), expectedResult);
    }
    @Test
    public void divideTest (){
        double expectedResult = 1.6666666666666667;
        assertEquals(numbers.divide(), expectedResult);
    }
    @Test
    public void divideTestWithNegativeNumbers (){
        double expectedResult = 1.6666666666666667;
        assertEquals(negativeNumbers.divide(), expectedResult);
    }
    @Test
    public void toStringTest (){
        String expectedResult =
                "FractionNumbers{numberOne=0.5, numberTwo=0.3}";

        assertEquals(numbers.toString(), expectedResult);
    }

}
