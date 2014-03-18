package com.mbd.creational.factory;

/**
 * @author mdimitrova@acsior.com - 29.01.2014
 */
public class _AnimalTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
						
			Animal animal = AnimalFactory.getAnimal(Cat.TYPE);

			if (animal != null) {
				System.out.println(animal.getType());
			} else {
				System.out.println("Unknown animal type!");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
