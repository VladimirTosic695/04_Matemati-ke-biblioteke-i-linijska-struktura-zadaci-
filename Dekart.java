package linijska.struktura;

import java.io.*;
import java.text.DecimalFormat;

public class Dekart {

	public static void main(String[] args) throws Exception {
		// f - intenzitet sile
		// alfa - ugao izmedju sile F i koordinatne ose
		// x,y - Dekartove koordinate
		
		double f,alfa,x,y;
		
		DecimalFormat df = new DecimalFormat("##.#");
		
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Unesite vrednost za intenzitet sile F (kN) ");
		f = Double.parseDouble(ulaz.readLine());
		System.out.println("Unesite vrednost za ugao alfa u stepenima ");
		alfa = Math.toRadians(Double.parseDouble(ulaz.readLine()));
		
		//Izracunavanje Dekartovig koordinata
		
		x = f*Math.cos(alfa);
		y = f*Math.sin(alfa);
		
		// stampanje rezultata
		
		System.out.println("Vrednosti Dekartovih koordinata su X= " + df.format(x) + "\tY = " + df.format(y));
		
		

	}

}
