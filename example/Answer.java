package org.example;

import java.util.Scanner;

public class Answer {
    // How to show info
    public void println(String message) {
        System.out.println(message);
    }

    public static void main(String[] args) {
        Answer answer = new Answer();
        Scanner scanner = new Scanner(System.in);

        // print information
        System.out.print("Math time: ");

        // read input
        String input = scanner.nextLine();

        // display input
        answer.println("Your number is: " + input);

        // turn off the Scanner
        scanner.close();
    }
}
