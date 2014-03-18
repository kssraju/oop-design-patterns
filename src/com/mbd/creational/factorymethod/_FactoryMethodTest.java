package com.mbd.creational.factorymethod;

/**
 * Клас, който обслужва JAVADOC
 * 
 * @author mdimitrova@acsior.com - 30.01.2014
 */
public class _FactoryMethodTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		handleVehicle(new CarDriver());
		handleVehicle(new BusDriver());
	}

	/**
	 * @param vDriver
	 */
	static void handleVehicle(VehicleDriver vDriver) {
		vDriver.driveVehicle();
	}
}
