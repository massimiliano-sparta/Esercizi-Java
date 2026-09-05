public class Numeri{
	int[] numeri;

	public static void main(String[] args){
		try{
			int[] numeri = {10, 20, 30};

			int x = numeri[5];
		}
		catch (ArrayIndexOutOfBoundsException e){
			System.out.println("Indice dell'array non valido.\n");
		}
		try {
			int risultato = 10 / 0;
		}
		catch (ArithmeticException e){
			System.out.println("Divisione per zero.\n");
		}
		finally{
			System.out.println("Operazioni terminate.\n");
		}
	}
}
