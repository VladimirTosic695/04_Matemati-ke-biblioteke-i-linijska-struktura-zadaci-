package linijska.struktura;

import java.util.Scanner;

public class ObimIPovrsinaTrougla {

	public static void main(String[] args) {
		
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite stranice trougla a,b,c ");
		
		double a = ulaz.nextDouble();
		double b = ulaz.nextDouble();
		double c = ulaz.nextDouble();
		
		double o = a + b + c;
		System.out.println("Obim trougla je " + o);
		
		double s = o/2;
		double p = Math.sqrt(s * (s-a)*(s-b)*(s-c));
		System.out.println("Povrsina trougla je "+ p);
		
	}

}
