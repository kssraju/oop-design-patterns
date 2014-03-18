package com.mbd.behavioral.templatemethod;

public abstract class BaseDocument {

	protected abstract boolean isValid();

	protected abstract void storeInDB();

	public void save() {
		if (isValid()) {
			storeInDB();
			notifyUser();
		}
	}

	private void notifyUser() {
		System.out.println("Operation completes successfuly.");
	}

}
