package com.mbd.creational.objectpool;

import java.util.ArrayList;
import java.util.List;

/**
 * Клас, който обслужва JAVADOC
 * 
 * @author mdimitrova@acsior.com - 30.01.2014
 */
public class _ObjectPoolTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Connection> cons = null;
		try {
			cons = connect();

		} catch (Exception e) {

			if (cons != null && cons.size() > 0) {
				cons.get(0).release();
			}
		}

	}

	private static List<Connection> connect() throws Exception {
		List<Connection> cons = new ArrayList<>();
		for (int idx = 0; idx < 10; idx++) {
			cons.add(ConnectionPool.getInstance().connect());
		}
		return cons;
	}

}
