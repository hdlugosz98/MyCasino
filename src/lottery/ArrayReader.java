package lottery;

public class ArrayReader {


	public void ArrayReader(String[] ar) {
		// help class - arrayreader but without cache

		System.out.print("| ");
		for (int i = 0; i<ar.length; i++) {
			if (!ar[i].equals("nothing")) {
				System.out.print(ar[i]);
				System.out.print(" | ");
			}
		}

	}
}
