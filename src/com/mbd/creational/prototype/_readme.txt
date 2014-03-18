Служи за създаване на нови обекти чрез клониране. Може да се имплементира и с 
обикновен Factory патърн, ако вместо нова инстанция, се връща клонинг на обект.

- Полезен е, когато клиентът познава конкретната имплементация на обекта и иска
лесно да се помени с друг имплементатор.

- Използва се много често при правенето на игри, когато трябва да се 
генерират различни стаи с различни врати (например) - правоъгълна, квадратна, 
кръгла и т.н.  

- Полезен е и когато езикът не позволява множествено наследяване, то се симулира 
в случая чрез имплементиране на интерфейси.

Може да се доразвие с Factory.

Също така не е задължително да се използва механизма за клониране с цел създаване
на нови обекти.

The prototype pattern is a codification of an interface. 
It allows you to among other things: design mocks and decouple interactions 
as well as generalize. The reason you use it instead of subclassing is that 
it allows for duck-typing and multiple inheritance on platforms that don't 
natively support such things.

Basically, you're saying "Here's an object that at least supports these 
interfaces", without giving any details about how it implements them.