public class Esame {
	public static void main (String[] args){
		int voto = 13;

		if (voto == 30){
			System.out.println("Complimenti!");
		}
		else if (voto < 18){
			System.out.println("Non sei passato");
		}
		else {
			System.out.println("Il tuo voto è " + voto);
		}
	}
}
