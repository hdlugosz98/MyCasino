package lottery;

import inventory.Inv;
import rewards.Item;

public class LotteryRewardProgram {

	public void addReward(String reward) {
		Inv inv = new Inv();

		switch (reward) {
			case "keychain":
				inv.addItem(new Item("Keychain", 2));
				break;
			case "teddy bear":
				inv.addItem(new Item("Teddy Bear", 5));
				break;
			case "10$":
				inv.addMoney(10);
				break;
			case "100$":
				inv.addMoney(100);
				break;
			case "nothing":
				break;

		}


	}

}
