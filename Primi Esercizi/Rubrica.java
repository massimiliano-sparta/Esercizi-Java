import java.util.Scanner;

public class Rubrica {
	private String nome;
	private String cognome;
	private int numeroTelefono;

	public Rubrica(String nome, String cognome, int numeroTelefono){
		this.nome = nome;
		this.cognome = cognome;
	        this.numeroTelefono = numeroTelefono;	
	}
	
	public String getNome(){
		return nome;
	}

	public String getCognome(){
		return cognome;
	}

	public int getNumeroTelefono(){
		return numeroTelefono;
	}



	public static void main(String[] args){
		Rubrica rubrica = new Rubrica("Max", "Sparta", 333333333);

		System.out.println("");
		System.out.println("Mi chiamo " + rubrica.getNome() + " " + rubrica.getCognome());
		System.out.println("Ho il numero " + rubrica.getNumeroTelefono());
		
	}

}
