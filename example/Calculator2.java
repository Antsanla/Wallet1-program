package org.example;

import java.util.Scanner;

public class Calculator2 {
    public void println(String message) {
        System.out.println(message);
    }
    public static void main(String[] args) {
        Calculator2 calculator = new Calculator2();
        Scanner scanner = new Scanner(System.in);
        //Starting with "math time: "
        System.out.print("Math time: ");
        //Use scanner to get the numbers
        String input = scanner.nextLine();
        //Force input be a integer
        //(?)Float.parseFloat(input);
        //Let scanner get the float numbers
        //(?)float number = Float.parseFloat(input);
        //(?)System.out.print("NUM:"+input);
        //show input
        try{
            float number =Float.parseFloat(input);
        calculator.println("NUM1: "+number);
        }catch (NumberFormatException e){
            calculator.println("ERROR INPUT!! Try again!");
        }

        scanner.close();
    }
}
