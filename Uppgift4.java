package input;

import java.util.Scanner;

public class Uppgift4 {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input radius: ");
		double radius = scanner.nextDouble();
		System.out.println("Perimeter is = " + (2 * radius * Math.PI));
		System.out.println("Area is = " + (Math.PI * radius * radius));
		

	}

}
