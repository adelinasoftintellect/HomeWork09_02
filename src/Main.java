import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main{

	public static void main(String[] args) {
		boolean result = false;
		Scanner input = new Scanner(System.in);
		System.out.println("Array size:");
		int count = input.nextInt();
		input.nextLine();

		String words[] = new String[count];
		for (int i = 0; i < count; i++) {
			System.out.print("Word: " + (i + 1) + " ");
			words[i] = input.nextLine();
		}

		Set<String> uniques = new HashSet<String>();
		Set<String> dups = new HashSet<String>();

		for (String a : words)
			if (!uniques.add(a))
				dups.add(a);

		// Destructive set-difference
		uniques.removeAll(dups);
		System.out.println("Unique words:    " + uniques);
		System.out.println("Duplicate words: " + dups);
	}
}