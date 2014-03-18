package com.mbd.behavioral.chainofresponsibility;

/**
 * Клас, който обслужва JAVADOC
 * @author mdimitrova@acsior.com - 30.01.2014
 */
public class _ChainTest {

	/**
	 * JAVADOC
	 * @param args
	 */
	public static void main(String[] args) {
		BaseHandler handler = new NegativeHandler();
		handler.setNextHandler(new PositiveHandler());
				
		handler.handleRequest(0);		
		handler.handleRequest(-1);	
		handler.handleRequest(3);	
		handler.handleRequest(3);	
	}

}
