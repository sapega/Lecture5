package com.playtika.calculator;


import java.io.IOException;
import java.util.Scanner;

public class Reader {

    //Enter a number if not an integer number it will allow to enter again
    public double readNext() {
        try {
            Scanner scanner = new Scanner(System.in);
            double number;
            if (scanner.hasNextInt()) {
                number = scanner.nextDouble();
            } else {
                throw new IOException();

            }
            return number;
        } catch (IOException e) {
            System.out.println("You have typed not an integer number. Please try again");
        }
        return readNext();
    }
}

