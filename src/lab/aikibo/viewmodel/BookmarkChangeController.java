package lab.aikibo.viewmodel;

import java.io.Serializable;

import org.zkoss.bind.annotation.GlobalCommand;
import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.Selectors;
import org.zkoss.zul.Include;
import org.zkoss.zk.ui.util.Clients;

public class BookmarkChangeController extends SelectorComposer<Component> 
		implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5723334755992848585L;

	@GlobalCommand
	public void updateView() {
		Clients.showNotification("Nama page-nya : " + getPage().getRequestPath());
		Include include = (Include) Selectors.iterable(getPage(), "#mainInclude").iterator().next();
		include.setSrc("/timeout.zul");
		Clients.showNotification("login.zul sudah dipanggil");
	}
	
	@GlobalCommand
	public void updateToInfoWpPbb() {
		Include include = (Include) Selectors.iterable(getPage(),  "#mainInclude").iterator().next();
		include.setSrc("/forms/InfoWpPbb.zul");
	}
	
}
