package com.mbd.behavioral.mediator;

public interface IMediator {

	public void sendPrivateMessage(User sender, User receiver, String message);

	public void sendPublicMessage(User sender, String message);

	public void addUser(User user);

	public void removeUser(User user);

}
