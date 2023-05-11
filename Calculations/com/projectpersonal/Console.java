package com.projectpersonal;

import com.projectpersonal.MathFunctions.Addition;
import com.projectpersonal.MathFunctions.Division;
import com.projectpersonal.MathFunctions.Multiplication;
import com.projectpersonal.MathFunctions.Subtraction;
import com.projectpersonal.Shapes.Rectangle;
import com.projectpersonal.Shapes.Square;
import com.projectpersonal.Shapes.Triangle;

import java.util.Scanner;

public class Console {

    public Console() {
    }
    Scanner userInput = new Scanner(System.in);
    public void shapesRectangle(){

        System.out.print("\nEnter rectangle length: ");
        double height = Double.parseDouble(userInput.nextLine());
        System.out.print("\nEnter the width: ");
        double width = Double.parseDouble(userInput.nextLine());
        if (height == width) {
            System.out.println("\nRemember in math if length and width are the same on a 4 side shape, its just a square!");
        }
        Rectangle rectangle = new Rectangle(height, width);
        rectangle.getCalculation();
    }

    public void shapesSquare(){
        System.out.print("\nEnter square height and width: ");
        double heightAndWidth = Double.parseDouble(userInput.nextLine());
        Square square = new Square(heightAndWidth);
        square.getCalculation();
    }

    public void shapesTriangle(){
        System.out.print("\nEnter the base of the triangle: ");
        double base = Double.parseDouble(userInput.nextLine());
        System.out.print("\nEnter the height of the triangle: ");
        double triHeight = Double.parseDouble(userInput.nextLine());
        Triangle triangle = new Triangle(base, triHeight);
        triangle.getCalculation();
    }
    public void mathAddition(){
        System.out.print("\nEnter first number to add: ");
        double firstAddNumber = Double.parseDouble(userInput.nextLine());
        System.out.print("\nEnter second number to add: " );
        double secondAddNumber = Double.parseDouble(userInput.nextLine());
        Addition addition = new Addition(firstAddNumber, secondAddNumber);
        addition.getCalculation();
    }
    public void mathSubtraction(){
        System.out.print("\nEnter the number you want to subtract from: ");
        double subtractFrom = Double.parseDouble(userInput.nextLine());
        System.out.print("\nEnter the number you want to subtract: ");
        double subtractedNumber = Double.parseDouble(userInput.nextLine());
        Subtraction subtraction = new Subtraction(subtractFrom, subtractedNumber);
        subtraction.getCalculation();
    }
    public void mathMultiplication(){
        System.out.print("\nEnter the first number you want to multiply: ");
        double firstMultipliedNumber = Double.parseDouble(userInput.nextLine());
        System.out.print("\nEnter the second number you want to multiply: ");
        double secondMultipliedNumber = Double.parseDouble(userInput.nextLine());
        Multiplication multiplication = new Multiplication(firstMultipliedNumber, secondMultipliedNumber);
        multiplication.getCalculation();
    }
    public void mathDivision(){
        System.out.print("\nEnter the number you want to divide: ");
        double firstDividedNumber = Double.parseDouble(userInput.nextLine());
        System.out.print("\nEnter the number you want to divide by: ");
        double divideByNumber = Double.parseDouble(userInput.nextLine());
        Division division = new Division(firstDividedNumber, divideByNumber);
        division.getCalculation();
    }



}

