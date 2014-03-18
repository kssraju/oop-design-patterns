package com.mbd.behavioral.strategy.example1;

public class _StrategyCLient {

	public static void main(String[] args) {

		ConversationContext ctx = new ConversationContext();
		ctx.setConverter(new PNGConversation());
		
		ctx.convertImage("image1");
		
		ctx.setConverter(new JPGConversation());
		ctx.convertImage("image2");
	}

}
