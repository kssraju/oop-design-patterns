package com.mbd.behavioral.strategy.example1;

public class ConversationContext {

	private IConverterStrategy converter;

	public void setConverter(IConverterStrategy converter) {
		this.converter = converter;
	}

	public void convertImage(String name) {
		this.converter.convertImage(name);
	}
}
