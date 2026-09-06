import java.io.Serializable;

public class Libro implements Serializable{
	private String titolo;
	private int pagine;

	public Libro(String titolo, int pagine){
		this.titolo = titolo;
		this.pagine = pagine;
	}

	public String getTitolo(){
		return this.titolo;
	}

	public int getPagine(){
		return this.pagine;
	}

	public void stampaInfo(){
    		System.out.println("Titolo: " + titolo);
    		System.out.println("Pagine: " + pagine);
	}
}
