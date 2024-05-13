package ejercicio05;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		BufferedWriter bw = null;
		
		String nombre ="";
		int edad = 0;
		try {
			bw = new BufferedWriter(new FileWriter("src\\ejercicio05\\datos.txt", true));
			
			System.out.println("Introduzca su nombre");
			nombre = sc.nextLine();
			System.out.println("Introduzca su edad");
			edad = sc.nextInt();
			
			bw.write(nombre + " - " + edad);
			bw.newLine();
			
		} catch (IOException e) {
			System.out.println("No se ha podido crear el archivo");
		}finally {
			sc.close();
			try {
				bw.flush();
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("Cerrando programa...");
			
		}//finally
		
	}//main

}//class
