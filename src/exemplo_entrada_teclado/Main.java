package exemplo_entrada_teclado;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);		
		
		try {
			while (teclado.hasNextLine()) {
				String texto = teclado.nextLine();
				System.out.println(texto.toUpperCase());
			} 
		} finally {
			teclado.close();
		}
	}

}
