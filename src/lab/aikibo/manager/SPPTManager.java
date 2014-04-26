package lab.aikibo.manager;

import java.math.BigDecimal;
import java.sql.Array;
import java.text.NumberFormat;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

import lab.aikibo.entity.Sppt;
import lab.aikibo.util.BoneCPDSOracle;
import lab.aikibo.util.ConnectorUtil;
import lab.aikibo.util.NopParser;

public class SPPTManager {
	
	private Sppt sppt;
	
	public boolean isAnyNop(String nop, String tahun) {
		ConnectorUtil cu = new ConnectorUtil();
		BoneCPDSOracle boneCp = new BoneCPDSOracle();
		Session session = cu.getOracleSF().openSession(boneCp.getBoneCPConn());
		
		//-- CONTOH PAKE NAMED PARAMETER
		// error, entah kenapa hanya dapat binding ke property kdBlok saja.. yang lain ga ngait
		/*
		String sql = "from Sppt where " +
				"kdPropinsi = ? and " +
				"kdDati2 = ? and " + 
				"kdKecamatan = :kdKecamatan and " + 
				"kdKelurahan = :kdKelurahan and " + 
				"kdBlok = :kdBlok and " + 
				"noUrut = :noUrut and " +
				"kdJnsOp = :kdJnsOp and " +
				"thnPajakSppt = :thnPajakSppt";
		
		try {
			Query query = session.createQuery(sql);
			query.setParameter(0, NopParser.getPropinsiCode(nop));
			query.setParameter(1, NopParser.getDati2Code(nop));
			query.setParameter("kdKecamatan", NopParser.getKecamatanCode(nop));
			query.setParameter("kdKelurahan", NopParser.getKelurahanCode(nop));
			query.setParameter("kdBlok", NopParser.getBlokCode(nop));
			query.setParameter("noUrut", NopParser.getNoUrutCode(nop));
			query.setParameter("kdJnsOp", NopParser.getKdJnsOpCode(nop));
			query.setParameter("thnPajakSppt", tahun);
			
			Iterator iterator = query.iterate();
			if(iterator.hasNext()) {
				session.close();
				boneCp.shutdownBoneCP();
				return true;
			} else {
				session.close();
				boneCp.shutdownBoneCP();
				return false;
			}
		} catch(Exception e) {
			session.close();
			boneCp.shutdownBoneCP();
			return false;
		}*/
			
		//-- BLOK CONTOH POJO RUNTIME FILTER
		// error saat mapping ke SPPT class, nda kenal gimana cara binding ke property kdPropinsi
		/*
		try {
			Criteria crt = session.createCriteria(Sppt.class);
			Criterion kdProp = Restrictions.eq("kdPropinsi", NopParser.getPropinsiCode(nop));
			Criterion kdDati = Restrictions.eq("kdDati2", NopParser.getDati2Code(nop));
			Criterion kdKec = Restrictions.eq("kdKecamatan", NopParser.getKecamatanCode(nop));
			Criterion kdKel = Restrictions.eq("kdKelurahan", NopParser.getKelurahanCode(nop));
			Criterion kdBlok = Restrictions.eq("kdBlok", NopParser.getBlokCode(nop));
			Criterion noUrut = Restrictions.eq("noUrut", NopParser.getNoUrutCode(nop));
			Criterion kdJnsOp = Restrictions.eq("kdJnsOp", NopParser.getKdJnsOpCode(nop));
			Criterion thnPjk = Restrictions.eq("thnPajakSppt", tahun);
			crt.add(kdProp);
			crt.add(kdDati);
			crt.add(kdKec);
			crt.add(kdKel);
			crt.add(kdBlok);
			crt.add(noUrut);
			crt.add(kdJnsOp);
			crt.add(thnPjk);
			List list = crt.list();
			if(list.size() > 0) {
				session.close();
				boneCp.shutdownBoneCP();
				return true;
			} else {
				session.close();
				boneCp.shutdownBoneCP();
				return false;
			}
		} catch(Exception e) {
			session.close();
			boneCp.shutdownBoneCP();
			return false;
		}*/
			
			
		
		//-- BLOK CONTOH MURNI QUERY - SQL
		
		String query = "select nm_wp_sppt, jln_wp_sppt, blok_kav_no_wp_sppt, rw_wp_sppt, " +
				"rt_wp_sppt, kelurahan_wp_sppt, kota_wp_sppt, luas_bumi_sppt, luas_bng_sppt, " +
				"njop_bumi_sppt, njop_bng_sppt, status_pembayaran_sppt from SPPT " +
				"where kd_propinsi = :kdProp " +
				"and kd_dati2 = :kdDati " + 
				"and kd_kecamatan = :kdKec " +
				"and kd_kelurahan = :kdKel " +
				"and kd_blok = :kdBlok " +
				"and no_urut = :noUrut " +
				"and kd_jns_op = :kdJnsOp " +
				"and thn_pajak_sppt = :thnPajakSppt";
		
		try {
			Query qry = session.createSQLQuery(query);
			qry.setParameter("kdProp", NopParser.getPropinsiCode(nop));
			qry.setParameter("kdDati", NopParser.getDati2Code(nop));
			qry.setParameter("kdKec", NopParser.getKecamatanCode(nop));
			qry.setParameter("kdKel", NopParser.getKelurahanCode(nop));
			qry.setParameter("kdBlok", NopParser.getBlokCode(nop));
			qry.setParameter("noUrut", NopParser.getNoUrutCode(nop));
			qry.setParameter("kdJnsOp", NopParser.getKdJnsOpCode(nop));
			qry.setParameter("thnPajakSppt", tahun);
			
			
			List list = qry.list();
			if(list.size() != 0) {
				Object[] larik = (Object[]) list.get(0);
				sppt = new Sppt();
				for(int i=0; i<larik.length; i++) {
					sppt.setNmWpSppt((String) larik[0]);			// nm_wp_sppt
					sppt.setJlnWpSppt((String) larik[1]);			// jln_wp_sppt
					sppt.setBlokKavNoWpSppt((String)larik[2]);		// blok_kav_no_wp_sppt
					sppt.setRwWpSppt(larik[3].toString());			// rw_wp_sppt
					sppt.setRtWpSppt(larik[4].toString());			// rt_wp_sppt
					sppt.setKelurahanWpSppt((String)larik[5]);	// kelurahan_wp_sppt
					sppt.setKotaWpSppt((String)larik[6]);		// kota_wp_sppt
					sppt.setLuasBumiSppt(((BigDecimal)larik[7]).longValue());		// luas_bumi_sppt
					sppt.setLuasBngSppt(((BigDecimal)larik[8]).longValue());			// luas_bng_sppt
					sppt.setNjopBumiSppt(((BigDecimal)larik[9]).longValue());		// njop_bumi_sppt
					sppt.setNjopBngSppt(((BigDecimal)larik[10]).longValue());		// njop_bng_sppt
					sppt.setStatusPembayaranSppt((char)larik[11]);	// status_pembayaran_sppt
				}
				session.close();
				boneCp.shutdownBoneCP();
				return true;
			}
			session.close();
			boneCp.shutdownBoneCP();
			return false;
		} catch(Exception e) {
			session.close();
			boneCp.shutdownBoneCP();
			System.out.println(e.getMessage());
			System.out.println(e.toString());
			e.printStackTrace();
			return false;
		}
	}
	
	public String getNamaWpSppt() {
		return sppt.getNmWpSppt();
	}
	
	public String getAlamatWpSppt() {
		String alamat = (sppt.getJlnWpSppt() != null ? sppt.getJlnWpSppt() : "") + " " +
				(sppt.getBlokKavNoWpSppt() != null ? sppt.getBlokKavNoWpSppt() : "") + " " +
				"RW." + sppt.getRwWpSppt() + "/RT." + sppt.getRtWpSppt() + " " +
				"DESA/KELURAHAN " + sppt.getKelurahanWpSppt() + " - " + sppt.getKotaWpSppt();
		return alamat;
	}
	
	public String getLuasBumiSpptFormatted() {
		NumberFormat nf = NumberFormat.getInstance(new Locale("in", "ID"));
		return nf.format(sppt.getLuasBumiSppt());
	}
	
	public String getLuasBngSpptFormatted() {
		NumberFormat nf = NumberFormat.getInstance(new Locale("in", "ID"));
		return nf.format(sppt.getLuasBngSppt());
	}
	
	public String getNjopBumiPerMeterFormatted() {
		String result;
		NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("in", "ID"));
		if(sppt.getLuasBumiSppt() <= 0) {
			result = nf.format(0);
		} else {
			result = nf.format(sppt.getNjopBumiSppt() / sppt.getLuasBumiSppt());
		}
		return result;
	}
	
	public String getNjopBngPerMeter() {
		String result;
		NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("in", "ID"));
		if(sppt.getLuasBngSppt() <= 0) {
			result = nf.format(0);
		} else {
			result = nf.format(sppt.getNjopBngSppt() / sppt.getLuasBngSppt());
		}
		return result;
	}
	
	public String getStatusPembayaran() {
		if(sppt.getStatusPembayaranSppt() == '1') {
			return "LUNAS";
		} else {
			return "BELUM LUNAS";
		}
	}

}
