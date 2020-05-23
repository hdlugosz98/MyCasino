package lobby;

import inventory.Inventory;
import lottery.Lottery;

import java.util.Scanner;

public class Lobby {

	public void Lobby() {
		lobby:
		while (true) {
		System.out.println("Welcome to MyCasino lobby!");
		System.out.println("Available commands:");
		System.out.println("BANK - store your money! [SOON]");
		System.out.println("STORAGE - store your items! [SOON]");
		System.out.println("PAWNSHOP - sell your items! [SOON]");
		System.out.println("INVENTORY - check your backpack and wallet!");
		System.out.println("LOTTERY - test your luck in our lottery!");
		System.out.println();

		Scanner sc = new Scanner(System.in);
		String choice = sc.nextLine();

		switch (choice) {
			case "BANK":
				System.out.println("Bank DLC will be released soon!");
				System.out.println();
				break;
			case "STORAGE":
				System.out.println("Storage DLC will be released soon!");
				System.out.println();
				break;
			case "PAWNSHOP":
				System.out.println("Pawnshop DLC will be released soon!");
				System.out.println();
				break;
			case "INVENTORY":
				Inventory inv = new Inventory();
				inv.Inventory();
				break;
			case "LOTTERY":
				Lottery lt = new Lottery();
				lt.Lottery();

		}

		}

	}

}
