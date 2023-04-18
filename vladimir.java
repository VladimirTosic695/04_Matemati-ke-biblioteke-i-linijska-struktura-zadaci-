package linijska.struktura;

import java.util.Scanner;

public class vladimir {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Unesite vrednost a ");
	double a = input.nextDouble();
	System.out.println("Unesite vrednost b ");
	double b = input.nextDouble();
	double y = (1-Math.min(a, b))/(1+Math.max(a, b));
System.out.println("y = " + (1 - Math.min(a, b)) / (1 + Math.max(a, b)));
	}

}
