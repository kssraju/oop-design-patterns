package com.mbd.behavioral.chainofresponsibility;

/**
 * Клас, който обслужва JAVADOC
 * @author mdimitrova@acsior.com - 30.01.2014
 */
public class PositiveHandler extends BaseHandler {

	/**
	 * @see com.mbd.behavioral.chainofresponsibility.BaseHandler#handleRequest(int)
	 */
	@Override
	public void handleRequest(int number) {
		if (number >= 0) {
			System.out.println("The number " + number + " is handled by "
					+ getClass().getSimpleName());
		}

	}

}
