package lab.aikibo.viewmodel;

import java.awt.Desktop;
import java.awt.Frame;
import java.io.Serializable;

import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.GlobalCommand;
import org.zkoss.zul.Include;
import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.Path;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.Selectors;
import org.zkoss.zk.ui.util.Clients;

public class MenuModel extends SelectorComposer<Component> implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Command
	public void ubah() {
		Clients.showNotification("Tombol ubah telah diklik, silahkan melanjutkan");
		Include include = (Include) Selectors.iterable(getPage(), "#mainInclude").iterator().next();
		include.setSrc("/login.zul");
		Clients.showNotification("login.zul sudah dipanggil");
				
	}

}
