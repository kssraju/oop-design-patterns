package com.mbd.behavioral.command;

/**
 * Меню на телевизор
 * 
 * @author mdimitrova@acsior.com - 31.01.2014
 */
public class TV {

	/**
	 * JAVADOC
	 */
	public void playNextChanel() {
		System.out.println("Next channel is playing!");
	}

	/**
	 * JAVADOC
	 */
	public void switchOff() {
		System.out.println("The TV is switched OFF!");
	}

	/**
	 * JAVADOC
	 */
	public void switchOn() {
		System.out.println("The TV is switched ON!");
	}
}
