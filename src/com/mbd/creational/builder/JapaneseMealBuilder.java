package com.mbd.creational.builder;

/**
 * Клас, който обслужва JAVADOC
 * 
 * @author mdimitrova@acsior.com - 30.01.2014
 */
public class JapaneseMealBuilder implements MealBuilder {

	private Meal meal;

	/**
	 * Конструктор
	 */
	public JapaneseMealBuilder() {
		this.meal = new Meal();
	}

	/**
	 * @see com.mbd.creational.builder.MealBuilder#buildDrink()
	 */
	@Override
	public void buildDrink() {
		this.meal.setDrink("sake");
	}

	/**
	 * @see com.mbd.creational.builder.MealBuilder#buildMainCourse()
	 */
	@Override
	public void buildMainCourse() {
		this.meal.setMainCourse("chicken teriyaki");
	}

	/**
	 * @see com.mbd.creational.builder.MealBuilder#buildSide()
	 */
	@Override
	public void buildSide() {
		this.meal.setSide("miso soup");
	}

	/**
	 * @see com.mbd.creational.builder.MealBuilder#getMeal()
	 */
	@Override
	public Meal getMeal() {
		return this.meal;
	}
}
