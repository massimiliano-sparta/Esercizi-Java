public class Impiegato{
	private String nome;
	private String ruolo;

	public Impiegato(String nome, String ruolo){
		this.nome = nome;
		this.ruolo = ruolo;
	}

	public String getNome(){
		return this.nome;
	}

	public String getRuolo(){
		return this.ruolo;
	}

	public void setNome(String Nome){
		this.nome = Nome;
	}

	public void setRuolo(String Ruolo){
		this.ruolo = Ruolo;
	}
}
