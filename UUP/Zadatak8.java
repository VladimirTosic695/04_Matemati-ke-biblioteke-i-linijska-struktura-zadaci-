package UUP;

import java.util.Scanner;

public class Zadatak8 {

	public static void main(String[] args) {
		Scanner u = new Scanner (System.in);
		
		System.out.println("Unesite vrednost x ");
		double x = u.nextDouble();
		

		double y = Math.sqrt(Math.exp(x/2) + 1.2 * Math.sin(x*x))/(3.3 * Math.cos(x) - 7.1 * Math.exp(x));
		
		System.out.println("vrednost y je " + y);
		u.close();
	}

}
