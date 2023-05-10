package com.projectpersonal.MathFunctions;

import com.projectpersonal.DoAll;

public class Multiplication extends DoAll {
    private double firstNumber;
    private double secondNumber;


    public Multiplication(double firstNumber, double secondNumber ) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public void getCalculation(){
        System.out.println("\n***************************************");
        System.out.println(firstNumber + " multiplied by " + secondNumber + "is equal to " + (firstNumber * secondNumber));
        System.out.println("***************************************\n");
    }

}
