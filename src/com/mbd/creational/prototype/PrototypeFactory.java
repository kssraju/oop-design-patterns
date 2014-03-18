package com.mbd.creational.prototype;

/**
 * Клас, който обслужва JAVADOC
 * 
 * @author mdimitrova@acsior.com - 30.01.2014
 */
public class PrototypeFactory {

	/**
	 * Клас, който обслужва JAVADOC
	 * 
	 * @author mdimitrova@acsior.com - 30.01.2014
	 */
	protected static class ModelType {
		/** ALBUM */
		protected static final String ALBUM = "album";
		/** MOVIE */
		protected static final String MOVIE = "movie";
	}

	private static java.util.Map<String, Prototype> prototypes = new java.util.HashMap<>();

	static {
		prototypes.put(ModelType.MOVIE, new Movie());
		prototypes.put(ModelType.ALBUM, new Album());
	}

	/**
	 * JAVADOC
	 * 
	 * @param s
	 * @return Prototype
	 * @throws CloneNotSupportedException
	 */
	public static Prototype getInstance(final String s)
			throws CloneNotSupportedException {
		return prototypes.get(s).clone();
	}
}
