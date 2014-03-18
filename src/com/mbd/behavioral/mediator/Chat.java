package com.mbd.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class Chat implements IMediator {

	private List<User> users = null;

	public Chat() {
		super();
		this.users = new ArrayList<User>();
	}

	@Override
	public void sendPrivateMessage(User sender, User receiver, String message) {
		for (User u : users) {
			if (u.equals(receiver)) {
				u.receiveMessage(sender, message);
			}
		}
	}

	@Override
	public void addUser(User user) {
		this.users.add(user);

	}

	@Override
	public void removeUser(User user) {
		if (this.users.contains(user)) {
			this.users.remove(user);
		}
	}

	@Override
	public void sendPublicMessage(User sender, String message) {
		for (User u : users) {
			if (u != sender) {
				u.receiveMessage(sender, message);
			}
		}

	}

}
