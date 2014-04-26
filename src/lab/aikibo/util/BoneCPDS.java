package lab.aikibo.util;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.jolbox.bonecp.BoneCP;
import com.jolbox.bonecp.BoneCPConfig;

public class BoneCPDS {
	private BoneCP connectionPool;
	private Connection connection;
	
	public Connection getBoneCPConn() {
		connectionPool = null;
		connection = null;
 
		try {
			// load the database driver (make sure this is in your classpath!)
			Class.forName("org.postgresql.Driver");
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
		try {
			// setup the connection pool
			BoneCPConfig config = new BoneCPConfig();
			config.setJdbcUrl("jdbc:postgresql://localhost/bphtb"); // jdbc url specific to your database, eg jdbc:mysql://127.0.0.1/yourdb
			config.setUsername("bphtb"); 
			config.setPassword("admindbabphtb");
			config.setMinConnectionsPerPartition(5);
			config.setMaxConnectionsPerPartition(10);
			config.setPartitionCount(1);
			connectionPool = new BoneCP(config); // setup the connection pool
			
			connection = connectionPool.getConnection(); // fetch a connection
			//connectionPool.shutdown(); // shutdown connection pool.
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}
	
	public void shutdownBoneCP() {
		connectionPool.shutdown();
	}

}
