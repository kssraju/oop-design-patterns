package com.mbd.creational.prototype;

/**
 * Клас, който обслужва JAVADOC
 * 
 * @author mdimitrova@acsior.com - 30.01.2014
 */
public class Movie implements Prototype {

	/**
	 * @see java.lang.Object#clone()
	 */
	@Override
	public Prototype clone() throws CloneNotSupportedException {
		System.out.println("Cloning " + getDescription());
		return (Prototype) super.clone();
	}

	/**
	 * @see com.mbd.creational.prototype.Prototype#getDescription()
	 */
	@Override
	public String getDescription() {
		return "movie";

	}

}
