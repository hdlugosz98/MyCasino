package inventory;

import lottery.ArrayReader;
import rewards.Item;

import java.util.ArrayList;
import java.util.List;

public class Inv {

	List<Item> items = new ArrayList();
	int balance;

	public void showInventory() {
		InventoryReader ir = new InventoryReader();
		ir.InventoryReader(items);
	}

	public void showBalance() {
		System.out.println(balance);
	}

	public void addItem(Item item){
		items.add(item);
	}

	public void removeItem(Item item){
		items.remove(item);
	}

	public void addMoney(int money) {
		balance = balance + money;
	}

	public void removeMoney(int money) {
		balance = balance - money;
	}

}
