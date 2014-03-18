package com.mbd.behavioral.mediator;

public class User {
	private IMediator mediator;

	private String userName;

	public User(IMediator mediator, String userName) {
		super();
		this.mediator = mediator;
		this.userName = userName;
	}

	public String getUserName() {
		return userName;
	}

	public void sendPrivateMessage(User receiver, String msg) {
		this.mediator.sendPrivateMessage(this, receiver, msg);
	}

	public void sendPublicMessage(String msg) {
		this.mediator.sendPublicMessage(this, msg);
	}

	public void receiveMessage(User sender, String msg) {
		System.out.println(userName + " has received message from "
				+ sender.getUserName() + ": " + msg);
	}

}
