package org.example;

import java.util.Scanner;

public class Wallet1 {
    public void println(String message) {
        System.out.println(message);
    }
    public static void main(String[] args) {
        Wallet1 Wallet = new Wallet1();
        Scanner scanner = new Scanner(System.in);
        System.out.println("This is your digital wallet");
        System.out.println("Any change to you wallet? Enter 1or2 to select Income or Expend");
        String input = scanner.nextLine();       //無用?
        int inorout = scanner.nextInt();        //讀取數值
        scanner.nextLine();       //處理換行原因? 看看GIT狀態
        if (inorout == 1) {
            Wallet.println("Please enter income amount:");
            double income = scanner.nextDouble();
            Wallet.println("You added an income of $" + income);
        } else if (inorout == 2) {
            Wallet.println("You selected Expense. Please enter the amount:");
            double expense = scanner.nextDouble();
            Wallet.println("You added an expense of $" + expense);
        } else {
            Wallet.println("Invalid selection. Please try again.");
        }
    }
}
