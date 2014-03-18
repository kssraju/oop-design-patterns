package com.mbd.creational.factory;

import java.util.HashMap;
import java.util.Map;

/**
 * @author mdimitrova@acsior.com - 29.01.2014
 */
public final class AnimalFactory {

	private static Map<String, Animal> animals = new HashMap<>();

	static {
		AnimalFactory.registerAnimal(new Cat());
		AnimalFactory.registerAnimal(new Chicken());
		AnimalFactory.registerAnimal(new Spider());
	}

	/**
	 * Create new instnce by type
	 * 
	 * @param animalType
	 * @return Animal
	 */
	public static Animal getAnimal(String animalType) {
		if (animals.containsKey(animalType)) {
			return animals.get(animalType).createAnimal();
		}

		return null;
	}

	/**
	 * Register animal
	 * 
	 * @param animal
	 */
	public static void registerAnimal(Animal animal) {
		if (!animals.containsKey(animal.getType())) {
			animals.put(animal.getType(), animal);
		}
	}

	/**
	 * Конструктор
	 */
	private AnimalFactory() {
		super();
	}

}
