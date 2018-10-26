package input;

import java.util.Scanner;

public class Uppgift2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
			while (true) {
				System.out.print("Enter first number: ");
				int number1 = scanner.nextInt();
				System.out.print("Plus, minus, multiplied, divided, mod: ");
				int number2 = scanner.nextInt();
				System.out.println("" + number1 + " + " + number2 + " = " + (number1 + number2));
				System.out.println(number1 + " - " + number2 + " = " + (number1 - number2));
				System.out.println(number1 + " x " + number2 + " = " + number1 * number2);
				System.out.println(number1 + " / " + number2 + " = " + number1 / number2);
				System.out.println(number1 + " mod " + number2 + " = " + number1 % number2);
				
			}
		
		
	}

}
