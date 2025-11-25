package vendingmachine;

import java.util.Scanner;

public class vendingmachine {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int stock = 10;
		int snacks;
		int customers = 1;

		for (customers = 1; customers < 6; customers++) {
			System.out.println("Customer #" + customers);
			System.out.println("enter the number of snacks you want:");
			snacks = in.nextInt();
			if (stock == 0) {
				System.out.println("Restocking...");
				stock = 10;
				System.out.println("Restocked successfully! Stock: " + 10);
			} else {
				if (snacks > stock) {
					System.out.println("not enough, remaining: " + stock);
				} else {
					stock = stock - snacks;
					System.out.println("Succesfull payment, remaining: " + stock);
				}
			}
		}

	}
}
