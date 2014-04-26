package lab.aikibo.manager;

import java.util.Iterator;

import org.hibernate.Query;
import org.hibernate.Session;

import lab.aikibo.util.BoneCPDSOracle;
import lab.aikibo.util.ConnectorUtil;

public class RefPropinsiManager {
	
	public static boolean isAnyPropinsi(String kdPropinsi) {
		ConnectorUtil cu = new ConnectorUtil();
		BoneCPDSOracle boneCP = new BoneCPDSOracle();
		Session session = cu.getOracleSF().openSession(boneCP.getBoneCPConn());
		
		String sql = "select kdPropinsi from RefPropinsi";
		try {
			Query query = session.createQuery(sql);
			Iterator iterator = query.iterate();
			if(iterator.hasNext()) {
				session.close();
				boneCP.shutdownBoneCP();
				return true;
			} else {
				session.close();
				boneCP.shutdownBoneCP();
				return false;
			}
		} catch(Exception e) {
			session.close();
			boneCP.shutdownBoneCP();
			return false;
		}
	}

}
