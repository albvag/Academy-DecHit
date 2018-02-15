package stringhe;

import algoritmi.*;

public class Programma_Stringhe {

	public static void main(String[] args) {
		
		CheckString hm = new Hunt_Mcilroy(null);
		CheckString lv = new Levenshtein(hm);
		CheckString wf = new Wagner_Fischer(lv);
		
		wf.check();
			
			
			
		
	}

}
