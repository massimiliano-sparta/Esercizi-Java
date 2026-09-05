public class Moto extends Veicolo{
	private int cilindrata;

	public Moto(String marca, int anno, int cilindrata){
		super(marca, anno);
		this.cilindrata = cilindrata;
	}

	public void setCilindrata(int cilindrata){
		this.cilindrata = cilindrata;
	}

	public int getCilindrata(){
		return this.cilindrata;
	}

	public static void main(String[] args){
		Moto m = new Moto("Harley Davidson", 1990, 89);
		System.out.println("La mia è una " + m.getMarca() + " del " + m.getAnno() + " con " + m.getCilindrata() + " di cilindrata");
	}

}
