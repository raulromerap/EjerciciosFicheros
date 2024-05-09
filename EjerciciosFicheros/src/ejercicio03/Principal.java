package ejercicio03;

import java.io.FileReader;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner sc = null;
		
		try {
			sc = new Scanner(new FileReader("src\\ejercicio03\\Personas.txt"));
			
			String nombres ="";
			while(sc.hasNextLine()) {
				if(!sc.hasNextInt() || !sc.hasNextDouble()) {
					nombres = sc.next();
					System.out.println(nombres);
				}
				
			}
		} catch (Exception e) {
			
		}
	}

}
