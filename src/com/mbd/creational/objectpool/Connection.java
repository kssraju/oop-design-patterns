package com.mbd.creational.objectpool;

/**
 * Клас, който обслужва JAVADOC
 * @author mdimitrova@acsior.com - 30.01.2014
 */
public interface Connection {

	/**
	 * Освобождаване на обекта
	 */
	public void release();
	
	/**
	 * Проверка дали обекта е свободен
	 * @return boolean
	 */
	public boolean isAvailable();
	
	/**
	 * Проверка дали обекта е свободен
	 * @param available
	 */
	public void setAvailable(boolean available);
}
