package UUP;

import java.io.*;

public class Inc {

	public static void main(String[] args) throws Exception {
		
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		
		// Unos dijagonale ekrana izražene u inčima 
		System.out.print("Unesite dijagonalu ekrana u inčima: ");
		
		
		// Štampanje rezultata 
		System.out.println("Dijagonala ekrana izražena u centimetrima " 
		+ (Double.parseDouble(ulaz.readLine())) * 2.54);
		
	

	}

}
