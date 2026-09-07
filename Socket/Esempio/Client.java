import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.IOException;
import java.net.Socket;

public class Client {
	public Client (){
	}

	public String codifica(String messaggioIn){
		String rispostaDelServer = "";

		try (
			Socket mioSocket = new Socket("127.0.0.1", 1245);
			PrintWriter out = new PrintWriter(mioSocket.getOutputStream(), true);
			BufferedReader in = new BufferedReader(new InputStreamReader(mioSocket.getInputStream()))
			){
				out.println(messaggioIn);
				rispostaDelServer = in.readLine();
		}
		catch (IOException e){
			System.out.println("Errore di connessione: " + e.getMessage());
		}
		return rispostaDelServer;
	}
} 
