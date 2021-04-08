package exemplo_socket;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Cliente {
	
	private static Socket cliente;
	private static Scanner teclado;
	private static PrintStream saida;
			
	public static void main(String[] args) {
		
		try {
			cliente = new Socket("127.0.0.1", 8080);
			System.out.println("O cliente se conectou ao servidor!");
			
			teclado = new Scanner(System.in);
			saida = new PrintStream(cliente.getOutputStream());
			
			while (teclado.hasNextLine()) {
			    saida.println(teclado.nextLine());
			}
			
			saida.close();
			teclado.close();
			cliente.close();
			
		} catch (UnknownHostException e) {
			System.err.println(e.getMessage());
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
	}

}
