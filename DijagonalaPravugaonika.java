package linijska.struktura;

import java.util.Scanner;

public class DijagonalaPravugaonika {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite vrednost stranice pravugaonika a: ");
		double a = input.nextDouble();
		System.out.println("Unesite vrednost stranice pravugaonika b: ");
		double b = input.nextDouble();

		// stampanje vrednosti dijagonale pravugaonika
		System.out.println("Dijagonala pravugaonika je " + Math.sqrt(a * a + b * b));

	}

}
