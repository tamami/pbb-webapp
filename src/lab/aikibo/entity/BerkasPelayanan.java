package lab.aikibo.entity;

import java.math.BigDecimal;

public class BerkasPelayanan {
	
	private String nopel;
	private String nop;
	private String thnPajak;
	private String jnsPelayanan;
	private String namaWpLama;
	private String alamatWpLama;
	private BigDecimal pbbLama;
	private String namaWpBaru;
	private String alamatWpBaru;
	private BigDecimal pbbBaru;
	
	public String getNopel() {
		return nopel;
	}
	
	public void setNopel(String nopel) {
		this.nopel = nopel;
	}

	public String getNop() {
		return nop;
	}

	public void setNop(String nop) {
		this.nop = nop;
	}

	public String getThnPajak() {
		return thnPajak;
	}

	public void setThnPajak(String thnPajak) {
		this.thnPajak = thnPajak;
	}

	public String getJnsPelayanan() {
		return jnsPelayanan;
	}

	public void setJnsPelayanan(String jnsPelayanan) {
		this.jnsPelayanan = jnsPelayanan;
	}

	public String getNamaWpLama() {
		return namaWpLama;
	}

	public void setNamaWpLama(String namaWpLama) {
		this.namaWpLama = namaWpLama;
	}

	public String getAlamatWpLama() {
		return alamatWpLama;
	}

	public void setAlamatWpLama(String alamatWpLama) {
		this.alamatWpLama = alamatWpLama;
	}

	public BigDecimal getPbbLama() {
		return pbbLama;
	}

	public void setPbbLama(BigDecimal pbbLama) {
		this.pbbLama = pbbLama;
	}

	public String getNamaWpBaru() {
		return namaWpBaru;
	}

	public void setNamaWpBaru(String namaWpBaru) {
		this.namaWpBaru = namaWpBaru;
	}

	public String getAlamatWpBaru() {
		return alamatWpBaru;
	}

	public void setAlamatWpBaru(String alamatWpBaru) {
		this.alamatWpBaru = alamatWpBaru;
	}

	public BigDecimal getPbbBaru() {
		return pbbBaru;
	}

	public void setPbbBaru(BigDecimal pbbBaru) {
		this.pbbBaru = pbbBaru;
	}

}
