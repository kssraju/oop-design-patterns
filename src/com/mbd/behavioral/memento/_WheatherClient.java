package com.mbd.behavioral.memento;

public class _WheatherClient {

	public static void main(String[] args) {
		
		WheatherCaretaker stateManager = new WheatherCaretaker();

		Wheather wheather = new Wheather();
		wheather.weatherChanged(14, -0.5);

		stateManager.saveState(wheather);

		wheather.weatherChanged(15, -2.0);
		wheather.weatherChanged(17, -5.0);

		stateManager.restoreState(wheather);

	}

}
