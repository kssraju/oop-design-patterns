package com.mbd.behavioral.observer;

public interface IObservable {
	
	public void registerSubscriber(IObserver subscriber);

	public void unregisterSubscriber(IObserver subscriber);

	public void notifySubscribers();
}
