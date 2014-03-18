package com.mbd.creational.factory;

/**
 * 
 * @author mdimitrova@acsior.com - 29.01.2014
 */
public class Spider extends Animal {
	/** TYPE */
	public static final String TYPE = "spider";

	static {
		AnimalFactory.registerAnimal(new Spider());
	}

	/**
	 * @see com.mbd.creational.factory.Animal#createAnimal()
	 */
	@Override
	public Animal createAnimal() {
		return new Spider();
	}

	/**
	 * @see com.mbd.creational.factory.Animal#getLegsCount()
	 */
	@Override
	public int getLegsCount() {
		return 8;
	}

	/**
	 * @see com.mbd.creational.factory.Animal#getType()
	 */
	@Override
	public String getType() {
		return TYPE;
	}
}
