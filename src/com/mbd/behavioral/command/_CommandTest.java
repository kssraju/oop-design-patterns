package com.mbd.behavioral.command;

/**
 * Клас, който обслужва JAVADOC
 * 
 * @author mdimitrova@acsior.com - 31.01.2014
 */
public class _CommandTest {

	/**
	 * JAVADOC
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		TV tv = new TV();
		
		RemoteControl control = new RemoteControl();

		control.setCommand(new CommandSwitchOn(tv));
		control.pressButton();

		control.setCommand(new CommandPlayNextChannel(tv));
		control.pressButton();

		control.setCommand(new CommandSwitchOff(tv));
		control.pressButton();

	}

}
