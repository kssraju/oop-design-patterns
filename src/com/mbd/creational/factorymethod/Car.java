package com.mbd.creational.factorymethod;

/**
 * Клас, който обслужва JAVADOC
 * @author mdimitrova@acsior.com - 30.01.2014
 */
public class Car implements Vehicle {

	/**
	 * @see com.mbd.creational.factorymethod.Vehicle#drive()
	 */
	@Override
	public void drive() {
		System.out.println("Driving a car!");
	}

}
