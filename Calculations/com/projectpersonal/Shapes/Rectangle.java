package com.projectpersonal.Shapes;

import com.projectpersonal.MathFunctions.DoAll;

public class Rectangle extends DoAll {
    private double height;
    private double width;


    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }
    //NOT 100% sure about a default constructor
    public Rectangle(){}

    public double getHeight (){
        return height;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public double getWidth(){
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }


    //FINDING AREA METHOD
    public void getCalculation() {


        System.out.println();
        System.out.println("*************************************************************");
        System.out.println("For the length of " + height + " and width of " + width + ", your area is " + (width * height));
        System.out.println("*************************************************************");


    }




//    public String toString(){
//        return "For your height of " + height + " and width of " + width;
//    }

}
