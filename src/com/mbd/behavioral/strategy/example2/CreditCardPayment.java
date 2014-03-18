package com.mbd.behavioral.strategy.example2;

public class CreditCardPayment implements IPaymentStrategy {

	private String name;
	private String cardNumber;

	public CreditCardPayment(String name, String cardNumber) {
		super();
		this.name = name;
		this.cardNumber = cardNumber;
	}

	@Override
	public void pay(int amount) {
		System.out.println("The amount " + amount
				+ " is paid by credit card of " + name + " with card number "
				+ cardNumber);
	}

}
