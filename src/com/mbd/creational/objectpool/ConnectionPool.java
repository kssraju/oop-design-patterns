package com.mbd.creational.objectpool;

import java.util.ArrayList;
import java.util.List;

/**
 * Клас, който обслужва JAVADOC
 * 
 * @author mdimitrova@acsior.com - 30.01.2014
 */
public class ConnectionPool {

	private static ConnectionPool instance;

	private static int LIMIT = 3;

	private static List<Connection> pool = null;

	/**
	 * JAVADOC
	 * 
	 * @return Connection
	 * @throws Exception
	 */
	public Connection connect() throws Exception {

		// даваме свободните
		for (Connection c : pool) {
			if (c.isAvailable()) {
				c.setAvailable(false);
				return c;
			}
		}

		// ако няма свободни и не сме достигнали лимита - правим нова
		if (pool.size() < LIMIT) {
			Connection con = makeConnection(false);
			pool.add(con);
			return con;
		}

		throw new Exception(
				"Няма сбободни връзки. Достигнат е максималния лимит от "
						+ LIMIT);

	}

	/**
	 * @return the instance
	 */
	public static ConnectionPool getInstance() {
		if (instance == null) {
			instance = new ConnectionPool();
		}
		return instance;
	}

	private static Connection makeConnection(boolean isAvailable) {
		Connection c = new ConnectionImpl();
		c.setAvailable(isAvailable);
		return c;
	}

	/**
	 * Конструктор
	 */
	private ConnectionPool() {
		super();
		pool = new ArrayList<>();
	}

}
