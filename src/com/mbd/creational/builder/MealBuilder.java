package com.mbd.creational.builder;

/**
 * Клас, който обслужва JAVADOC
 * 
 * @author mdimitrova@acsior.com - 30.01.2014
 */
public interface MealBuilder {
	/**
	 * buildDrink
	 */
	public void buildDrink();

	/**
	 * buildMainCourse
	 */
	public void buildMainCourse();

	/**
	 * buildSide
	 */
	public void buildSide();

	/**
	 * Meal
	 * 
	 * @return Meal
	 */
	public Meal getMeal();
}
