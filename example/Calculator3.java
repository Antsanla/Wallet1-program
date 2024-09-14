package org.example;

import java.util.Scanner;

public class Calculator3 {
    public void println(String message) {
        System.out.println(message);
    }
    public static void main(String[] args) {
        Calculator3 calculator = new Calculator3();
        Scanner scanner = new Scanner(System.in);
        //Starting with "math time: "
        System.out.print("What's your 1st num: ");
        //Use scanner to get the numbers
        String input = scanner.nextLine();
        System.out.println("Your 1st num is: "+input);
        System.out.println("Next step, +-*/ ");
        System.out.print("Which one are you using? +-*/ ? :");
        String input2 = scanner.nextLine();
        System.out.println("Your selection is : "+input2);
        System.out.print("Last step, what is your third num:");
        String input3 = scanner.nextLine();
        System.out.println("Your 3rd num is: "+input3);
        System.out.println("Great, Let me count it for you!");
        float number1 = Float.parseFloat(input);
        float number2 = Float.parseFloat(input3);
        float result = 0;
        if (input2.equals("+")) {
            result = number1 + number2;
        } else if (input2.equals("-")) {
            result = number1 - number2;
        } else if (input2.equals("*")) {
            result = number1 * number2;
        } else if (input2.equals("/")) {
            result = number1 / number2;
        }
        System.out.println("Your answer is : " + result);
    }
}