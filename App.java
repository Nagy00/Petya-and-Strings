import java.util.Scanner;
link : http://codeforces.com/contest/112/problem/A
public class App {

	public static void main(String[] args) {

		
		Scanner in = new Scanner(System.in);
		String firstString = in.next();
		String secondString = in.next();
		firstString = firstString.toLowerCase();
		secondString = secondString.toLowerCase();
		int result = firstString.compareTo(secondString);
		if(result == 0) System.out.println("0");
		else if(result > 0) System.out.println("1");
		else System.out.println("-1");
		in.close();
}
