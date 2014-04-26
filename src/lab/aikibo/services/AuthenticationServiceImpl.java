package lab.aikibo.services;

import java.io.Serializable;

import lab.aikibo.manager.UserManager;

import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.Session;
import org.zkoss.zk.ui.Sessions;
import org.zkoss.zk.ui.util.Clients;

public class AuthenticationServiceImpl implements AuthenticationService, Serializable {
	
	public UserCredential getUserCredential() {
		Session sess = Sessions.getCurrent();
		UserCredential cre = (UserCredential) sess.getAttribute("userCredential");
		if(cre == null) {
			cre = new UserCredential();  // new an anonymous user and set to session
			sess.setAttribute("userCredential", cre);
		}
		return cre;
	}
	
	public boolean login(String nm, String pd) {
		String pwd;
		if(UserManager.isAnyUser(nm)) {
			// @TODO: authentication
			pwd = UserManager.getPassword(nm);
			if(pwd == null) {
				Clients.showNotification("Password belum terpasang, hubungi OC SISMIOP.");
				return false;
			} else if(pd.equals(pwd)) {
				Session sess = Sessions.getCurrent();
				UserCredential cre = new UserCredential(nm, UserManager.getNip(nm));
				sess.setAttribute("userCredential", cre);
				Clients.showNotification("Selamat datang, ${sessionScope.userCredential.nama}");
				return true;
			} else {
				return false;
			}
		}
		return false;
	}
	
	public void logout() {
		Session sess = Sessions.getCurrent();
		sess.removeAttribute("userCredential");
	}

}
