public class Manager extends Dipendente{
	private int bonus;

	public Manager(String nome, int stipendio, int bonus){
		super(nome, stipendio);

		this.bonus = bonus;
	}
	public int getBonus(){return bonus;}
	public void setBonus(int bonus){this.bonus = bonus;}

	public static void main (String[] args){
		Manager m = new Manager("Gian Franco", 1000, 500);
		System.out.println("Mi chiamo " + m.getNome() + " prendo " + m.getStipendio() + " al mese più bonus " + m.getBonus());
	}
}
