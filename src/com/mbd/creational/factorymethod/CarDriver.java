package com.mbd.creational.factorymethod;

/**
 * Клас, който обслужва JAVADOC
 * 
 * @author mdimitrova@acsior.com - 30.01.2014
 */
public class CarDriver extends VehicleDriver {

	/**
	 * @see com.mbd.creational.factorymethod.VehicleDriver#getVehicle()
	 */
	@Override
	public Vehicle getVehicle() {
		return new Car();
	}
}
