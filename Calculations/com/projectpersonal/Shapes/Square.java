package com.projectpersonal.Shapes;

import com.projectpersonal.DoAll;

public class Square extends DoAll {
    private double heightAndWidth;


    public Square(double heightAndWidth){
        this.heightAndWidth = heightAndWidth;
    }


    public double getHeightAndWidth(){
        return this.heightAndWidth;
    }

    public void getCalculation(){


        System.out.println("\n***************************************************");
        System.out.println("For the height and width of " + heightAndWidth + ", the area is " + (heightAndWidth *heightAndWidth));
        System.out.println("***************************************************");




    }

//    @Override
//    public String toString() {
//        return "square " + "height and width is " + heightAndWidth;
//    }
}
