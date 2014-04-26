package lab.aikibo.util;

/**
 * Parsing NOP that we wanted, in SISMIOP format, or BPD format, or we just
 * want to get part of Propinsi code, or Blok code
 * 
 * @author tamami
 *
 */
public class NopParser {
	
	// 2 char Propinsi code
	private static String kdPropinsi;
	// 2 char Dati2 code
	private static String kdDati2;
	// 3 char Kecamatan code
	private static String kdKecamatan;
	// 3 char Kelurahan code
	private static String kdKelurahan;
	// 3 char Blok code
	private static String kdBlok;
	// 4 char Nomor Urut code
	private static String noUrut;
	// 1 char Jenis OP code
	private static String kdJnsOp;
	// there are 18th char of NOP code
	private static final int NOP_SIZE = 18;
	
	/**
	 * Get SISMIOP/SPPT formatted NOP from line of numerical without punctuation
	 * 
	 * @param nop
	 * @return SISMIOP formatted NOP
	 * @throws Exception length of NOP is not in rule
	 */
	public static String getSismiopFormattedNop(String nop) throws Exception {
		if(nop.length() != NOP_SIZE) {
			throw new Exception("Panjang NOP tidak sesuai dengan aturan");
		}
		kdPropinsi = nop.substring(0,2);
		kdDati2 = nop.substring(2,4);
		kdKecamatan = nop.substring(4,7);
		kdKelurahan = nop.substring(7,10);
		kdBlok = nop.substring(10,13);
		noUrut = nop.substring(13,17);
		kdJnsOp = nop.substring(17,18);
		return kdPropinsi + "." + kdDati2 + "." + kdKecamatan + "." + kdKelurahan + "." +
				kdBlok + "-" + noUrut + "." + kdJnsOp;
	}
	
	/**
	 * Get Propinsi code from line of numerical without punctuation
	 * @param nop
	 * @return
	 * @throws Exception
	 */
	public static String getPropinsiCode(String nop) throws Exception {
		if(nop.length() != NOP_SIZE) {
			throw new Exception("Panjang NOP tidak sesuai dengan aturan");
		}
		return nop.substring(0,2);
	}
	
	/**
	 * Get Dati2 code from line of numerical code without punctuation
	 * @param nop
	 * @return
	 * @throws Exception
	 */
	public static String getDati2Code(String nop) throws Exception {
		if(nop.length() != NOP_SIZE) {
			throw new Exception("Panjang NOP tidak sesuai dengan aturan");
		}
		return nop.substring(2,4);
	}
	
	/**
	 * Get Kecamatan code from line of numerical code without punctuation
	 * @param nop
	 * @return
	 * @throws Exception
	 */
	public static String getKecamatanCode(String nop) throws Exception {
		if(nop.length() != NOP_SIZE) {
			throw new Exception("Panjang NOP tidak sesuai dengan aturan");
		}
		return nop.substring(4,7);
	}
	
	/**
	 * Get Kelurahan code from line of numerical code without punctuation
	 * @param nop
	 * @return
	 * @throws Exception
	 */
	public static String getKelurahanCode(String nop) throws Exception {
		if(nop.length() != NOP_SIZE) {
			throw new Exception("Panjang NOP tidak sesuai dengan aturan");
		}
		return nop.substring(7,10);
	}
	
	/**
	 * Get Blok code from line of numerical code without punctuation
	 * @param nop
	 * @return
	 * @throws Exception
	 */
	public static String getBlokCode(String nop) throws Exception {
		if(nop.length() != NOP_SIZE) {
			throw new Exception("Panjang NOP tidak sesuai dengan aturan");
		}
		return nop.substring(10,13);
	}
	
	/**
	 * Get No Urut Code from line of numerical code without punctuation
	 * @param nop
	 * @return
	 * @throws Exception
	 */
	public static String getNoUrutCode(String nop) throws Exception {
		if(nop.length() != NOP_SIZE) {
			throw new Exception("Panjang NOP tidak sesuai dengan aturan");
		}
		return nop.substring(13,17);
	}
	
	/**
	 * Get Kode Jenis OP code from line of numerical code without punctuation
	 * @param nop
	 * @return
	 * @throws Exception
	 */
	public static String getKdJnsOpCode(String nop) throws Exception {
		if(nop.length() != NOP_SIZE) {
			throw new Exception("Panjang NOP tidak sesuai dengan aturan");
		}
		return nop.substring(17,18);
	}

}
