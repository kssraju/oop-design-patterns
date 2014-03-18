Обзървър патърна се използва, когато при настъпване на някаква промяна в състоянието на обекта
искаме да уведомим заинтересованите.

Примери, където е приложим:
1) на финансовата борса, при промяна на индексите, всички клиенти трябва да бъдат уведомени
2) сървър на новинарска агенция, при поява на новина, тя трябва да бъде разпратена на абонираните читатели
3) онлайн магазин, потребител иска да си купи артикул, който е изчерпан; в този случай бутонът "Уведоми ме, когато
артикулът е наличен" е имплементация точно на този шаблон

		Product product = new Product();
		
		Subscriber s1 = new Subscriber("Ivan");
		product.registerSubscriber(s1);
		
		Subscriber s2 = new Subscriber("Pesho");
		product.registerSubscriber(s2);
		
		Subscriber s3 = new Subscriber("Daria");
		product.registerSubscriber(s3);			
		
		product.unregisterSubscriber(s2);
		
		product.changeAmount(-2);
		product.changeAmount(5);	

The observer pattern is used in the model view controller (MVC) architectural pattern. In MVC the this pattern is 
used to decouple the model from the view. View represents the Observer and the model is the Observable object.
Simply, the Observer pattern allows one object (the observer) to watch another (the subject). The Observer pattern 
allows the subject and observer to form a publish-subscribe relationship. Through the Observer pattern, observers can
 register to receive events from the subject. When the subject needs to inform its observers of an event, it simply 
 sends the event to each observer.
 
 You can think of observer design pattern in two ways

Subject-Observer relationship:Object which is being observed is refereed as Subject and classes which observe subject 
are called Observer 
Publisher-Subscriber relationship:A publisher is one who publish data and notifies it to the list of subscribers 
who have subscribed for the same to that publisher. A simple example is Newspaper. Whenever a new edition is 
published by the publisher,it will be circulated among subscribers whom have subscribed to publisher.
		