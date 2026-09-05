public class Convertitore{
	public static int converti(int km){
		int metri = 1000 * km;
		return metri;
	}

	public static void main(String[] args){
		int prova = converti(69);
		System.out.println(prova);
	}
}
