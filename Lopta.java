package linijska.struktura;

import java.util.Scanner;

public class Lopta {



	public static void main(String[] args) {
		
		Scanner ulaz = new Scanner(System.in);
		
		System.out.println("Unesite vrednost poluprecnika ");
		double r = ulaz.nextDouble();
		
		double p = Math.pow(r, 2) * Math.PI *4; 
		double v = Math.pow(r, 3) * Math.PI * 4.0 / 3;
		
		System.out.println("Povrsina lopte je "+ p);
		
		System.out.println("Zapremina je " + v);
		
	}

}
