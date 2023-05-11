package com.projectpersonal.MathFunctions;

public class Addition extends DoAll {
    private double firstAddNumber;
    private double secondAddNumber;

    public Addition(double firstAddNumber, double secondAddNumber){
        this.firstAddNumber = firstAddNumber;
        this.secondAddNumber = secondAddNumber;
    }



    public void getCalculation(){

        System.out.println("\n********************************");
        System.out.println( firstAddNumber + " plus " + secondAddNumber + " is equal to  " + (firstAddNumber + secondAddNumber));
        System.out.println("********************************\n");


    }

    @Override
    public String toString() {
        return "For " + firstAddNumber + " plus " + secondAddNumber + " the total is ";
    }

}
