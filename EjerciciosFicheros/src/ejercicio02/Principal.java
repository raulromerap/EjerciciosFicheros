package ejercicio02;

import java.io.FileReader;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = null;

		try {
			sc = new Scanner(new FileReader("src\\ejercicio02\\Enteros.txt"));

			int valor = 0;
			double suma = 0;
			double media = 0.0;
			int cont = 0;
			while (valor != -1) {
				valor = sc.nextInt();
				suma += valor;
				cont++;
			}
			System.out.println(suma + " " + media);
		} catch (Exception e) {
			e.getStackTrace();
		} finally {
			sc.close();
		}

	}

}
