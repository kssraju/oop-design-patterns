package com.mbd.creational.singleton;

/**
 * Singleton Pattern Example
 * 
 * @author mdimitrova@acsior.com - 29.01.2014
 */
public final class Singleton {

	/**
	 * Hidden inner class = holder of the instance
	 */
	private static class Holder {
		static Singleton singleInstance = null;
	}

	/**
	 * Method returns single instance of the class
	 * 
	 * @return Singleton
	 */
	public static Singleton getInstance() {
		if (Holder.singleInstance == null) {
			Holder.singleInstance = new Singleton();
		}
		return Holder.singleInstance;
	}

	private double random;

	/**
	 * Private constructor
	 */
	private Singleton() {
		super();
		this.random = Math.random();
	}

	/**
	 * @return the random
	 */
	public double getRandom() {
		return this.random;
	}

}
