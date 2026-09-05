public class Dipendente{
	private int stipendio;
	private String nome;

	public Dipendente(String nome, int stipendio){
		this.nome = nome;
		this.stipendio = stipendio;
	}

	public String getNome() {return nome;}
	public void setNome( String  nome ) {this.nome = nome;}
	public int getStipendio() { return stipendio; }
	public void setStipendio( int stipendio ) { this.stipendio = stipendio; }

	public static void main( String[] args ){
		Dipendente d = new Dipendente("Max", 1000);
		System.out.println("Mi chiamo " + d.getNome() + " e prendo " + d.getStipendio() + " al mese ");
	}
}
