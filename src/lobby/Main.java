package lobby;

import inventory.Inv;
import inventory.Inventory;
import rewards.Item;

public class Main {

	public static void main(String[] args) {

		Lobby lb = new Lobby();
		Inv inv = new Inv();
		inv.addItem(new Item("Keychain", 2));
		inv.showInventory();
		inv.showBalance();
		lb.Lobby();

	}
}
