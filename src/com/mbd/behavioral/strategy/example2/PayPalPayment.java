package com.mbd.behavioral.strategy.example2;

public class PayPalPayment implements IPaymentStrategy {

	private String userName;

	public PayPalPayment(String userName) {
		super();
		this.userName = userName;
	}

	@Override
	public void pay(int amount) {
		System.out.println("The amount " + amount
				+ " is paid by paypal account with username " + userName);

	}

}
