package com.hillel.lecture_10;

import com.hillel.lecture_10.calculator.FinanceCalculator;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FinanceCalculatorTest {
    public FinanceCalculator numbers = new FinanceCalculator(100,20);
    public FinanceCalculator negativeNumbers = new FinanceCalculator(-100,-20);



    @Test
    public void plusTest() {
        int expectedResult = 120;
        assertEquals(numbers.plus(),expectedResult);

    } @Test
    public void plusTestWithNegativeNumbers() {
        int expectedResult = -120;
        assertEquals(negativeNumbers.plus(), expectedResult);

    }
    @Test
    public void minusTest(){
        int expectedResult = 80;
        assertEquals(numbers.minus(), expectedResult);

    }
    @Test
    public void minusTestWithNegativeNumbers(){
        int expectedResult = -80;
        assertEquals(negativeNumbers.minus(), expectedResult);
    }
    @Test
    public void multiplyTest (){
        int expectedResult =2000;
        assertEquals(numbers.multiplication(), expectedResult);
    }
    @Test
    public void multiplyTestWithNegativeNumbers (){
        int expectedResult = 2000;
        assertEquals(negativeNumbers.multiplication(), expectedResult);
    }
    @Test
    public void divideTest (){
        double expectedResult = 5.0;
        assertEquals(numbers.division(), expectedResult);
    }
    @Test
    public void divideTestWithNegativeNumbers (){
        double expectedResult = 5.0;
        assertEquals(negativeNumbers.division(), expectedResult);
    }
    @Test
    public void getTotalCostCreditTest (){

        int expectedResult = 2350;
        assertEquals(numbers.getTotalCostCredit(1500,350,500), expectedResult);
    }
    @Test
    public void converterEurotoGrivnaTest (){

        double expectedResult = 2670.0;
        assertEquals(numbers.converterEurotoGrivna(), expectedResult);
    }
}
