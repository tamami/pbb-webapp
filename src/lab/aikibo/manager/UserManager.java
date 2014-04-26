package lab.aikibo.manager;

import java.util.Iterator;

import org.hibernate.Query;
import org.hibernate.Session;

import lab.aikibo.util.BoneCPDS;
import lab.aikibo.util.BoneCPDSOracle;
import lab.aikibo.util.ConnectorUtil;

public class UserManager {
	
	public static boolean isAnyUser(String username) {
		ConnectorUtil cu = new ConnectorUtil();
		BoneCPDSOracle bonecp = new BoneCPDSOracle();
		Session session = cu.getOracleSF().openSession(bonecp.getBoneCPConn());
		// - this must be load session from oracle
		//Session session = cu.getPostgreSF().openSession(bonecp.getBoneCPConn());
		// -
		
		// the format that used in this case is :
		// "select [attribute_class] from [name_of_class]"
		// note: be carefull to not to use the capital word in postgres as
		//       table name or field name
		String sql = "select namaLogin from User where namaLogin = :username";
		try {
			Query query = session.createQuery(sql);
			query.setString("username", username);
			Iterator iterator = query.iterate();
			while(iterator.hasNext()) {
				String user = (String)iterator.next();
				if(user.equalsIgnoreCase(username)) {
					session.close();
					bonecp.shutdownBoneCP();
					return true;
				} 
			}
			session.close();
			bonecp.shutdownBoneCP();
			return false;
		} catch(Exception e) {
			session.close();
			bonecp.shutdownBoneCP();
			return false;
		}
	}
	
	public static String getPassword(String username) {
		String password;
		if(isAnyUser(username)) {
			ConnectorUtil cu = new ConnectorUtil();
			BoneCPDSOracle bonecp = new BoneCPDSOracle();
			Session session = cu.getOracleSF().openSession(bonecp.getBoneCPConn());
			// - this must be load session from oracle
			//Session session = cu.getPostgreSF().openSession(bonecp.getBoneCPConn());
			// -
			String sql = "select password from User where namaLogin like :username";
			try {
				Query query = session.createQuery(sql);
				query.setString("username", username);
				Iterator iterator = query.iterate();
				password = (String)iterator.next();
				session.close();
				bonecp.shutdownBoneCP();
				return password;
			} catch(Exception e) {
				session.close();
				bonecp.shutdownBoneCP();
				return null;
			}
		} else {
			return null;
		}
	}
	
	public static String getNip(String username) {
		String nip;
		if(isAnyUser(username)) {
			ConnectorUtil cu = new ConnectorUtil();
			BoneCPDSOracle bonecp = new BoneCPDSOracle();
			Session session = cu.getOracleSF().openSession(bonecp.getBoneCPConn());
			// - this must be load session from oracle
			//Session session = cu.getPostgreSF().openSession(bonecp.getBoneCPConn());
			// -
			String sql = "select nip from User where namaLogin like :username";
			try {
				Query query = session.createQuery(sql);
				query.setString("username", username);
				Iterator iterator = query.iterate();
				nip = (String) iterator.next();
				session.close();
				bonecp.shutdownBoneCP();
				return nip; 
			} catch(Exception e) {
				session.close();
				bonecp.shutdownBoneCP();
				return null;
			}
		} else {
			return null;
		}
	}
}
