# Aufgaben zu Vererbung
## Aufgabe 1 - Vererbung einbauen
Betrachte die Klassen `Employee`, `Student` und `Teacher`. Diese teilen sich eine Reihe an gemeinsamen Attributen und Methoden. Lagere in einem ersten Schritt alle gemeinsamen Attribute und Methoden in eine Oberklasse `Person` aus.

Lasse anschließend alle der 3 Klassen von der von Ihnen definierten Basisklasse `Person` erben.

Instanziiere anschließend Testweise alle Klassen in der Main-Methode der `Main`-Klasse.

## Aufgabe 2 - Methoden vereinfachen
Nachdem `Employee`, `Student` und `Teacher` nun von der gleichen Basisklasse `Person` erben: Gibt es eine Möglichkeit, die Implementierungen der `sayHelloTo`-Methoden zu kürzen? Falls ja, warum funktioniert das?

## Aufgabe 3 - Methoden überladen
Überlade die sayHello-Methoden in den Klassen `Employee`, `Student` und `Teacher`. Der Employee soll anschließend neben "Hallo" auch seine Abteilung bekannt geben. Der Student soll neben "Hallo" das eigene Studienfach ausgeben. Zu guter Letzt soll der Teacher sein Lehrfach ausgeben.

Beispiele:
* `Employee`: Hello, my name is John Doe and I'm working in Sales.
* `Teacher`: Hello, my name is John Doe and I'm teaching Computer Science.
* `Student`: Hello, my name is John Doe and I'm studying Business Informatics.

Überlade hierfür die `sayHelloTo(...)`-Methode(n) in den Kindklassen.

Teste anschließend Deine Implementierung in der Main-Methode der `Main`-Klasse.