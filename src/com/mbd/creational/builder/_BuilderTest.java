package com.mbd.creational.builder;

/**
 * Клас, който обслужва JAVADOC
 * 
 * @author mdimitrova@acsior.com - 30.01.2014
 */
public class _BuilderTest {

	/**
	 * JAVADOC
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		MealBuilder mealBuilder = new ItalianMealBuilder();
		MealConstructor mealDirector = new MealConstructor(mealBuilder);
		mealDirector.constructMeal();
		Meal meal = mealDirector.getMeal();
		System.out.println("meal is: " + meal);

		mealBuilder = new JapaneseMealBuilder();
		mealDirector = new MealConstructor(mealBuilder);
		mealDirector.constructMeal();
		meal = mealDirector.getMeal();
		System.out.println("meal is: " + meal);

	}

}
