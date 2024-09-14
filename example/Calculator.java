package org.example;

import java.util.Scanner;

public class Calculator {
    public void println(String message) {
        System.out.println(message);
    }
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        //Starting with "math time: "
        System.out.print("Math time: ");
        //Use scanner to get the numbers
        String input = scanner.nextLine();
        //Force input be a integer
        Integer.parseInt(input);
        //Let scanner get the integer numbers
        int number = Integer.parseInt(input);
        //Test scanner >>> if (number == 3);{System.out.println("Three");}
        
    }
}