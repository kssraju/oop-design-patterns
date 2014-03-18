package com.mbd.behavioral.command;

/**
 * Клас, който обслужва JAVADOC
 * 
 * @author mdimitrova@acsior.com - 31.01.2014
 */
public class RemoteControl {

	private Command command;

	/**
	 * @param command
	 *            the command to set
	 */
	public void setCommand(Command command) {
		this.command = command;
	}

	/**
	 * JAVADOC
	 */
	public void pressButton() {
		this.command.execute();
	}
}
