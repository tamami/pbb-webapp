package lab.aikibo.services;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/** @TODO: must get data from oracle db */
public class UserCredential implements Serializable {
	
	String nama;
	String nip;
	
	Set<String> roles = new HashSet<String>();
	
	public UserCredential(String nama, String nip) {
		this.nama = nama;
		this.nip = nip;
		roles.add("users");
	}
	
	public UserCredential() {
		this.nama = "anonymous";
		this.nip = "Anonymous";
		roles.add("anonymous");
	}
	
	public String getNama() {
		return nama;
	}
	
	public void setNama(String nama) {
		this.nama = nama;
	}
	
	public String getNip() {
		return nip;
	}
	
	public void setNip(String nip) {
		this.nip = nip;
	}
	
	public boolean isAnonymous() {
		return "anonymous".equals(nama);
	}
	
	public boolean hasRole(String role) {
		return roles.contains(role);
	}
	
	public void addRole(String role) {
		roles.add(role);
	}

}
