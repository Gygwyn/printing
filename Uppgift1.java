package input;

import java.util.Scanner;

public class Uppgift1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		while (true) {
				System.out.print("Enter first number: ");
				int number1 = scanner.nextInt();
				System.out.print("Multiplied with: ");
				int number2 = scanner.nextInt();
			System.out.print("" + number1 + " x " + number2 + " = " + number1 * number2);
				break;
				
		}
		
	}

}
