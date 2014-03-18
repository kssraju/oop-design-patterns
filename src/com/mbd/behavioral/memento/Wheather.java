package com.mbd.behavioral.memento;

//originator
public class Wheather {
	private int hour;
	private double degrees;

	public Wheather() {
		super();
	}

	public void weatherChanged(int hour, double degrees) {
		this.hour = hour;
		this.degrees = degrees;
		
		System.out.println(toString());
	}

	public Memento save() {
		return new Memento(this.hour, this.degrees);
	}

	public void restore(Object memento) {
		Memento state = (Memento) memento;
		weatherChanged(state.mementoHour, state.mementoDegrees);
	}

	@Override
	public String toString() {
		return "At " + hour + " hour is " + degrees + " degrees.";
	}

	/**
	 * @author Mm
	 * 
	 */
	private class Memento {
		private int mementoHour;
		private double mementoDegrees;

		/**
		 * @param mementoHour
		 * @param mementoDegrees
		 */
		public Memento(int mementoHour, double mementoDegrees) {
			super();
			this.mementoHour = mementoHour;
			this.mementoDegrees = mementoDegrees;
		}

	}

}
