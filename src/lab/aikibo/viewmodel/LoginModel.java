package lab.aikibo.viewmodel;

import java.io.Serializable;

import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.NotifyChange;
import org.zkoss.lang.Strings;
import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.util.Clients;

import lab.aikibo.manager.UserManager;
import lab.aikibo.services.AuthenticationService;
import lab.aikibo.services.AuthenticationServiceImpl;
import lab.aikibo.services.UserCredential;
import lab.aikibo.services.UserInfoService;
import lab.aikibo.services.UserInfoServiceImpl;

public class LoginModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3768543989834105144L;
	
	// services
	AuthenticationService authService = new AuthenticationServiceImpl();
	UserInfoService userInfoService = new UserInfoServiceImpl();
	
	// Data for the view
	String username;
	String password;
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Command
	public void login() {
		String pwd;
		if(Strings.isBlank(username) || Strings.isBlank(password)) {
			Clients.showNotification("Silahkan isi nama pengguna dan kata kuncinya dulu.");
			return;
		} else {
			//Clients.showNotification("Sedang diproses nama " + username + " pass " + password);
			if(authService.login(username, password)) {
				UserCredential cre = authService.getUserCredential();
				Executions.sendRedirect("/index.zul");
				return;
			} else {
				Clients.showNotification("Salah kata kunci atau user anda belum terdaftar, \n" +
			            "hubungi OC SISMIOP");
				return;
			}
		}
	}

}
