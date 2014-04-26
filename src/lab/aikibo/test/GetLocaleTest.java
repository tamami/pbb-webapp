package lab.aikibo.test;

import java.util.Locale;

public class GetLocaleTest {
	
	public static void main(String args[]) {
		Locale[] lokal = Locale.getAvailableLocales();
		
		for(int i=0; i < lokal.length; i++) {
			System.out.println(lokal[i]);
		}
	}

}
