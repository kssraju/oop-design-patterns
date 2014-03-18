package com.mbd.behavioral.memento;

//caretaker
public class WheatherCaretaker {

	private Object state;

	public void saveState(Wheather wheather) {
		state = wheather.save();
	}

	public void restoreState(Wheather wheather) {
		wheather.restore(state);
	}
}
