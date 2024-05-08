package ejercicio01;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Principal {
	public static void main(String[] args) throws IOException {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("src\\ejercicio01\\NumerosReales.txt"));
			
			String linea = br.readLine();
			while(linea != null) {
				System.out.println(linea);
				linea = br.readLine();
			}
			
		}catch (FileNotFoundException e) {
			e.getStackTrace();
		}
		
	}
}
