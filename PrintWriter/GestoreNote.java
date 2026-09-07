import java.io.PrintWriter;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class GestoreNote{
	public static void salvaNota(String testo, String nomeFile){
		try{
			PrintWriter print = new PrintWriter(nomeFile);
			print.println(testo);
			print.close();
		}
		catch (IOException e){
			System.out.println("Eccezione controllata");
		}
	}

	public static void leggiNota(String nomeFile){
		try{
			FileInputStream fileIn = new FileInputStream(nomeFile);
			Scanner scan = new Scanner(fileIn);
			while (scan.hasNextLine()){
				System.out.println(scan.nextLine());
			}
			scan.close();
		}
		catch(IOException e){
			System.out.println("Eccezione controllata");
		}
	}

	public static void main(String[] args){
		leggiNota("saluto.txt");
	}
}
