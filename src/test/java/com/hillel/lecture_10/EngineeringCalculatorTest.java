package com.hillel.lecture_10;

import com.hillel.lecture_10.calculator.EngineeringCalculator;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class EngineeringCalculatorTest {
    public EngineeringCalculator numbers = new EngineeringCalculator(200,100);
    public EngineeringCalculator negativeNumbers = new EngineeringCalculator(-200,-100);



    @Test
    public void plusTest() {
        int expectedResult = 300;
        assertEquals(numbers.plus(),expectedResult);

    } @Test
    public void plusTestWithNegativeNumbers() {
        int expectedResult = -300;
        assertEquals(negativeNumbers.plus(), expectedResult);

    }
    @Test
    public void minusTest(){
        int expectedResult = 100;
        assertEquals(numbers.minus(), expectedResult);

    }
    @Test
    public void minusTestWithNegativeNumbers(){
        int expectedResult = -100;
        assertEquals(negativeNumbers.minus(), expectedResult);
    }
    @Test
    public void multiplyTest (){
        int expectedResult =20000;
        assertEquals(numbers.multiplication(), expectedResult);
    }
    @Test
    public void multiplyTestWithNegativeNumbers (){
        int expectedResult = 20000;
        assertEquals(negativeNumbers.multiplication(), expectedResult);
    }
    @Test
    public void divideTest (){
        double expectedResult = 2.0;
        assertEquals(numbers.division(), expectedResult);
    }
    @Test
    public void divideTestWithNegativeNumbers (){
        double expectedResult = 2;
        assertEquals(negativeNumbers.division(), expectedResult);
    }
    @Test
    public void sinTest (){

        double expectedResult = -0.8732972972139946d;
        assertEquals(numbers.sin(), expectedResult);
    }
    @Test
    public void cosTest (){

        double expectedResult = 0.4871876750070059d;
        assertEquals(numbers.cos(), expectedResult);
    }
    @Test
    public void tgTest (){

        double expectedResult = -1.7925274837903817d;
        assertEquals(numbers.tan(), expectedResult);
    }

}
