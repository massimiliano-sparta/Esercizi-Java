public abstract class Lavoratore{
	private String nome;

	public Lavoratore(String nome){
		this.nome = nome;
	}

	public void setNome(String nome){
		this.nome = nome;
	}

	public String getNome(){
		return this.nome;
	}

	public abstract void lavora();
}
