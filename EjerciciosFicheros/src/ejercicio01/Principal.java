package ejercicio01;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Principal {
	public static void main(String[] args) throws IOException {
		BufferedReader br= null;
		try {
			br = new BufferedReader(new FileReader("src\\ejercicio01\\NumerosReales.txt"));

			String linea = br.readLine();
            String[] valores = linea.split(" ");
            int i = 0;
            double suma = 0;
            double media = 0;
            
            for(String valor : valores) {
              i++;
              suma += Double.parseDouble(valor);
            }

            try {
            	media= suma/i;
            }catch(ArithmeticException e) {
            	System.out.println("El no contiene numeros");
            }
			System.out.println(suma + " " + media);
			
		}catch (FileNotFoundException e) {
			e.getStackTrace();
		}finally {
			br.close();
		}
		
	}
}
