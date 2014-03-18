Като пример за онагледяване може да разгледаме дистанционното на телевизора.
При натискане на различен бутон, ние искаме то да изпълни различна команда, затова
имаме общ интерфейс за всички команди с един единставен метод "execute".

В този случай разполагаме с:
1) Телевизор
2) Дистанционно управление за телевизора
3) Команди (за включване, за изключване и за смяна на канала)

При имеплемнтация на патърна, изпълнението на командите ще изглежда така:

	TV tv = new TV();
	RemoteControl control = new RemoteControl();

	control.setCommand(new CommandSwitchOn(tv));
	control.pressButton();

	control.setCommand(new CommandPlayNextChannel(tv));
	control.pressButton();

	control.setCommand(new CommandSwitchOff(tv));
	control.pressButton();