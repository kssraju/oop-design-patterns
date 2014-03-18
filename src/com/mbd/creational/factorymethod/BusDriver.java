package com.mbd.creational.factorymethod;

/**
 * Клас, който обслужва JAVADOC
 * 
 * @author mdimitrova@acsior.com - 30.01.2014
 */
public class BusDriver extends VehicleDriver {

	/**
	 * @see com.mbd.creational.factorymethod.VehicleDriver#getVehicle()
	 */
	@Override
	public Vehicle getVehicle() {
		return new Bus();
	}
}
