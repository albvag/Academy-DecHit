package algoritmi;

import stringhe.*;

public class Hunt_Mcilroy extends CheckString {

	
	public Hunt_Mcilroy(CheckString n) {
		super(n);

	}
	
	public boolean check() {
		System.out.println("Sto processando Hunt");
	
		this.setEsito(false);
		
		return super.check();
	}	

	
}
