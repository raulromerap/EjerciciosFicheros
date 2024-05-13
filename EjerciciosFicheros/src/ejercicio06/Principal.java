package ejercicio06;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = null;
		BufferedWriter bw = null;
		int numero = 0;
		String cadena="";
		List<Integer> numeros = new ArrayList<Integer>();
		
		try {
			sc = new Scanner(new FileReader("src\\ejercicio06\\NumerosNoOrdenados.txt"));
			bw = new BufferedWriter(new FileWriter("src\\ejercicio06\\NumerosOrdenados.txt"));
			
			while(sc.hasNextInt()) {
				numero = sc.nextInt();
				numeros.add(numero);
			}
			Collections.sort(numeros);
			
			for(Integer valor : numeros) {
				cadena += String.valueOf(valor) + " ";
			}
			bw.write(cadena);
			
		} catch (Exception e) {
			e.getStackTrace();
		}finally {
			sc.close();
			try {
				bw.flush();
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
