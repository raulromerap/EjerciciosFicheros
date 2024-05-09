package ejercicio02;

import java.io.FileReader;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = null;

		try {
			sc = new Scanner(new FileReader("src\\ejercicio02\\Enteros.txt"));
;
			double suma = 0;
			int cont = 0;
			int valor = 0;
			while(sc.hasNextInt()) {
				valor = sc.nextInt();
				suma += valor;
				cont ++;
			}
			double media = suma/cont;
			System.out.println(suma + " " + media);
		} catch (Exception e) {
			e.getStackTrace();
		} finally {
			sc.close();
		}

	}

}
