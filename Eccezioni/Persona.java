public class Persona{
	String nome;
	String Cognome;
	int eta;

	public static void controllaEta(int eta){
		if (eta < 0){
			throw new IllegalArgumentException("Età non valida.\n");
		}

		System.out.println("Età: " + eta);
	}

	public static void main(String[] args){
		String nome = null;

		try{
			controllaEta(-5);
		}
		catch (IllegalArgumentException e){
			System.out.println(e.getMessage());
		}
		try {
			System.out.println(nome.length());
		} catch (NullPointerException e){
			System.out.println("La string è null!\n");
		}
		finally{
			System.out.println("Operazioni completate.\n");
		}
	}
}
