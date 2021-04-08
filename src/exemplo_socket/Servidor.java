package exemplo_socket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Servidor {

	private static ServerSocket servidor;
		
	public static void main(String[] args) {
		
		try {
			
			servidor = new ServerSocket(8080);
	        System.out.printf("Porta %d aberta!",servidor.getLocalPort());
	        
			Socket cliente = servidor.accept();
			System.out.println("Nova conexão com o cliente " + 
			    cliente.getInetAddress().getHostAddress()
			);
	        
			Scanner scanner = new Scanner(cliente.getInputStream());
			while (scanner.hasNextLine()) {
			    System.out.println(scanner.nextLine());
			}
			
			scanner.close();
			cliente.close();
			servidor.close();
						
		}catch(IOException ex) {
			System.err.println(ex.getMessage());
		}

	}
	
}
