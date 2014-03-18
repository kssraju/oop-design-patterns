package com.mbd.creational.prototype;

/**
 * Клас, който обслужва JAVADOC
 * 
 * @author mdimitrova@acsior.com - 30.01.2014
 */
public interface Prototype extends Cloneable {
	/**
	 * @return Prototype
	 * @throws CloneNotSupportedException
	 */
	public Prototype clone() throws CloneNotSupportedException;

	/**
	 * JAVADOC
	 * 
	 * @return String
	 */
	public String getDescription();
}
