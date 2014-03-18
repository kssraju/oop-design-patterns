package com.mbd.behavioral.chainofresponsibility;

/**
 * Клас, който обслужва JAVADOC
 * 
 * @author mdimitrova@acsior.com - 30.01.2014
 */
public abstract class BaseHandler {

	private BaseHandler nextHandler;

	/**
	 * @return the nextHandler
	 */
	public BaseHandler getNextHandler() {
		return this.nextHandler;
	}

	/**
	 * JAVADOC
	 * 
	 * @param number
	 */
	public abstract void handleRequest(int number);

	/**
	 * @param nextHandler
	 *            the nextHandler to set
	 */
	public void setNextHandler(BaseHandler nextHandler) {
		this.nextHandler = nextHandler;
	}
}
