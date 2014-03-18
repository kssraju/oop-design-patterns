package com.mbd.creational.factory;

/**
 * Клас, който обслужва JAVADOC
 * 
 * @author mdimitrova@acsior.com - 29.01.2014
 */
public abstract class Animal {

	/**
	 * @return Animal
	 */
	public abstract Animal createAnimal();

	/**
	 * @return int
	 */
	public abstract int getLegsCount();

	/**
	 * @return String
	 */
	public abstract String getType();

}
