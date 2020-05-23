package lottery;


import java.util.Scanner;

public class Lottery {

	public void Lottery() {
		LotteryRewardProgram lrp = new LotteryRewardProgram();

		System.out.println("Welcome to the lottery!");
		System.out.println("Just buy a ticket and check if you won something!");
		lottery:
		while (true) {

			System.out.println();
			System.out.println("Available commands:");
			System.out.println("PLAY | PRIZES | HELP | BACK");
			System.out.println();

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
					// Randomized order:
					String[] rngPrizes = lm.PrizeRandomizer(prizes);
					while (true) {
						System.out.println("Enter the number of ticket you want to buy (1-" + tickets + "):");
						int ticket = (sc.nextInt()) - 1;
						if (0 < (ticket + 1) && (ticket + 1) <= tickets) {
							System.out.println("Your prize:");
							String prize = rngPrizes[ticket];
							System.out.println(prize + "!");
							lrp.addReward(prize);
							System.out.println();
							System.out.println("Do you want to see the PrizeBoard? Y/N");
							Scanner scan = new Scanner(System.in);
							String yn = scan.nextLine();
							System.out.println(yn);
							if (yn.equals("Y")) {
								System.out.println("Prizeboard:");
								PrizeBoard pb = new PrizeBoard();
								pb.showPrizeBoard(rngPrizes);
							} else {
								break lottery;
							}
						} else {
							System.out.println("There's no such a ticket!");
							System.out.println();
						}
					}
				case "BACK":
					break lottery;
			}

		}

	}

}

