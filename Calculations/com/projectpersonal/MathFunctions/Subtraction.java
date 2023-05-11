package com.projectpersonal.MathFunctions;

public class Subtraction extends DoAll {
    private double firstSub;
    private double secondSub;

    public Subtraction(double firstSub, double secondSub) {
        this.firstSub = firstSub;
        this.secondSub = secondSub;
    }

    public void getCalculation(){
         double result = firstSub - secondSub;
        System.out.println("\n********************************");
        System.out.println(firstSub +" minus " + secondSub + " is equal to " + result);
        System.out.println("********************************\n");
    }
}
