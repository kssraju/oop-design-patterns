package com.mbd.behavioral.observer;

public class _ObserverTest {

	public static void main(String[] args) {

		Product product = new Product();
		
		Subscriber s1 = new Subscriber("Ivan");
		product.registerSubscriber(s1);
		
		Subscriber s2 = new Subscriber("Pesho");
		product.registerSubscriber(s2);
		
		Subscriber s3 = new Subscriber("Daria");
		product.registerSubscriber(s3);			
		
		product.unregisterSubscriber(s2);
		
		product.changeAmount(-2);
		product.changeAmount(5);	

	}

}
