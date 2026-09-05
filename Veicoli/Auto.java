public class Auto{
	String colore;
	int velocita;

	public Auto(String colore){
		this.colore = colore;
		this.velocita = 0;
	}

	public Auto(){
		this.colore = "Bianca di default";
		this.velocita = 0;
	}

	public void accelera(int incremento){
		this.velocita = this.velocita + incremento;
	}

	public String getColore(){
		return this.colore; 
	}

	public int getVelocita(){
		return this.velocita;
	}

	public static void main(String[] args){
		Auto mia_auto = new Auto("Rossa");
		mia_auto.accelera(50);

		System.out.println(mia_auto.getColore());
		System.out.println(mia_auto.getVelocita());
	}
}
