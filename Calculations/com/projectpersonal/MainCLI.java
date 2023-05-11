package com.projectpersonal;

import com.projectpersonal.MathFunctions.*;
import com.projectpersonal.Shapes.Formulas;
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
        Console console = new Console();
        MathTest mathTest = new MathTest();
        boolean runMenu = true;
        while (runMenu) {
            displayMenu(currentMenu);
            System.out.print("\nPlease make a selection: ");
            String selection = userInput.nextLine();
            try {
                int selectionIndex = Integer.parseInt(selection) - 1;
                String menuOption = currentMenu[selectionIndex];

                switch (menuOption) {
                    case SHAPES_MENU -> currentMenu = SHAPES_MENU_DISPLAY;
                    case SHAPES_MENU_RECTANGLE -> console.shapesRectangle();
                    case SHAPES_MENU_SQUARE -> console.shapesSquare();
                    case SHAPES_MENU_TRIANGLE -> console.shapesTriangle();
                    case BACK_TO_MAIN_MENU -> currentMenu = MAIN_MENU_DISPLAY;
                    case SIMPLE_MATH_MENU -> currentMenu = MATH_MENU_DISPLAY;
                    case MATH_MENU_ADDITION -> console.mathAddition();
                    case MATH_MENU_SUBTRACTION -> console.mathSubtraction();
                    case MATH_MENU_MULTIPLICATION -> console.mathMultiplication();
                    case MATH_MENU_DIVISION -> console.mathDivision();
                    case EXIT_FROM_MATH_OPTIONS -> currentMenu = MAIN_MENU_DISPLAY;
                    case TEST_MENU_ADDITION -> mathTest.mathTestAddition();
                    case TEST_MENU_SUBTRACTION -> mathTest.mathTestSubtraction();
                    case TEST_MENU_MULTIPLICATION -> mathTest.mathTestMultiplication();
                    case TEST_MENU_DIVISION -> mathTest.mathTestDivision();
                    case EXIT_MENU_TESTING -> {
                        currentMenu = MAIN_MENU_DISPLAY;
                        mathTest.finalScore();
                    }
                    case FORMULAS -> {
                        Formulas formulas = new Formulas();
                        formulas.formulas();
                    }
                    case TEST -> currentMenu = TEST_SKILLS_GAME;
                    case EXIT_FROM_PROGRAM -> {
                        runMenu = false;
                        System.out.println("\nThanks for playing!");
                    }
                    default -> {
                    }
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

