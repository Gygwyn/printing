package input;

import java.util.Scanner;

public class Uppgift3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		while (true) {
				System.out.println("Enter a number: ");
				int number = scanner.nextInt();
				for (int i = 1; i <= 10; i++) {
					System.out.println("" + number + " x " + i + " = " + number * i);
				}
				break;
		}
	}

}
