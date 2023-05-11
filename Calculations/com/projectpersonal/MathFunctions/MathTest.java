package com.projectpersonal.MathFunctions;

import java.util.Random;
import java.util.Scanner;

public class MathTest {

    public MathTest(){}
    Random random = new Random();
    Scanner userInput = new Scanner(System.in);
    double rightAnswer = 0;
    double wrongAnswer = 0;

    public void mathTestAddition(){
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

    }

    public void mathTestSubtraction(){
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

    }

    public void mathTestMultiplication(){
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

    }

    public void mathTestDivision(){
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
    }
    
    public void finalScore(){
        double answer = 0;
        double totalAttempts = (rightAnswer + wrongAnswer);

        answer = (rightAnswer /totalAttempts) * 100;

        System.out.println("You got " + (int) rightAnswer + " correct and " +  (int) wrongAnswer + " incorrect ");
        System.out.println("Your total correct answers is " + String.format("%.1f", answer)+ "%");



    }




}
