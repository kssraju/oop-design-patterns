package com.mbd.behavioral.observer;

public class Subscriber implements IObserver {

	private String name;

	public Subscriber(String name) {
		super();
		this.name = name;
	}

	@Override
	public void update() {
		System.out.println(name + " is notified. The product is available.");
	}
	
	@Override
	public String toString() {
		return this.name;
	}

}
