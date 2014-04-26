package lab.aikibo.viewmodel;

import java.io.Serializable;

import lab.aikibo.services.AuthenticationService;
import lab.aikibo.services.AuthenticationServiceImpl;

import org.zkoss.bind.annotation.Command;
import org.zkoss.zk.ui.Executions;

public class LogoutModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4670371001250339726L;
	
	// services
	AuthenticationService authService = new AuthenticationServiceImpl();
	
	@Command
	public void logout() {
		authService.logout();
		Executions.sendRedirect("/");
	}

}
