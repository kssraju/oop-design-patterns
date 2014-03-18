package com.mbd.creational.singleton;

/**
 * Клас, който обслужва JAVADOC
 * 
 * @author mdimitrova@acsior.com - 29.01.2014
 */
public class _SingletonTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Singleton singletonClass1 = Singleton.getInstance();
		System.out.println(singletonClass1.getRandom());

		Singleton singletonClass2 = Singleton.getInstance();
		System.out.println(singletonClass2.getRandom());

	}
}
