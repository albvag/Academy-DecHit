package stringhe;

public  abstract class CheckString {

	private CheckString next;
	private boolean esito;
	
	public CheckString(CheckString n) {
		
		this.next = n;
		this.esito = false;
	}
	
	public boolean getEsito() {
		return this.esito;
	}
	
	public boolean setEsito(boolean esito) {
		return this.esito = esito;
	}

	
	public CheckString getNext() {
		return this.next;
	}
	
	public CheckString setNext(CheckString next) {
		return this.next = next;
	}
	
	public boolean check() {
		System.out.println("check del padre\nEsito: "+this.esito);
		if(this.esito) {
			System.out.println("sono dentro");
			return true;
		}
		else {
			System.out.println("getnext(): "+getNext());
			if(this.next != null) {

				System.out.println("Next non è null");
				next.check();
							
			}
		}
		System.out.println("Risultato check padre: false");
		return false;
		
	}
}
