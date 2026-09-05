public class Persona{
	private String nome;
	private String cognome;

	public String getNome(){
		return this.nome;
	}

	public String getCognome(){
		return this.cognome;
	}

	public void setNome(String nome){ 
		this.nome = nome;
	}

	public void setCognome(String cognome){
		this.cognome = cognome;
	}

	public Persona(String Nome, String Cognome){
		this.nome = Nome;
		this.cognome = Cognome;
	}

	public static void main (String[] args){
		Persona Max = new Persona("Massimiliano", "Spartà");
		System.out.println(Max.getNome());
		System.out.println(Max.getCognome());
	}
}
