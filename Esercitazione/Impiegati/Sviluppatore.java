public class Sviluppatore extends Impiegato implements Runnable{
	int oreLavorate;
	String linguaggio;

	public Sviluppatore(String nome, String ruolo, int oreLavorate){
		super(nome, ruolo);
		this.oreLavorate = oreLavorate;
	}

	public Sviluppatore(String nome, String ruolo, int oreLavorate, String linguaggio){		super(nome, ruolo);
	     this.oreLavorate = oreLavorate;
	     this.linguaggio = linguaggio;
	}

	public int getOreLavorate(){
		return this.oreLavorate;
	}

	public String getLinguaggio(){
		return this.linguaggio;
	}

	@Override
	public void run(){
		this.oreLavorate += 8;
	}

	public static void main (String[] args){
		Sviluppatore Simone = new Sviluppatore("Simone", "Capo", 69, "Java");
		System.out.println(Simone.getNome());
		System.out.println(Simone.getRuolo());
		System.out.println(Simone.getLinguaggio());
		System.out.println(Simone.getOreLavorate());
	}
}
