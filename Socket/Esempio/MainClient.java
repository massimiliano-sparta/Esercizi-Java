public class MainClient{
	public static void main(String[] args){
		Client client = new Client();
		String risposta = client.codifica("ciao server!");
		System.out.println("Risposta del server: " + risposta);
	}
}
