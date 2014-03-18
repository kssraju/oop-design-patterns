package com.mbd.behavioral.strategy.example2;

public class _PaymentClient {

	public static void main(String[] args) {

		PaymentContext ctx = new PaymentContext();
		
		ctx.setPaymentStrategy(new PayPalPayment("milena"));
		ctx.pay(34);
		
		ctx.setPaymentStrategy(new CreditCardPayment("Milena B. Dimitrova", "123456789"));
		ctx.pay(88);

	}

}
