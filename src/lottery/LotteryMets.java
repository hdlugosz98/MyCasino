package lottery;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LotteryMets {

	public int ArrayReader(String[] ar) {
		//	reads an array of prizes
		//	igores "nothing" and reapeated prizes
		//	returns number of tickets available

		List<String> cache = new ArrayList<>();
		System.out.print("| ");
		int i;
		for (i = 0; i < ar.length; i++) {
			if (!ar[i].equals("nothing") && !cache.contains(ar[i])) {
				System.out.print(ar[i]);
				System.out.print(" | ");
				cache.add(ar[i]);

			}
		}
		return i;
	}

	public String[] TxtConverter(String fileName) {
		//	converts given .txt file into an array

		List<String> lines = null;
		try {
			lines = Files.readAllLines(Paths.get(fileName));
		} catch (IOException e) {
			e.printStackTrace();
		}
		String[] prizes = new String[lines.size()];
		int i = 0;

		for (String string : lines) {
			prizes[i] = string;
			i++;
		}
		return prizes;
	}

	public void Prizes() {
		System.out.println();
		System.out.println("List of current prizes:");
		String[] prizes = TxtConverter("prizes.txt");
		int tickets = ArrayReader(prizes);
		System.out.println();
		System.out.println("Tickets available: " + tickets);
		System.out.println();
	}

	public String[] PrizeRandomizer(String[] ar) {
		// Given a list of prizes, create a list of them but randomized!

			ArrayReader arr = new ArrayReader();
			Random rd = new Random();
			int lng = ar.length;
			String[] prizes = new String[lng];
			int i;
			for (int e = 0; lng>e; e++) {
				i = (rd.nextInt(lng));
				if (!ar[i].equals("null")) {
					prizes[e] = ar[i];
					ar[i] = "null";
				} else {
					e--;
				}
			}

			return prizes;
		}

	}


