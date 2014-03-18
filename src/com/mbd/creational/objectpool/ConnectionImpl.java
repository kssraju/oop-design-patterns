package com.mbd.creational.objectpool;

import java.util.Date;

/**
 * Клас, който обслужва JAVADOC
 * 
 * @author mdimitrova@acsior.com - 30.01.2014
 */
public class ConnectionImpl implements Connection {

	private boolean available;

	private long creationTime;

	/**
	 * Конструктор
	 */
	public ConnectionImpl() {
		super();
		setAvailable(true);
		this.creationTime = (new Date()).getTime();
	}

	/**
	 * @see com.mbd.creational.objectpool.Connection#isAvailable()
	 */
	@Override
	public boolean isAvailable() {
		return this.available;
	}

	/**
	 * @see com.mbd.creational.objectpool.Connection#release()
	 */
	@Override
	public void release() {
		setAvailable(true);
	}

	/**
	 * @see com.mbd.creational.objectpool.Connection#setAvailable(boolean)
	 */
	@Override
	public void setAvailable(boolean available) {
		this.available = available;
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return hashCode() + "_" + this.creationTime;
	}

}
