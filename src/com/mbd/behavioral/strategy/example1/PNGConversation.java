package com.mbd.behavioral.strategy.example1;

public class PNGConversation implements IConverterStrategy {

	@Override
	public void convertImage(String path) {
		System.out.println("The result file is " + path + ".png");
	}

}
