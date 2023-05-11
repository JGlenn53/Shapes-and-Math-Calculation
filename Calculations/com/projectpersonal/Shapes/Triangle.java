package com.projectpersonal.Shapes;

import com.projectpersonal.MathFunctions.DoAll;

public class Triangle extends DoAll {
    private double base;
    private double height;



    public double getBase(){
        return this.base;
    }


    public double getHeight(){
        return this.height;
    }

    public Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }

    public void getCalculation() {


        System.out.println("\n******************************************************************");
        System.out.println( " For the height of " + height + " and the base of " + base + ", the area is " + (base * height) / 2);
        System.out.println("******************************************************************\n");



    }


//    @Override
//    public String toString() {
//        return "For the triangle base of " +
//                  base +
//                " and the height of " + height +
//                ' ';
//    }
}
