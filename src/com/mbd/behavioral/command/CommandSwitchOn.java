package com.mbd.behavioral.command;

/**
 * Клас, който обслужва JAVADOC
 * 
 * @author mdimitrova@acsior.com - 31.01.2014
 */
public class CommandSwitchOn implements Command {

	private TV tv;

	/**
	 * Конструктор
	 * 
	 * @param menu
	 */
	public CommandSwitchOn(TV menu) {
		super();
		this.tv = menu;
	}

	/**
	 * @see com.mbd.behavioral.command.Command#execute()
	 */
	@Override
	public void execute() {
		this.tv.switchOn();
	}
}
