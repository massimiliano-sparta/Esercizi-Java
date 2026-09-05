public class Studente extends Persona implements Runnable{
	private long matricola;
	private String cds; // Corso di Laurea
	
	public void setMatricola(long matricola){
		this.matricola = matricola;
	}

	public void setCds(String Cds){
		this.cds = Cds;
	}

	public long getMatricola(){
		return matricola;
	}

	public String getCds(){
		return cds;
	}

	public Studente(String nome, String cognome, String cds, long matricola){
		super(nome, cognome);
		this.cds = cds;
		this.matricola = matricola;
	}

	@Override
	public void run(){
		this.matricola = this.matricola * this.matricola;
	}

	public static void main(String[] args){
		Studente Max = new Studente("Max", "Sparta", "Informatica", 566093);
		System.out.println(Max.getNome());
		System.out.println(Max.getCognome());
		System.out.println(Max.getCds());
		System.out.println(Max.getMatricola());
		Max.run();
		System.out.println(Max.getMatricola());
		
	}
} 
