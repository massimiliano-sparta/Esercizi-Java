import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.IOException;
import java.net.ServerSocket; 
import java.net.Socket;

public class Server{
	public Server(){
	}

	public void avvia(int porta){
		try (
			ServerSocket serverSocket = new ServerSocket(porta)
		){
			System.out.println("Server in ascolto sulla porta " + porta);
			try (Socket clientSocket = serverSocket.accept()){
				System.out.println("Client connesso!");
				
				BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
				PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
				String messaggioRicevuto = in.readLine();
				System.out.println("Ricevuto dal client: " + messaggioRicevuto);
				String risposta = messaggioRicevuto.toUpperCase();

				out.println(risposta);
			}
		}
		catch  (IOException e){
			System.out.println("Errore nel server: " + e.getMessage());
		}
	}
}
