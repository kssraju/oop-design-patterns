package com.mbd.creational.abstractfactory;


/**
 * Клас, който обслужва JAVADOC
 * 
 * @author mdimitrova@acsior.com - 30.01.2014
 */
public class FactoryMaker {
	private static AbstractFactory pf = null;

	/**
	 * Това може да се преработи по паттерн-а за Factory
	 * @param choice
	 * @return AbstractFactory
	 */
	static AbstractFactory getFactory(String choice) {
		if (choice.equals(JSFComponentFactory.TYPE)) {
			pf = new JSFComponentFactory();
		} else if (choice.equals(GUIComponentFactory.TYPE)) {
			pf = new GUIComponentFactory();
		}
		return pf;
	}
}
