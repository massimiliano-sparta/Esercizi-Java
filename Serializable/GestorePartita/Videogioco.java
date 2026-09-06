import java.io.Serializable;

public class Videogioco implements Serializable{
	private String nome;
	private int livelloRaggiunto;

	public Videogioco(String nome, int livelloRaggiunto){
		this.nome = nome;
		this.livelloRaggiunto = livelloRaggiunto;
	}

	public void setNome(String nome){
		this.nome = nome;
	}

	public void setLivello(int livello){
		this.livelloRaggiunto = livello;
	}
		
	public String getNome(){
		return this.nome;
	}

	public int getLivello(){
		return this.livelloRaggiunto;
	}
}
