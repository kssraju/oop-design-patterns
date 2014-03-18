package com.mbd.creational.factory;

/**
 * @author mdimitrova@acsior.com - 29.01.2014
 */
public class Cat extends Animal {

	/** TYPE */
	public static final String TYPE = "cat";

	static {
		AnimalFactory.registerAnimal(new Cat());
	}

	/**
	 * @see com.mbd.creational.factory.Animal#createAnimal()
	 */
	@Override
	public Animal createAnimal() {
		return new Cat();
	}

	/**
	 * @see com.mbd.creational.factory.Animal#getLegsCount()
	 */
	@Override
	public int getLegsCount() {
		return 4;
	}

	/**
	 * @see com.mbd.creational.factory.Animal#getType()
	 */
	@Override
	public String getType() {
		return TYPE;
	}
}
