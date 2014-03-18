Използва се най-масово. 
В проектите, които сме разработвали го използваме най-често в MB-овете.
Във всеки MB има един основен Worker, който обслужва екрана. На високо ниво в
йерархията на MB имаме генерализиран метод "save", който първо вика метод за валидация, 
а след това вика метод create/update на конкретния Worker.
Всеки наследник на MB-а трябва да имплементира 1 абстрактен метод, който да връща
коректната инстанция на Worker-a, който го обслужва, както и по желание да override-не
метода за валидация, ако е наобходимо.

Например:
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		handleVehicle(new CarDriver());
		handleVehicle(new BusDriver());
	}

	/**
	 * @param vDriver
	 */
	static void handleVehicle(VehicleDriver vDriver) {
		vDriver.driveVehicle();
	}
	
Резултат:
Driving a car!
Driving a bus!