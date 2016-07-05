import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your Math. problem:");
		String problem = in.nextLine();
		int counter = 0;

		for (int i = 0; i < problem.length(); i++) {
			if (problem.charAt(i) == '(') {
				counter++;
			} else if (problem.charAt(i) == ')') {
				counter--;
			}
		}

		if (counter == 0) {
			System.out.println("Correct!");
		} else {
			System.out.println("Wrong!");
		}
		in.close();
	}

}