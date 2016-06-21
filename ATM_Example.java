package hw2;

import java.util.Scanner;

public class ATM_Example {

	public static void main(String[] args) {
		System.out.println("Please enter your PIN:");
		Scanner input = new Scanner(System.in);
		int pin = input.nextInt();
		boolean ans = true;
		int a;
		Scanner input1 = new Scanner(System.in);
		if (pin == 2288) {
			do {
				System.out.println("\nSelect the type of trasaction you want to perform:");
				System.out.println("1. Balance inqury");
				System.out.println("2. Money Withdrawl");
				System.out.println("3. Money Deposit");
				System.out.println("4. Change PIN");
				System.out.println("0. Exit");

				System.out.print("Type your choice: ");
				a = input1.nextInt();

				if (a == 0) {
					ans = false;
					System.out.println("Thank you for using ATM");
				} else if (a == 1) {
					System.out.printf("Your Balance is $2039");
				} else if (a == 2) {
					System.out.printf("Please select the amount to be withdrawn");
				} else if (a == 3) {
					System.out.printf("Please insert the money to be deposited");
				} else if (a == 4) {
					System.out.printf("Enter your new PIN");
				}

			} while (ans);

		} else {
			System.out.println("You have entered a wrong PIN");
		}
	}

}
