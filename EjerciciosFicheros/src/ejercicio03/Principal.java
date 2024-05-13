package ejercicio03;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner sc = null;
		
		try {
			sc = new Scanner(new FileReader("src\\ejercicio03\\Personas.txt"));
			
			String nombres ="";
			int edades = 0;
			double estaturas = 0;
			int cont = 0;
			while(sc.hasNextLine()) {
					nombres = sc.next();
					edades = sc.nextInt();
					estaturas = sc.nextDouble();
					cont++;
					System.out.println(nombres);
				
			}
			System.out.println(edades/cont);
			System.out.println(estaturas/cont);
		} catch (FileNotFoundException e) {
			System.out.println("Error al buscar el archivo");
		}finally {
			sc.close();
		}
	}

}
