package inventory;

public class Inventory {

	public void Inventory() {
		Inv inv = new Inv();

		System.out.println();
		System.out.println("Let's take a look at your backpack!");
		System.out.println();
		inv.showInventory();
		System.out.println(inv.balance);
		System.out.println();

	}
}
