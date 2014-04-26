package lab.aikibo.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="SPPT")
public class Sppt {
	
	private String kdPropinsi;				// 1
	private String kdDati2;					// 2
	private String kdKecamatan;				// 3
	private String kdKelurahan;				// 4
	private String kdBlok;					// 5
	private String noUrut;					// 6
	private String kdJnsOp;					// 7
	private String thnPajakSppt;			// 8
	private int siklusSppt;					// 9 	---
	private String kdKanwilBank;			// 10	---
	private String kdKppbbBank;				// 11	---
	private String kdBankTunggal;			// 12	---
	private String kdBankPersepsi;			// 13	---
	private String kdTp;					// 14	---
	private String nmWpSppt;				// 15
	private String jlnWpSppt;				// 16
	private String blokKavNoWpSppt;			// 17 	---
	private String rwWpSppt;				// 18	---
	private String rtWpSppt;				// 19	---
	private String kelurahanWpSppt;			// 20 	---
	private String kotaWpSppt;				// 21	---
	private String kdPosWpSppt;				// 22	---
	private String npwpSppt;				// 23	---
	private String noPersilSppt;			// 24 	---
	private String kdKlsTnh;				// 25	---
	private String thnAwalKlsTnh;			// 26 	---
	private String kdKlsBng;				// 27	---
	private String thnAwalKlsBng;			// 28	---
	private Date tglJatuhTempoSPpt;			// 29	---
	private long luasBumiSppt;				// 30
	private long luasBngSppt;				// 31
	private long njopBumiSppt;				// 32
	private long njopBngSppt;				// 33
	private long njopSppt;					// 34
	private long njoptkpSppt;				// 35	---
	private long njkpSppt;					// 36 	---
	private long pbbTerhutangSppt;			// 37	---
	private long faktorPengurangSppt;		// 38	---			
	private long pbbYgHarusDibayarSppt;		// 39
	private char statusPembayaranSppt;		// 40
	private char statusTagihanSppt;			// 41	---
	private char statusCetakSppt;			// 42	---
	private Date tglTerbitSppt;				// 43	---
	private Date tglCetakSppt;				// 44	---
	private String nipPencetakSppt;			// 45	---
	
	public Sppt() {}
	
	public Sppt(String kdPropinsi, String kdDati2, String kdKecamatan, String kdKelurahan, 
			String kdBlok, String noUrut, String kdJnsOp, String thnPajakSppt, String nmWpSppt, 
			String jlnWpSppt, long luasBumiSppt, long luasBngSppt, long njopBumiSppt, long njopBngSppt,
			long njopSppt, long pbbYgHarusDibayarSppt, char statusPembayaranSppt) {
		this.kdPropinsi = kdPropinsi;
		this.kdDati2 = kdDati2;
		this.kdKecamatan = kdKecamatan;
		this.kdKelurahan = kdKelurahan;
		this.kdBlok = kdBlok;
		this.noUrut = noUrut;
		this.kdJnsOp = kdJnsOp;
		this.thnPajakSppt = thnPajakSppt;
		this.nmWpSppt = nmWpSppt;
		this.jlnWpSppt = jlnWpSppt;
		this.luasBumiSppt = luasBumiSppt;
		this.luasBngSppt = luasBngSppt;
		this.njopBumiSppt = njopBumiSppt;
		this.njopBngSppt = njopBngSppt;
		this.njopSppt = njopSppt;
		this.pbbYgHarusDibayarSppt = pbbYgHarusDibayarSppt;
		this.statusPembayaranSppt = statusPembayaranSppt;
	}
	
	@Id
	@Column(name="KD_PROPINSI", nullable=false)
	public String getKdPropinsi() {
		return kdPropinsi;
	}
	
	public void setKdPropinsi(String kdPropinsi) {
		this.kdPropinsi = kdPropinsi;
	}

	@Id
	@Column(name="KD_DAT2", nullable=false)
	public String getKdDati2() {
		return kdDati2;
	}

	public void setKdDati2(String kdDati2) {
		this.kdDati2 = kdDati2;
	}

	@Id
	@Column(name="KD_KECAMATAN", nullable=false)
	public String getKdKecamatan() {
		return kdKecamatan;
	}

	public void setKdKecamatan(String kdKecamatan) {
		this.kdKecamatan = kdKecamatan;
	}

	@Id
	@Column(name="KD_KELURAHAN", nullable=false)
	public String getKdKelurahan() {
		return kdKelurahan;
	}

	public void setKdKelurahan(String kdKelurahan) {
		this.kdKelurahan = kdKelurahan;
	}

	@Id
	@Column(name="KD_BLOK", nullable=false)
	public String getKdBlok() {
		return kdBlok;
	}

	public void setKdBlok(String kdBlok) {
		this.kdBlok = kdBlok;
	}

	@Id
	@Column(name="NO_URUT", nullable=false)
	public String getNoUrut() {
		return noUrut;
	}

	public void setNoUrut(String noUrut) {
		this.noUrut = noUrut;
	}

	@Id
	@Column(name="KD_JNS_OP", nullable=false)
	public String getKdJnsOp() {
		return kdJnsOp;
	}

	public void setKdJnsOp(String kdJnsOp) {
		this.kdJnsOp = kdJnsOp;
	}

	@Id
	@Column(name="THN_PAJAK_SPPT", nullable=false)
	public String getThnPajakSppt() {
		return thnPajakSppt;
	}

	public void setThnPajakSppt(String thnPajakSppt) {
		this.thnPajakSppt = thnPajakSppt;
	}

	@Column(name="NM_WP_SPPT", nullable=false)
	public String getNmWpSppt() {
		return nmWpSppt;
	}

	public void setNmWpSppt(String nmWpSppt) {
		this.nmWpSppt = nmWpSppt;
	}

	@Column(name="JLN_WP_SPPT", nullable=false)
	public String getJlnWpSppt() {
		return jlnWpSppt;
	}

	public void setJlnWpSppt(String jlnWpSppt) {
		this.jlnWpSppt = jlnWpSppt;
	}

	@Column(name="LUAS_BUMI_SPPT", nullable=false)
	public long getLuasBumiSppt() {
		return luasBumiSppt;
	}

	public void setLuasBumiSppt(long luasBumiSppt) {
		this.luasBumiSppt = luasBumiSppt;
	}

	@Column(name="LUAS_BNG_SPPT", nullable=false)
	public long getLuasBngSppt() {
		return luasBngSppt;
	}

	public void setLuasBngSppt(long luasBngSppt) {
		this.luasBngSppt = luasBngSppt;
	}

	@Column(name="NJOP_BUMI_SPPT", nullable=false)
	public long getNjopBumiSppt() {
		return njopBumiSppt;
	}

	public void setNjopBumiSppt(long njopBumiSppt) {
		this.njopBumiSppt = njopBumiSppt;
	}

	@Column(name="NJOP_BNG_SPPT", nullable=false)
	public long getNjopBngSppt() {
		return njopBngSppt;
	}

	public void setNjopBngSppt(long njopBngSppt) {
		this.njopBngSppt = njopBngSppt;
	}

	@Column(name="NJOP_SPPT", nullable=false)
	public long getNjopSppt() {
		return njopSppt;
	}

	public void setNjopSppt(long njopSppt) {
		this.njopSppt = njopSppt;
	}

	@Column(name="PBB_YG_HARUS_DIBAYAR_SPPT", nullable=false)
	public long getPbbYgHarusDibayarSppt() {
		return pbbYgHarusDibayarSppt;
	}

	public void setPbbYgHarusDibayarSppt(long pbbYgHarusDibayarSppt) {
		this.pbbYgHarusDibayarSppt = pbbYgHarusDibayarSppt;
	}

	@Column(name="STATUS_PEMBAYARAN_SPPT", nullable=false)
	public char getStatusPembayaranSppt() {
		return statusPembayaranSppt;
	}

	public void setStatusPembayaranSppt(char statusPembayaranSppt) {
		this.statusPembayaranSppt = statusPembayaranSppt;
	}

	@Column(name="SIKLUS_SPPT", nullable=false)
	public int getSiklusSppt() {
		return siklusSppt;
	}

	public void setSiklusSppt(int siklusSppt) {
		this.siklusSppt = siklusSppt;
	}

	@Column(name="KD_KANWIL_BANK", nullable=false)
	public String getKdKanwilBank() {
		return kdKanwilBank;
	}

	public void setKdKanwilBank(String kdKanwilBank) {
		this.kdKanwilBank = kdKanwilBank;
	}

	@Column(name="KD_KPPBB_BANK", nullable=false)
	public String getKdKppbbBank() {
		return kdKppbbBank;
	}

	public void setKdKppbbBank(String kdKppbbBank) {
		this.kdKppbbBank = kdKppbbBank;
	}

	@Column(name="KD_BANK_TUNGGAL", nullable=false)
	public String getKdBankTunggal() {
		return kdBankTunggal;
	}

	public void setKdBankTunggal(String kdBankTunggal) {
		this.kdBankTunggal = kdBankTunggal;
	}

	@Column(name="KD_BANK_PERSEPSI", nullable=false)
	public String getKdBankPersepsi() {
		return kdBankPersepsi;
	}

	public void setKdBankPersepsi(String kdBankPersepsi) {
		this.kdBankPersepsi = kdBankPersepsi;
	}

	@Column(name="KD_TP", nullable=false)
	public String getKdTp() {
		return kdTp;
	}

	public void setKdTp(String kdTp) {
		this.kdTp = kdTp;
	}

	@Column(name="BLOK_KAV_NO_WP_SPPT")
	public String getBlokKavNoWpSppt() {
		return blokKavNoWpSppt;
	}

	public void setBlokKavNoWpSppt(String blokKavNoWpSppt) {
		this.blokKavNoWpSppt = blokKavNoWpSppt;
	}

	@Column(name="RW_WP_SPPT")
	public String getRwWpSppt() {
		return rwWpSppt;
	}

	public void setRwWpSppt(String rwWpSppt) {
		this.rwWpSppt = rwWpSppt;
	}

	@Column(name="RT_WP_SPPT")
	public String getRtWpSppt() {
		return rtWpSppt;
	}

	public void setRtWpSppt(String rtWpSppt) {
		this.rtWpSppt = rtWpSppt;
	}

	@Column(name="KELURAHAN_WP_SPPT")
	public String getKelurahanWpSppt() {
		return kelurahanWpSppt;
	}

	public void setKelurahanWpSppt(String kelurahanWpSppt) {
		this.kelurahanWpSppt = kelurahanWpSppt;
	}

	@Column(name="KOTA_WP_SPPT")
	public String getKotaWpSppt() {
		return kotaWpSppt;
	}

	public void setKotaWpSppt(String kotaWpSppt) {
		this.kotaWpSppt = kotaWpSppt;
	}

	@Column(name="KD_POS_WP_SPPT")
	public String getKdPosWpSppt() {
		return kdPosWpSppt;
	}

	public void setKdPosWpSppt(String kdPosWpSppt) {
		this.kdPosWpSppt = kdPosWpSppt;
	}

	@Column(name="NPWP_SPPT")
	public String getNpwpSppt() {
		return npwpSppt;
	}

	public void setNpwpSppt(String npwpSppt) {
		this.npwpSppt = npwpSppt;
	}

	@Column(name="NO_PERSIL_SPPT")
	public String getNoPersilSppt() {
		return noPersilSppt;
	}

	public void setNoPersilSppt(String noPersilSppt) {
		this.noPersilSppt = noPersilSppt;
	}

	@Column(name="KD_KLS_TANAH", nullable=false)
	public String getKdKlsTnh() {
		return kdKlsTnh;
	}

	public void setKdKlsTnh(String kdKlsTnh) {
		this.kdKlsTnh = kdKlsTnh;
	}

	@Column(name="THN_AWAL_KLS_TANAH", nullable=false)
	public String getThnAwalKlsTnh() {
		return thnAwalKlsTnh;
	}

	public void setThnAwalKlsTnh(String thnAwalKlsTnh) {
		this.thnAwalKlsTnh = thnAwalKlsTnh;
	}

	@Column(name="KD_KLS_BNG", nullable=false)
	public String getKdKlsBng() {
		return kdKlsBng;
	}

	public void setKdKlsBng(String kdKlsBng) {
		this.kdKlsBng = kdKlsBng;
	}

	@Column(name="THN_AWAL_KLS_BNG", nullable=false)
	public String getThnAwalKlsBng() {
		return thnAwalKlsBng;
	}

	public void setThnAwalKlsBng(String thnAwalKlsBng) {
		this.thnAwalKlsBng = thnAwalKlsBng;
	}

	@Column(name="TGL_JATUH_TEMPO_SPPT", nullable=false)
	public Date getTglJatuhTempoSPpt() {
		return tglJatuhTempoSPpt;
	}

	public void setTglJatuhTempoSPpt(Date tglJatuhTempoSPpt) {
		this.tglJatuhTempoSPpt = tglJatuhTempoSPpt;
	}

	@Column(name="NJOPTKP_SPPT", nullable=false)
	public long getNjoptkpSppt() {
		return njoptkpSppt;
	}

	public void setNjoptkpSppt(long njoptkpSppt) {
		this.njoptkpSppt = njoptkpSppt;
	}

	@Column(name="NJKP_SPPT")
	public long getNjkpSppt() {
		return njkpSppt;
	}

	public void setNjkpSppt(long njkpSppt) {
		this.njkpSppt = njkpSppt;
	}

	@Column(name="PBB_TERHUTANG_SPPT", nullable=false)
	public long getPbbTerhutangSppt() {
		return pbbTerhutangSppt;
	}

	public void setPbbTerhutangSppt(long pbbTerhutangSppt) {
		this.pbbTerhutangSppt = pbbTerhutangSppt;
	}

	@Column(name="FATKTOR_PENGURANG_SPPT")
	public long getFaktorPengurangSppt() {
		return faktorPengurangSppt;
	}

	public void setFaktorPengurangSppt(long faktorPengurangSppt) {
		this.faktorPengurangSppt = faktorPengurangSppt;
	}

	@Column(name="STATUS_TAGIHAN_SPPT", nullable=false)
	public char getStatusTagihanSppt() {
		return statusTagihanSppt;
	}
	
	public void setStatusTagihanSppt(char statusTagihanSppt) {
		this.statusTagihanSppt = statusTagihanSppt;
	}

	@Column(name="STATUS_CETAK_SPPT", nullable=false)
	public char getStatusCetakSppt() {
		return statusCetakSppt;
	}

	public void setStatusCetakSppt(char statusCetakSppt) {
		this.statusCetakSppt = statusCetakSppt;
	}

	@Column(name="TGL_TERBIT_SPPT", nullable=false)
	public Date getTglTerbitSppt() {
		return tglTerbitSppt;
	}

	public void setTglTerbitSppt(Date tglTerbitSppt) {
		this.tglTerbitSppt = tglTerbitSppt;
	}

	@Column(name="TGL_CETAK_SPPT", nullable=false)
	public Date getTglCetakSppt() {
		return tglCetakSppt;
	}

	public void setTglCetakSppt(Date tglCetakSppt) {
		this.tglCetakSppt = tglCetakSppt;
	}

	@Column(name="NIP_PENCETAK_SPPT", nullable=false)
	public String getNipPencetakSppt() {
		return nipPencetakSppt;
	}

	public void setNipPencetakSppt(String nipPencetakSppt) {
		this.nipPencetakSppt = nipPencetakSppt;
	}
	

}
