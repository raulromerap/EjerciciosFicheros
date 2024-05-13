package ejercicio04;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner sc = null;
		try {
			sc = new Scanner(new FileReader("src\\ejercicio04\\Texto.txt"));
			String linea = "";
			while(!(linea = sc.nextLine()).contains("fin")) {
				System.out.println(linea);
			}
			
		} catch (FileNotFoundException e) {
			e.getStackTrace();
		}finally {
			sc.close();
		}
		
	}
	
}
