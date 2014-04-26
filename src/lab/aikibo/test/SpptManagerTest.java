package lab.aikibo.test;

import lab.aikibo.manager.SPPTManager;
import lab.aikibo.util.NopParser;

public class SpptManagerTest {
	
	// test using nop: 31.71.060.004.005.0009.0 in 1995
	public static void main(String args[]) throws Exception {
		String nop = "317106000400500090";
		System.out.println("Panjang nop : " + nop.length());
		System.out.println("NOP : " + NopParser.getPropinsiCode(nop) + "." +
				NopParser.getDati2Code(nop) + "." + NopParser.getKecamatanCode(nop));
		SPPTManager spptMan = new SPPTManager();
		if(spptMan.isAnyNop(nop, "1995")) {
			System.out.println("Nop-nya ketemu");
		} else {
			System.out.println("GAGAL");
		}
		
	}

}
