package lab.aikibo.viewmodel;

import java.io.Serializable;

import lab.aikibo.manager.SPPTManager;

import org.zkoss.bind.annotation.Command;
import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.Selectors;
import org.zkoss.zk.ui.util.Clients;
import org.zkoss.zul.Include;

public class InfoWpPbb extends SelectorComposer<Component> implements Serializable {
	
	// data for view
	private String nop;
	private String thn;
	private String namaWp;
	private String alamatWp;
	private String luasBumiFormatted;
	private String luasBngFormatted;
	private String njopBumiPerMeterFormatted;
	private String njopBngPerMeterFormatted;
	private String statusBayar;
	private String nopFormatted;
	
	public String getNop() {
		return nop;
	}
	
	public void setNop(String nop) {
		this.nop = nop;
	}
	
	public String getThn() {
		return thn;
	}
	
	public void setThn(String thn) {
		this.thn = thn;
	}
	
	public String getNamaWp() {
		return namaWp;
	}
	
	public void setNamaWp(String namaWp) {
		this.namaWp = namaWp;
	}
	
	public String getNopFormatted() {
		return nopFormatted;
	}
	
	public void setNopFormatted(String nop) {
		this.nopFormatted = nop;
	}
	
	public String getAlamatWp() {
		return alamatWp;
	}

	public void setAlamatWp(String alamatWp) {
		this.alamatWp = alamatWp;
	}

	public String getLuasBumiFormatted() {
		return luasBumiFormatted;
	}

	public void setLuasBumiFormatted(String luasBumi) {
		this.luasBumiFormatted = luasBumi;
	}

	public String getLuasBngFormatted() {
		return luasBngFormatted;
	}

	public void setLuasBngFormatted(String luasBng) {
		this.luasBngFormatted = luasBng;
	}

	public String getNjopBumiPerMeterFormatted() {
		return njopBumiPerMeterFormatted;
	}

	public void setNjopBumiPerMeterFormatted(String njopBumiPerMeter) {
		this.njopBumiPerMeterFormatted = njopBumiPerMeter;
	}

	public String getNjopBngPerMeterFormatted() {
		return njopBngPerMeterFormatted;
	}

	public void setNjopBngPerMeterFormatted(String njopBngPerMeter) {
		this.njopBngPerMeterFormatted = njopBngPerMeter;
	}

	public String getStatusBayar() {
		return statusBayar;
	}

	public void setStatusBayar(String statusBayar) {
		this.statusBayar = statusBayar;
	}

	@Command
	public void proses() {
		String t_nop = nop.trim();
		String t_thn = thn.trim();
		
		if(t_nop == "" || t_thn == "") {
			Clients.showNotification("Silahkan isikan dulu NOP dan Tahun Pajak yang akan diproses");
			return;
		} else {
			loadDataSppt();
		}
	}
	
	public void loadDataSppt() {
		SPPTManager spptMan = new SPPTManager();
		if(spptMan.isAnyNop(nop, thn)) {
			nopFormatted = nop.substring(0, 2) + "." + nop.substring(2,4) + "." +
					nop.substring(4,7) + "." + nop.substring(7,10) + "." + nop.substring(10,13) + "-" +
					nop.substring(13, 17) + "." + nop.substring(17,18);
			namaWp = spptMan.getNamaWpSppt();
			setAlamatWp(spptMan.getAlamatWpSppt());
			setLuasBumiFormatted(spptMan.getLuasBumiSpptFormatted());
			setLuasBngFormatted(spptMan.getLuasBngSpptFormatted());
			setNjopBumiPerMeterFormatted(spptMan.getNjopBumiPerMeterFormatted());
			setNjopBngPerMeterFormatted(spptMan.getNjopBngPerMeter());
			setStatusBayar(spptMan.getStatusPembayaran());
		} else {
			Clients.showNotification("Maaf, data tidak ditemukan dalam basis data.");
		}
	}

}
