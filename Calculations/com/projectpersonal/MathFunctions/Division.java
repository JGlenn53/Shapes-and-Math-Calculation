package com.projectpersonal.MathFunctions;

public class Division extends DoAll {
    private double firstDivideNumber;
    private double dividedByNumber;

    public Division(double firstDivideNumber, double dividedByNumber) {
        this.firstDivideNumber = firstDivideNumber;
        this.dividedByNumber = dividedByNumber;
    }

    @Override
    public void getCalculation() {
        double answer = (firstDivideNumber / dividedByNumber);
        System.out.println("\n*********************************");
        System.out.printf(firstDivideNumber + " divided by " + dividedByNumber + ", is equal to %.3f %n",  answer);
        System.out.println("*********************************\n");

    }
}
