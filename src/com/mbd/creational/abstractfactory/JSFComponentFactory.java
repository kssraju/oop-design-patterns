package com.mbd.creational.abstractfactory;

/**
 * Клас, който обслужва JAVADOC
 * 
 * @author mdimitrova@acsior.com - 30.01.2014
 */
public class JSFComponentFactory extends AbstractFactory {

	/**
	 * TYPE
	 */
	public static String TYPE = "jsf";

	/**
	 * @see com.mbd.creational.abstractfactory.AbstractFactory#createButton()
	 */
	@Override
	public Button createButton() {
		return new JSFButton();
	}

}
