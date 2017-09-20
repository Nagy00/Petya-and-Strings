import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String word1, word2 = "";
		int weight1 = 0;
		int weight2 = 0;
		word1 = scanner.nextLine();
		word2 = scanner.nextLine();
		for (int i = 0; i < word1.length(); i++) {
			char ch = word1.charAt(i);
			if (Character.isLowerCase(ch)) {
				weight1 += getLowerCharOrder(ch);
			} else {
				weight1 += getUpperCharOrder(ch);
			}
		}

		for (int i = 0; i < word2.length(); i++) {
			char ch = word2.charAt(i);
			if (Character.isLowerCase(ch)) {
				weight2 += getLowerCharOrder(ch);
			} else {
				weight2 += getUpperCharOrder(ch);
			}
		}

		if (weight1 > weight2) {
			System.out.println("1");
		} else if (weight1 < weight2) {
			System.out.println("-1");
		} else {
			System.out.println("0");
		}
	}

	public static int getLowerCharOrder(char ch) {
		String alph = "abcdefghijklmnopqrstuvwxyz";
		int index = 0;
		for (int i = 0; i < alph.length(); i++) {
			index = alph.indexOf(ch);
		}
		return index;
	}

	public static int getUpperCharOrder(char ch) {
		String alph = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		int index = 0;
		for (int i = 0; i < alph.length(); i++) {
			index = alph.indexOf(ch);
		}
		return index;
	}
}
