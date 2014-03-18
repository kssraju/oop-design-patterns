package com.mbd.behavioral.strategy.example1;

public class JPGConversation implements IConverterStrategy {

	@Override
	public void convertImage(String path) {
		System.out.println("The result file is " + path + ".jpg");
	}

}
