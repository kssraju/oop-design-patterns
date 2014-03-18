package com.mbd.creational.factory;

/**
 * @author mdimitrova@acsior.com - 29.01.2014
 */
public class Chicken extends Animal {

	/** TYPE */
	public static final String TYPE = "chicken";

	static {
		AnimalFactory.registerAnimal(new Chicken());
	}

	/**
	 * @see com.mbd.creational.factory.Animal#createAnimal()
	 */
	@Override
	public Animal createAnimal() {
		return new Chicken();
	}

	/**
	 * @see com.mbd.creational.factory.Animal#getLegsCount()
	 */
	@Override
	public int getLegsCount() {
		return 2;
	}

	/**
	 * @see com.mbd.creational.factory.Animal#getType()
	 */
	@Override
	public String getType() {
		return TYPE;
	}
}
