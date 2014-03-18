package com.mbd.creational.builder;

/**
 * Клас, който обслужва JAVADOC
 * 
 * @author mdimitrova@acsior.com - 30.01.2014
 */
public class MealConstructor {

	private MealBuilder mealBuilder = null;

	/**
	 * Конструктор
	 * 
	 * @param mealBuilder
	 */
	public MealConstructor(MealBuilder mealBuilder) {
		this.mealBuilder = mealBuilder;
	}

	/**
	 * JAVADOC
	 */
	public void constructMeal() {
		this.mealBuilder.buildDrink();
		this.mealBuilder.buildMainCourse();
		this.mealBuilder.buildSide();
	}

	/**
	 * JAVADOC
	 * 
	 * @return Meal
	 */
	public Meal getMeal() {
		return this.mealBuilder.getMeal();
	}
}
