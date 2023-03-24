# Later_Calculator_HW
Pasi in realizarea temei:
 Mi-am facut o clasa Ecuation: care are ca parametri doi operanzi de tip double si un String operation. Am implementat gettere
si settere, o metoda care calculeaza rezultatul in functie de operatie, si metoda toString.
 Am implementat o clasa EcuationRepository, care primeste ca argument un ArrayList de Obiecte de tip Ecuation, pentru care am facut
un getter si o metoda pentru a adauga obiecte in ArrayList.
 Am implementat clasa Serialization, care extinde clasa Thread, care primeste un ArrayList de Ecuatii si un fisier de tip file, in
care am implementat metoda Run, care serializeaza cu un delay de 1 secunda fiecare ecuatie.
 Am implementat clasa EcuationController, in care pentru inceput mi-am declarat ca si atribute un obiect de tip EcuationRepository,
un ArrayList pentru ecuatiile care vor fi deserializate si folosite pentru requestul de results, un Thread pentru serializare si fisierul
in care vom serializa ecuatiile. Prin intermediul requestului de do-math ecuatiile vor fi facute si puse in fisier, returnand fisierul.
Prin intermediul requestului de /check-finished vom primi raspuns pozitiv, daca vor fi scrise toate ecuatiile, sau negativ,
daca programul nu a terminat de scris, iar prin requestul de results vom afisa o pagina html cu toate ecuatiile intr-o lista.

PS: Sunt consient ca in rezolvarea temei nu am folosit corect conceptele pe care le-am invatat pana acum in spring boot si prin urmare
nota pe care o voi primi va fi slaba, insa aceste concepte mi se par destul de complicate pentru acest moment si consider ca va trebui
sa mai lucrez individual pentru a aprofunda mai mult, dar voi incerca sa-mi dau mult mai mult interesul.
