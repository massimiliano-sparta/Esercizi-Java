public class Veicolo{
	private String marca;
	private int anno;

	public Veicolo (String marca, int anno){
		this.marca = marca;
		this.anno = anno;
	}

	public void setMarca(String marca){
		this.marca = marca;
	}

	public void setAnno(int anno){
		this.anno = anno;
	}

	public String getMarca(){
		return this.marca;
	}

	public int getAnno(){
		return this.anno;
	}
}
