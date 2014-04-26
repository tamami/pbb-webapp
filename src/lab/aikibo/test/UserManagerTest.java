package lab.aikibo.test;

import lab.aikibo.manager.UserManager;

public class UserManagerTest {
	
	public static void main(String args[]) {
		String user = "ADMIN";
		System.out.println("Apakah user : " + user + " ada?");
		if(UserManager.isAnyUser(user)) {
			System.out.println("Ya, ada");
			System.out.println("Password: " + UserManager.getPassword(user));
			System.out.println("NIP: " + UserManager.getNip(user));
		} else System.out.println("Tidak, user " + user + " tidak terdaftar.");
	}

}
