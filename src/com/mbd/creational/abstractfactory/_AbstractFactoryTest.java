package com.mbd.creational.abstractfactory;


/**
 * Клас, който обслужва JAVADOC
 * 
 * @author mdimitrova@acsior.com - 30.01.2014
 */
public class _AbstractFactoryTest {

	/**
	 * JAVADOC
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		AbstractFactory jsfComponents = FactoryMaker.getFactory("jsf");
		Button b1 = jsfComponents.createButton();
		b1.doAction();

		AbstractFactory guiComponents = FactoryMaker.getFactory("gui");
		Button b2 = guiComponents.createButton();
		b2.doAction();

	}
}
