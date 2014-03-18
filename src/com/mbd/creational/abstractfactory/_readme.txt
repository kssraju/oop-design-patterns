Нарича се още "Factory of Factories", т.е. това е фактори за факторита.

Полезно е да се използва, 
когато имаме различни типове обекти, които си приличат по същество. В примера се
разглежда обекта БУТОН, който в различните технологии за имплементация на 
потребителски интерфейси е различен, но по същество са с еднакво предназначение.

Примера представя абстрактно фактори, което по тип инстанцира правилния наследник.
От своя страна наследника инстанцира правилните обекти, наследници на обекта БУТОН.

Пример:
	AbstractFactory jsfComponents = FactoryMaker.getFactory("jsf");
	Button b1 = jsfComponents.createButton();
	b1.doAction();

	AbstractFactory guiComponents = FactoryMaker.getFactory("gui");
	Button b2 = guiComponents.createButton();
	b2.doAction();
		
Резултат:
	JSFButton clicked!
	GUIButton clicked!
