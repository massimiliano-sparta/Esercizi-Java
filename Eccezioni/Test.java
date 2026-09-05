public class Test {
	public static void main(String[] args){
		int a = 10;
		int b = 0;
	
		try {
			int risultato = a / b;
			System.out.println(risultato);
		} catch (ArithmeticException e){
			System.out.println("Non puoi dividere per zero!\n");
			System.out.println(e.getMessage());
			e.printStackTrace();
		} finally{
			System.out.println("Operazione terminata.");
		}
	}
}
