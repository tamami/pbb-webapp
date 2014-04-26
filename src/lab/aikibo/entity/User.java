package lab.aikibo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="DAT_LOGIN")
public class User {
	
	private String namaLogin;
	private String nip;
	private String password;
	
	public User(String namaLogin, String nip, String password) {
		this.namaLogin = namaLogin;
		this.nip = nip;
		this.password = password;
	}
	
	public User() {}
	
	public void setNamaLogin(String namaLogin) {
		this.namaLogin = namaLogin;
	}
	
	@Id
	@Column(name="NM_LOGIN", unique=true)
	public String getNamaLogin() {
		return namaLogin;
	}
	
	public void setNip(String nip) {
		this.nip = nip;
	}
	
	@Column(name="NIP")
	public String getNip() {
		return nip;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Column(name="PASSWORD")
	public String getPassword() {
		return password;
	}

}
