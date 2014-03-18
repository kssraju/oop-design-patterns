package com.mbd.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Product implements IObservable {

	private List<IObserver> subscribers = null;

	public Product() {
		super();
		this.subscribers = new ArrayList<IObserver>();
	}

	@Override
	public void registerSubscriber(IObserver subscriber) {
		this.subscribers.add(subscriber);
		
		System.out.println(subscriber.toString() + " is successfuly registered.");

	}

	@Override
	public void unregisterSubscriber(IObserver subscriber) {
		if (this.subscribers.contains(subscriber)) {
			this.subscribers.remove(subscriber);
			
			System.out.println(subscriber.toString() + " is not subscribed any longer.");
		}
	}

	@Override
	public void notifySubscribers() {
		for (IObserver subsc : subscribers) {
			subsc.update();
		}
	}

	public void changeAmount(int amount) {

		if (amount > 1) {
			notifySubscribers();
		}
	}

}
