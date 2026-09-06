import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.IOException;


public class GestoreSalvataggi{
	public static void salvaPartita(Videogioco gioco){
		try {
			FileOutputStream fileOut = new FileOutputStream("salvataggio.bin");
			ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);

			objectOut.writeObject(gioco);
			objectOut.flush();
			objectOut.close();
		}
		catch (IOException e){
			System.out.println("Eccezione controllata");	
		}

	}

	public static Videogioco caricaPartita(){
		Videogioco vGioco = null;
	        try{
			FileInputStream fileIn = new FileInputStream("salvataggio.bin");
			ObjectInputStream objectIn = new ObjectInputStream(fileIn);

			vGioco = (Videogioco) objectIn.readObject();
			objectIn.close();
		}
		catch(IOException e1){
			System.out.println("IoException");
		}
		catch(ClassNotFoundException e2){
			System.out.println("ClassNotFoundException");
		}

		return vGioco;
	}

	public static void main(String[] args){
		Videogioco videoCaricato = caricaPartita();
		System.out.println(videoCaricato.getNome());
		System.out.println(videoCaricato.getLivello());
	}
}
