package UUP;

import java.text.DecimalFormat;
import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.####");
		System.out.println("Unesite masu u kilogramima "); 
		double m = input.nextDouble();
		System.out.println("Unesite visinu u centimetrima "); 
		int h = input.nextInt();
		input.close();
		System.out.println("Indeks BMI je " + m / Math.pow(h, 2)); 
		
	double y = Math.sqrt(Math.exp(x/2) + 1.2 * Math.sin(x*x))/(3.3 * Math.cos(x) - 7.1 * Math.exp(x));
	}

}
