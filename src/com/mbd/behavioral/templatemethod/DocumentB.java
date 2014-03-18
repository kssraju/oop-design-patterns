package com.mbd.behavioral.templatemethod;

public class DocumentB extends BaseDocument {

	@Override
	protected boolean isValid() {
		System.out.println("DocumentB is valid.");
		return true;
	}

	@Override
	protected void storeInDB() {
		System.out.println("DocumentB is stored.");
	}

}
