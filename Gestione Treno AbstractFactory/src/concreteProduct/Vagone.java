package concreteProduct;


public abstract class Vagone  {
	
	private String sigla;
	private String descrizione;
		
	public Vagone (String sigla, String descrizione) {
		this.sigla=sigla;
		this.descrizione=descrizione;
	}

	public String getSigla() {
		return sigla;
	}

	public String getDescrizione() {
		return descrizione;
	}
	
	

}
