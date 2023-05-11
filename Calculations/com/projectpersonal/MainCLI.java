package com.projectpersonal;

import com.projectpersonal.MathFunctions.Addition;
import com.projectpersonal.MathFunctions.Division;
import com.projectpersonal.MathFunctions.Multiplication;
import com.projectpersonal.MathFunctions.Subtraction;
import com.projectpersonal.Shapes.Formulas;
import com.projectpersonal.Shapes.Rectangle;
import com.projectpersonal.Shapes.Square;
import com.projectpersonal.Shapes.Triangle;

import java.util.Random;
import java.util.Scanner;

public class MainCLI {
    private static Scanner userInput = new Scanner(System.in);
    private static final String SHAPES_MENU = "Shapes calculation Menu";
    private static final String SIMPLE_MATH_MENU = "Add, Subtract, Multiply, and Divide Menu";
    private static final String EXIT_FROM_PROGRAM = "Exit Program";
    private static final String TEST = "Test your skills";
    private static final String FORMULAS = "Formula for area of shapes";

    private static final String SHAPES_MENU_RECTANGLE = "Rectangle";
    private static final String SHAPES_MENU_SQUARE= "Square";
    private static final String SHAPES_MENU_TRIANGLE = "Triangle";
    private static final String BACK_TO_MAIN_MENU = "Exit to main menu";
    private static final String MATH_MENU_ADDITION = "Addition";
    private static final String MATH_MENU_SUBTRACTION = "Subtraction";
    private static final String MATH_MENU_MULTIPLICATION = "Multiplication";
    private static final String MATH_MENU_DIVISION = "Division";
    private static final String EXIT_FROM_MATH_OPTIONS = "Exit to main menu ";

    private static final String TEST_MENU_ADDITION = "Addition problem";
    private static final String TEST_MENU_SUBTRACTION = "Subtraction problem";
    private static final String TEST_MENU_MULTIPLICATION = "Multiplication problem";
    private static final String TEST_MENU_DIVISION = "Division problem";
    private static final String EXIT_MENU_TESTING = "Exit to main menu  ";

    private static final String[] MAIN_MENU_DISPLAY = {SHAPES_MENU, SIMPLE_MATH_MENU, FORMULAS, TEST, EXIT_FROM_PROGRAM};
    private static final String[] SHAPES_MENU_DISPLAY = {SHAPES_MENU_RECTANGLE, SHAPES_MENU_SQUARE, SHAPES_MENU_TRIANGLE, BACK_TO_MAIN_MENU};
    private static final String[] MATH_MENU_DISPLAY = { MATH_MENU_ADDITION, MATH_MENU_SUBTRACTION, MATH_MENU_MULTIPLICATION, MATH_MENU_DIVISION, EXIT_FROM_MATH_OPTIONS};
    private static final String[] TEST_SKILLS_GAME = {TEST_MENU_ADDITION, TEST_MENU_SUBTRACTION, TEST_MENU_MULTIPLICATION, TEST_MENU_DIVISION, EXIT_MENU_TESTING};
    public static void main(String[] args) {
       MainCLI cli = new MainCLI();
       cli.run();
    }
    String[] currentMenu = MAIN_MENU_DISPLAY;
    public void run(){
        double rightAnswer = 0;
        double wrongAnswer = 0;
        Random random = new Random();
        boolean runMenu = true;
        while (runMenu) {
            displayMenu(currentMenu);
            System.out.print("\nPlease make a selection: ");
            String selection = userInput.nextLine();
            try {
                int selectionIndex = Integer.parseInt(selection) - 1;
                String menuOption = currentMenu[selectionIndex];

                switch (menuOption) {
                    case SHAPES_MENU:
                        currentMenu = SHAPES_MENU_DISPLAY;
                        break;

                    case SHAPES_MENU_RECTANGLE:
                        System.out.print("\nEnter rectangle length: ");
                        double height = Double.parseDouble(userInput.nextLine());
                        System.out.print("\nEnter the width: ");
                        double width = Double.parseDouble(userInput.nextLine());
                        if (height == width) {
                            System.out.println("\nRemember in math if length and width are the same on a 4 side shape, its just a square!");
                        }

                        Rectangle rectangle = new Rectangle(height, width);
                        rectangle.getCalculation();
                        break;

                    case SHAPES_MENU_SQUARE:
                        System.out.print("\nEnter square height and width: ");
                        double heightAndWidth = Double.parseDouble(userInput.nextLine());
                        Square square = new Square(heightAndWidth);
                        square.getCalculation();
                        break;

                    case SHAPES_MENU_TRIANGLE:
                        System.out.print("\nEnter the base of the triangle: ");
                        double base = Double.parseDouble(userInput.nextLine());
                        System.out.print("\nEnter the height of the triangle: ");
                        double triHeight = Double.parseDouble(userInput.nextLine());
                        Triangle triangle = new Triangle(base, triHeight);
                        triangle.getCalculation();
                        break;

                    case BACK_TO_MAIN_MENU:
                        currentMenu = MAIN_MENU_DISPLAY;
                        break;

                    case SIMPLE_MATH_MENU:
                        currentMenu = MATH_MENU_DISPLAY;
                        break;

                    case MATH_MENU_ADDITION:
                        System.out.print("\nEnter first number to add: ");
                        double firstAddNumber = Double.parseDouble(userInput.nextLine());
                        System.out.print("\nEnter second number to add: " );
                        double secondAddNumber = Double.parseDouble(userInput.nextLine());
                       Addition addition = new Addition(firstAddNumber, secondAddNumber);
                       addition.getCalculation();
                        break;

                    case MATH_MENU_SUBTRACTION:
                        System.out.print("\nEnter the number you want to subtract from: ");
                        double subtractFrom = Double.parseDouble(userInput.nextLine());
                        System.out.print("\nEnter the number you want to subtract:");
                        double subtractedNumber = Double.parseDouble(userInput.nextLine());
                        Subtraction subtraction = new Subtraction(subtractFrom, subtractedNumber);
                        subtraction.getCalculation();
                        break;

                    case MATH_MENU_MULTIPLICATION:
                        System.out.print("\nEnter the first number you want to multiply: ");
                        double firstMultipliedNumber = Double.parseDouble(userInput.nextLine());
                        System.out.print("\nEnter the second number you want to multiply: ");
                        double secondMultipliedNumber = Double.parseDouble(userInput.nextLine());
                        Multiplication multiplication = new Multiplication(firstMultipliedNumber, secondMultipliedNumber);
                        multiplication.getCalculation();
                        break;

                    case MATH_MENU_DIVISION:
                        System.out.print("\nEnter the number you want to divide: ");
                        double firstDividedNumber = Double.parseDouble(userInput.nextLine());
                        System.out.print("\nEnter the number you want to divide by: ");
                        double divideByNumber = Double.parseDouble(userInput.nextLine());
                        Division division = new Division(firstDividedNumber, divideByNumber);
                        division.getCalculation();
                        break;
                    case EXIT_FROM_MATH_OPTIONS:
                        currentMenu = MAIN_MENU_DISPLAY;
                        break;

                    case TEST_MENU_ADDITION:
                        int addNumberOne = random.nextInt(101);
                        int addNumberTwo = random.nextInt(101);
                        while(true) {
                            System.out.print("What is " + addNumberOne + " + " + addNumberTwo + ": ");
                            String additionAnswerString = userInput.nextLine();
                            int additionAnswer = Integer.parseInt(additionAnswerString);
                            if (additionAnswer == (addNumberOne + addNumberTwo)) {
                                System.out.println("Correct!");
                                rightAnswer++;
                                break;
                            } else if (additionAnswer != (addNumberOne + addNumberTwo)) {
                                System.out.println("Wrong try again\n");
                                System.out.println("Type \"stop\" if you want to go back\nor keep trying until you get it right\n");
                                wrongAnswer++;
                            }
                            else if (additionAnswerString.equalsIgnoreCase("stop")){
                                break;
                            }
                        }
                        break;

                    case TEST_MENU_SUBTRACTION:
                        int subNumberOne = random.nextInt(101);
                        int subNumberTwo = random.nextInt(101);
                        while(true) {
                            if(subNumberOne >= subNumberTwo) {
                                System.out.print("What is " + subNumberOne + " - " + subNumberTwo + ": ");
                                String additionAnswerString = userInput.nextLine();
                                int additionAnswer = Integer.parseInt(additionAnswerString);
                                if (additionAnswer == (subNumberOne - subNumberTwo)) {
                                    System.out.println("Correct!");
                                    rightAnswer++;
                                    break;
                                } else if (additionAnswer != (subNumberOne + subNumberTwo)) {
                                    System.out.println("Wrong try again\n");
                                    System.out.println("Type \"stop\" if you want to go back\nor keep trying until you get it right\n");
                                    wrongAnswer++;
                                } else if (additionAnswerString.equalsIgnoreCase("stop")) {
                                    break;
                                }
                            }
                            else {
                                subNumberOne = random.nextInt(101);
                                subNumberTwo = random.nextInt(101);
                            }
                        }
                        break;
                    case TEST_MENU_MULTIPLICATION:
                        int MultiplyNumberOne = random.nextInt(16 );
                        int MultiplyNumberTwo = random.nextInt(16);
                        while(true) {
                            System.out.print("What is " + MultiplyNumberOne + " * " + MultiplyNumberTwo + ": ");
                            String additionAnswerString = userInput.nextLine();
                            int additionAnswer = Integer.parseInt(additionAnswerString);
                            if (additionAnswer == (MultiplyNumberOne * MultiplyNumberTwo)) {
                                System.out.println("correct");
                                rightAnswer++;
                                break;
                            } else if (additionAnswer != (MultiplyNumberOne * MultiplyNumberTwo)) {
                                System.out.println("Wrong try again\n");
                                System.out.println("Type \"stop\" if you want to go back\nor keep trying until you get it right\n");
                                wrongAnswer++;
                            }
                            else if (additionAnswerString.equalsIgnoreCase("stop")){
                                break;
                            }
                        }
                        break;
                    case TEST_MENU_DIVISION:
                        int divideNumberOne = random.nextInt(101);
                        int divideNumberTwo = random.nextInt(101);
                        while(true) {

                            if ((divideNumberOne % divideNumberTwo == 0) && divideNumberOne > divideNumberTwo) {
                                System.out.print("What is " + divideNumberOne + " / " + divideNumberTwo + ": ");
                                String additionAnswerString = userInput.nextLine();
                                int additionAnswer = Integer.parseInt(additionAnswerString);
                                if (additionAnswer == (divideNumberOne / divideNumberTwo)) {
                                    System.out.println("correct");
                                    rightAnswer++;
                                    break;
                                } else if (additionAnswer != (divideNumberOne / divideNumberTwo)) {
                                    System.out.println("Wrong try again\n");
                                    System.out.println("Type \"stop\" if you want to go back\nor keep trying until you get it right\n");
                                    wrongAnswer++;
                                } else if (additionAnswerString.equalsIgnoreCase("stop")) {
                                    break;
                                }
                            }
                            else {
                                divideNumberOne = random.nextInt(101);
                                divideNumberTwo = random.nextInt(101);
                            }
                        }
                        break;

                    case EXIT_MENU_TESTING:
                        double answer = 0;
                        double totalAttempts = (rightAnswer + wrongAnswer);

                            answer = (rightAnswer /totalAttempts) * 100;

                        System.out.println("You got " + (int) rightAnswer + " correct and " +  (int) wrongAnswer + " incorrect ");
                        System.out.println("Your total correct answers is " + String.format("%.1f", answer)+ "%");

                        currentMenu = MAIN_MENU_DISPLAY;
                        break;
                    case FORMULAS:
                        Formulas formulas = new Formulas();
                        formulas.formulas();
                        break;

                    case TEST:
                        currentMenu = TEST_SKILLS_GAME;
                        break;
                    case EXIT_FROM_PROGRAM:
                        runMenu = false;
                        System.out.println("\nThanks for playing!");
                        break;
                    default:
                        break;
                }

            }
            catch (Exception ex) {
                System.out.println("\n*********************************");
                System.out.printf("'%s' Is Not a Valid Option%n", selection);
                System.out.println("*********************************");
            }
        }
    }
    private void displayMenu(String [] menu){
        System.out.println();
        if(currentMenu == MAIN_MENU_DISPLAY) {
            System.out.println("Welcome to Jackson's Math game, this is meant for learning basic Math functions \nPlease see options below and get started");
            System.out.println("\n*******************************************");
        }
        else if (currentMenu == SHAPES_MENU_DISPLAY) {
            System.out.println("\n*********************");
        }
        else if(currentMenu == MATH_MENU_DISPLAY){
            System.out.println("********************");
        }
        for (int i = 0; i < menu.length; i++){
            System.out.printf("[%1$s] %2$s\n", i + 1, menu[i]);
        }
        if (currentMenu == MAIN_MENU_DISPLAY) {
            System.out.println("*******************************************");
        }
        else if (currentMenu == SHAPES_MENU_DISPLAY) {
            System.out.println("*********************");
        }
        else if(currentMenu == MATH_MENU_DISPLAY){
            System.out.println("********************");
        }
    }
}

