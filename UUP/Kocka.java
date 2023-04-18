package UUP;

import java.util.Scanner;

public class Kocka {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite vrednost a ");
	double a = input.nextDouble();
	
	
	double p = 6 * Math.pow(a, 2);
	double v = Math.pow(a, 3);
	
	System.out.println("Povrsina kocke je " + p + " a zapremina je " + v);
input.close();
	}

}
