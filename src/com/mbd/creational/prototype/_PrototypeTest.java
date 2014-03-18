package com.mbd.creational.prototype;

import com.mbd.creational.prototype.PrototypeFactory.ModelType;

/**
 * Клас, който обслужва JAVADOC
 * 
 * @author mdimitrova@acsior.com - 30.01.2014
 */
public class _PrototypeTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			PrototypeFactory.getInstance(ModelType.MOVIE);

			PrototypeFactory.getInstance(ModelType.ALBUM);

		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}
