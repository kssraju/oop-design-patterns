package com.mbd.creational.abstractfactory;


/**
 * Клас, който обслужва JAVADOC
 * 
 * @author mdimitrova@acsior.com - 30.01.2014
 */
public class JSFButton extends Button {

	/**
	 * @see com.mbd.creational.abstractfactory.Button#doAction()
	 */
	@Override
	public void doAction() {
		System.out.println("JSFButton clicked!");
	}
}
