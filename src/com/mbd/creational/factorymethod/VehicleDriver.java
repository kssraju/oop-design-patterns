package com.mbd.creational.factorymethod;

/**
 * Клас, който обслужва JAVADOC
 * 
 * @author mdimitrova@acsior.com - 30.01.2014
 */
public abstract class VehicleDriver {

	/**
	 * @return Vehicle
	 */
	public abstract Vehicle getVehicle();

	/**
	 * JAVADOC
	 */
	public void driveVehicle() {
		getVehicle().drive();
	}

}
