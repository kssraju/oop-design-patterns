package com.mbd.behavioral.command;

/**
 * Клас, който обслужва JAVADOC
 * 
 * @author mdimitrova@acsior.com - 31.01.2014
 */
public class CommandPlayNextChannel implements Command {

	private TV tv;

	/**
	 * Конструктор
	 * 
	 * @param tv
	 */
	public CommandPlayNextChannel(TV tv) {
		super();
		this.tv = tv;
	}

	/**
	 * @see com.mbd.behavioral.command.Command#execute()
	 */
	@Override
	public void execute() {
		this.tv.playNextChanel();
	}
}
