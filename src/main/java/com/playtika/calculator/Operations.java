package com.playtika.calculator;

public class Operations {


    private double numberOne;
    private double numberTwo;

    public Operations(double numberOne, double numberTwo) {
        this.numberOne = numberOne;
        this.numberTwo = numberTwo;
    }



    //Main operations with integers
    public double adding() {
        return numberOne + numberTwo;
    }

    public double subtract() {
        return numberOne - numberTwo;
    }

    public double multiply() {
        return numberOne * numberTwo;
    }

    //Make some changes for test purpose
    public double divide() {
        if (numberTwo == 0 || numberOne==0)  {
            throw new NumberFormatException("It is impossible to divide by 0");
           // System.out.println("Not possible to divide by 0");
        } else {
            return numberOne / numberTwo;

        }
        //return 0;
    }
}


