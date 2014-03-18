package com.mbd.behavioral.mediator;

public class _ChatClient {

	public static void main(String[] args) {
		
		Chat chatMediator = new Chat();
		
		User user1 = new User(chatMediator, "Penka");
		User user2 = new User(chatMediator, "Genka");
		User user3 = new User(chatMediator, "Pesho");
		User user4 = new User(chatMediator, "Siska");
		
		chatMediator.addUser(user1);
		chatMediator.addUser(user2);
		chatMediator.addUser(user3);
		chatMediator.addUser(user4);

		user1.sendPublicMessage("Hi all!");
		user2.sendPrivateMessage(user4, "Hi, Siska!");

	}

}
