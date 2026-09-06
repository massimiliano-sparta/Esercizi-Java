import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.IOException;


public class GestoreFile{
	public static void salvaLibro(Libro l){
		try{
			FileOutputStream fileOut = new FileOutputStream("preferito.bin");
			ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
			objectOut.writeObject(l);
			objectOut.flush();
			objectOut.close();
		} 
		catch (IOException e){
				System.out.println("IOException catturata");
		}		
	}

	public static Libro caricaLibro(){
		Libro vLibro = null;
		try{
			FileInputStream fileIn = new FileInputStream("preferito.bin");
			ObjectInputStream objectIn = new ObjectInputStream(fileIn);
			vLibro = (Libro) objectIn.readObject();
			objectIn.close();
		}
		catch(IOException e1){
			System.out.println("IOException catturata");
		}
		catch(ClassNotFoundException e2){
			System.out.println("ClassNotFoundException catturata");
		}
		return vLibro;
	}
	
	public static void main(String[] args){
		Libro libroCaricato = caricaLibro();

		libroCaricato.stampaInfo();
	}
}
