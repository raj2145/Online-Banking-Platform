package com.opq.view;

import java.util.Scanner;

import com.oqp.model.Bank;

public class BankView {
    private Bank model;
    private Scanner input;

    public BankView(Bank model) {
        this.model = model;
        input = new Scanner(System.in);
    }

    public void run() {
        System.out.println("Welcome to the Bank!");
        while (true) {
            System.out.println("\n1. Check balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Quit");
            System.out.print("Choose an option: ");
            int choice = input.nextInt();

            if (choice == 1) {
                System.out.printf("Your balance is: %.2f\n", model.getBalance());
            } else if (choice == 2) {
                System.out.print("Enter the deposit amount: ");
                double amount = input.nextDouble();
                model.credit(amount);
            } else if (choice == 3) {
                System.out.print("Enter the withdrawal amount: ");
                double amount = input.nextDouble();
                model.debit(amount);
            } else if (choice == 4) {
                break;
            } else {
                System.out.println("Invalid option, please choose again.");
            }
        }
    }
}