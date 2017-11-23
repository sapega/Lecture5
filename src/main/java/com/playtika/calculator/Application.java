package com.playtika.calculator;


public class Application {


    public static void main(String[] args) {
        Reader calculator = new Reader();
        double firstNumber;
        double secondNumber;
        double action;


        do {

            System.out.println("Enter the first number");
            firstNumber = calculator.readNext();

            System.out.println("Enter the second number");
            secondNumber = calculator.readNext();

            Operations operation = new Operations(firstNumber, secondNumber);

            System.out.println("Choose your action");
            System.out.println("1. Adding");
            System.out.println("2. Substracting");
            System.out.println("3. Quit");
            System.out.println("4. Multiply");
            System.out.println("5. Divide");

            action = calculator.readNext();

            if (action == 1) {
                System.out.println(operation.adding());

            } else if (action == 2) {
                System.out.println(operation.subtract());

            } else if (action == 3) {
            } else if (action == 4) {
                System.out.println(operation.multiply());

            } else if (action == 5) {
                System.out.println(operation.divide());

            } else {
                System.out.println("You have typed wrong action");
            }
        } while (action != 3);
    }
}




