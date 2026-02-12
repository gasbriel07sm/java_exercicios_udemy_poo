package ex09.applications;

import ex09.entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Account acc;

        System.out.print("Enter account number: ");
        int number = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter account holder: ");
        String name = sc.nextLine();
        System.out.print("Is there na initial deposit (y/n)? ");
        char op = sc.next().charAt(0);

        if (op == 'y'){
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            acc = new Account(number, name, initialDeposit);
        } else {
            acc = new Account(number, name);
        }

        System.out.println();
        System.out.println("Account data: \n" + acc);

        System.out.print("\nEnter a deposit value: ");
        double amount = sc.nextDouble();
        acc.deposit(amount);
        System.out.println("Updated account data: \n" + acc);

        System.out.print("\nEnter a withdraw value: ");
        amount = sc.nextDouble();
        acc.withdraw(amount);
        System.out.println("Updated account data: \n" + acc);

        sc.close();
    }
}
