package com.mbd.creational.builder;

/**
 * Клас, който обслужва JAVADOC
 * 
 * @author mdimitrova@acsior.com - 30.01.2014
 */
public class ItalianMealBuilder implements MealBuilder {

	private Meal meal;

	/**
	 * Конструктор	
	 */
	public ItalianMealBuilder() {
		this.meal = new Meal();
	}

	/**
	 * @see com.mbd.creational.builder.MealBuilder#buildDrink()
	 */
	@Override
	public void buildDrink() {
		this.meal.setDrink("red wine");
	}

	/**
	 * @see com.mbd.creational.builder.MealBuilder#buildMainCourse()
	 */
	@Override
	public void buildMainCourse() {
		this.meal.setMainCourse("pizza");
	}

	/**
	 * @see com.mbd.creational.builder.MealBuilder#buildSide()
	 */
	@Override
	public void buildSide() {
		this.meal.setSide("bread");
	}

	/**
	 * @see com.mbd.creational.builder.MealBuilder#getMeal()
	 */
	@Override
	public Meal getMeal() {
		return this.meal;
	}
}
