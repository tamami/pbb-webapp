package lab.aikibo.test;

import lab.aikibo.manager.RefPropinsiManager;

public class RefPropinsiManagerTest {
	
	public static void main(String args[]) {
		if(RefPropinsiManager.isAnyPropinsi("33")) {
			System.out.println("Data ada");
		} else System.out.println("GAGAL");
	}

}
