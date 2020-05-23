package inventory;

import rewards.Item;

import java.util.List;

public class InventoryReader {

	public void InventoryReader(List<Item> items) {

		for (int i = 0; i < items.size(); i++) {
			System.out.println(items.get(i));
		}

	}
}
