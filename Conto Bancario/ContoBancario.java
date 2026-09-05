public class ContoBancario{
	private String intestatario;
	private double saldo;

	public ContoBancario(String intestatario, double saldo){
		this.intestatario = intestatario;
		this.saldo = saldo;
	}

	public String getIntestatario(){
		return intestatario;
	}

	public double getSaldo(){
		return saldo;
	}

	public void deposita(double importo){
		if (importo <= 0){
			throw new IllegalArgumentException("L'importo deve essere positivo");
		}
		this.saldo += importo; 
	}

	public void preleva(double importo) throws SaldoInsufficienteException {
		if (importo <= 0){
			throw new IllegalArgumentException("L'importo deve essere positivo");
		}
		if (this.saldo - importo < 0){
			throw new SaldoInsufficienteException("Saldo insufficiente");
		}

		this.saldo -= importo;
	}

	public static void  main(String[] args){
		ContoBancario c = new ContoBancario("Massimiliano", 2000);
		System.out.println(c.getIntestatario());
		System.out.println(c.getSaldo());
		c.deposita(500);
		System.out.println(c.getSaldo());
		try {
			c.preleva(2000);
		} catch (SaldoInsufficienteException e){
			System.out.println("Errore: " + e.getMessage());
		}
		System.out.println(c.getSaldo());
		try {
			c.preleva(600);
		} catch (SaldoInsufficienteException e) {
			System.out.println("Errore: " + e.getMessage());
		}
		try {
			c.deposita(-500);
		} catch (IllegalArgumentException e){
			System.out.println("Errore: " + e.getMessage());
		}
	}

}
