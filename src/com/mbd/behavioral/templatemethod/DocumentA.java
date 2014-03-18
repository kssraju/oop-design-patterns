package com.mbd.behavioral.templatemethod;

public class DocumentA extends BaseDocument {

	@Override
	protected boolean isValid() {
		System.out.println("DocumentA is valid.");
		return true;
	}

	@Override
	protected void storeInDB() {
		System.out.println("DocumentA is stored.");
	}

}
