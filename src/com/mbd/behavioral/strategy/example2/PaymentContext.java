package com.mbd.behavioral.strategy.example2;

public class PaymentContext {

	private IPaymentStrategy paymentStrategy;

	public void setPaymentStrategy(IPaymentStrategy paymentStrategy) {
		this.paymentStrategy = paymentStrategy;
	}

	public void pay(int amount) {
		paymentStrategy.pay(amount);
	}

}
