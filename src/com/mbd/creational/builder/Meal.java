package com.mbd.creational.builder;

/**
 * Клас, който обслужва JAVADOC
 * 
 * @author mdimitrova@acsior.com - 30.01.2014
 */
public class Meal {

	private String drink;
	private String mainCourse;
	private String side;

	/**
	 * @return String
	 */
	public String getDrink() {
		return this.drink;
	}

	/**
	 * @return String
	 */
	public String getMainCourse() {
		return this.mainCourse;
	}

	/**
	 * @return String
	 */
	public String getSide() {
		return this.side;
	}

	/**
	 * @param drink
	 */
	public void setDrink(String drink) {
		this.drink = drink;
	}

	/**
	 * @param mainCourse
	 */
	public void setMainCourse(String mainCourse) {
		this.mainCourse = mainCourse;
	}

	/**
	 * @param side
	 */
	public void setSide(String side) {
		this.side = side;
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "drink:" + this.drink + ", main course:" + this.mainCourse
				+ ", side:" + this.side;
	}
}
