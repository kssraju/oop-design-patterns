package com.mbd.behavioral.command;

/**
 * Клас, който обслужва JAVADOC
 * 
 * @author mdimitrova@acsior.com - 31.01.2014
 */
public class CommandSwitchOff implements Command {

	private TV tv;

	/**
	 * Конструктор
	 * 
	 * @param tv
	 */
	public CommandSwitchOff(TV tv) {
		super();
		this.tv = tv;
	}

	/**
	 * @see com.mbd.behavioral.command.Command#execute()
	 */
	@Override
	public void execute() {
		this.tv.switchOff();
	}
}
