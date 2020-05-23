package lottery;


import java.util.Scanner;

public class Lottery {

	private void Lottery() {

		System.out.println("Welcome to the lottery!");
		System.out.println("Just buy a ticket and check if you won something!");
		System.out.println();
		System.out.println("Available commands:");
		System.out.println("PLAY | PRIZES | HELP");
		System.out.println();

		while (true) {

			Scanner sc = new Scanner(System.in);
			LotteryMets lm = new LotteryMets();
			String choice = sc.nextLine();

			switch (choice) {
				// PRIZES
				case "PRIZES":
					lm.Prizes();
					break;

				// HELP
				case "HELP":
					System.out.println();
					System.out.println("This is a simple lottery game!");
					System.out.println("There is given number of tickets in total. Each of them has a chance of winning something!");
					System.out.println("There are many valuable items or cash rewards, but the ticket may be empty as well!");
					System.out.println("Try your luck!");
					System.out.println();
					break;


				// PLAY
				case "PLAY":
					String[] prizes = lm.TxtConverter("prizes.txt");
					int tickets = lm.ArrayReader(prizes);
					System.out.println();
					System.out.println("Tickets available: " + tickets);
					System.out.println();
					System.out.println("Randomized order:");
					ArrayReader arr = new ArrayReader();
					arr.ArrayReader(lm.PrizeRandomizer(prizes));

					break;
			}

		}

	}


	public static void main(String[] args) {
		Lottery lt = new Lottery();
		lt.Lottery();
	}
}
