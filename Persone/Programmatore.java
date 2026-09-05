public class Programmatore extends Lavoratore{
	public Programmatore(String nome){
		super(nome);
	}

	@Override
	public void lavora(){
		System.out.println("Sto scrivendo codice");
	}

	public static void main(String[] args){
		Programmatore max = new Programmatore("Max");
		max.lavora();
	}
}
