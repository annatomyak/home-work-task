package com.hillel.lecture_10.calculator;

import io.qameta.allure.Step;

public class FinanceCalculator extends AbstractCalculator {



    public FinanceCalculator(int numberOne, int numberTwo) {
        super(numberOne, numberTwo);
    }

    //calculation of the total cost of the credit
    @Step
    public int getTotalCostCredit(int summCredit,int amountAllCommissions,int summPercent){
       int totalCostCredit= summCredit+amountAllCommissions+summPercent;
    return totalCostCredit;
    }
    public double converterEurotoGrivna(){
        return numberOne*26.70;
}

}
