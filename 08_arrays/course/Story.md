# Arrays
* Erklärung der Regal-Klasse mit Hinweis auf die Anzahl der Fächer
  * Problem: Je mehr Fächer im Regal, desto mehr Variablen müssen wir anlegen
  * Das wird schnell aufwändig, wir werden extrem unflexibel: Die Menge der Fächer könnte sich ändern.
* Für diesen Use-Case gibt es Arrays!
* **Was ist ein Array?**
  * Datenstruktur, in der mehrere Elemente des gleichen Datentyps unter einem gemeinsamen Namen zusammengefasst werden
  * Ein Array ist eine statische Datenstruktur: Man definiert für dieses eine Größe. Nur so viele Elemente passen dann rein. Die Größe ist im Nachhinein nicht mehr änderbar.
  * Erkennbar an den eckigen Klammern: `[]`
* **Wie erzeugt man ein Array?**
  * `Datentyp[] arrayName = new Datentyp[Länge];`
  * Alternativ über Array-Initializer: `Datentyp[] arrayName = { Element1, Element2, ... };`
* **Wie greift man auf ein Array zu?**
  * Jedes Element im Array hat einen Index, der mit 0 beginnt
  * Um auf ein Element zuzugreifen, schreibt man den Index in eckige Klammern hinter den Array-Namen: `array[index]`
  * Beispiel: `String[] names = { "Alice", "Bob", "Chris" };`
    * `names[0]` gibt "Alice" zurück
    * `names[1]` gibt "Bob" zurück
    * `names[2]` gibt "Chris" zurück
  * Zum Schreiben: `names[0] = "Daniel";`
* **Wie erstellt man ein Array?**
  * Regal umschreiben auf Array, vorerst feste Größe durch `capacity`-Variable
  * Neues Feld `String[] drawers` erstellen
  * In leerem Konstruktor neues Array erstellen: `this.drawers = new String[5];`
  * In Konstruktor mit Strings Array Initializer verwenden: `this.drawers = new String[] { drawer1, drawer2, ... };`
  * putInDrawer() anpassen, um Array zu nutzen
    * OutOfBounds Prüfung erläutern
  * getFromDrawer() anpassen, um Array zu nutzen
* **Task** 
  * Studierende sollen selber Arrays erstellen, Werte auslesen und bestehende Arrays modifizieren

# Schleifen
* Mit Blick auf die vergangenen Aufgaben: Manuell auf jeden Array-Eintrag zugreifen zu müssen, kann sehr schnell sehr kompliziert und aufwändig werden.
* Im Kontext von Arrays trifft man deshalb oftmals auf Schleifen.
* Schleifen erlauben es, Codeblöcke beliebig oft zu wiederholen.
* In Java gibt es mehrere Schleifentypen, die wir im Rahmen dieser Session kennen lernen werden.
* Wir gehen im folgenden davon aus, dass wir ein Array gegeben haben und jedes dessen Elemente in der Konsole ausgeben wollen.

## for-Each Schleife
* Die im Kontext von Arrays am häufigsten benutzte Schleife ist die for-each Schleife
* Der Aufbau ist wie folgt:

```java
typ[] arr = { ... }

for (typ [Identifier] : arr) {
    // Unter [Identifier] ist nun das aktuelle Element im Array verfügbar.
    // Der Code wird für jedes Element ausgeführt, beginnend von Index 0.
}
```

* Beispielhaft durch int[]-Array iterieren und Elemente im Array ausgeben.

## for-Schleife
* Alternativ gibt es die for-Schleife
* In dieser sind folgende Komponenten definiert:
  * Zählervariable
  * Bedingung (Loop wird solange ausgeführt, bis die Bedingung nicht mehr zutrifft, also `false` ist)
  * Inkrement der Zählervariable
  * Codeblock, welcher pro Iteration ausgeführt wird
* Der Aufbau ist wie folgt:

```java
typ[] arr = { ... }

for (int i = 0; i < arr.length; i++) {
    // i ist eine Zählervariable.
    // In der Abbruchbedingung haben wir definiert, dass wir nur bis zum maximalen Index innerhalb
    // unseres Arrays zählen.
}
```

* Mit Studierenden checken: Wie kommen wir jetzt auf den Inhalt unseres Arrays?
* Anschließend wieder alle Elemente aus dem Array auf der Konsole ausgeben.
* **Task**
  * Studierende sollen selbst for-Schleifen zur Berechnung eines Durchschnittswertes implementieren: Dabei sollen sowohl for-each als auch ein klassisches for mit Index verwendet werden. 

## while-Schleife
* Es gibt in Java (und vielen anderen Programmiersprachen) zusätzlich noch die `while`-Schleife
* Anders als for, wo typischerweise durch etwas Endliches, wie z.B. ein Array navigiert wird oder ein Codeblock eine bestimmte Anzahl oft ausgeführt werden soll, wiederholt das `while` einen Codeblock so lange, bis eine übergebene Bedingung nicht mehr zutrifft.
* Der Aufbau ist wie folgt:

```java
while(condition) {
    // Do something, repeatedly!
}
```

* Aufpassen: In der Implementierung des while-Blocks muss darauf geachtet werden, dass die übergebene Bedingung irgendwann `false` wird. Andernfalls tritt ein Endlosloop auf. Unser Programm beendet sich dann nicht sondern bleibt stecken.
* Mittelwertberechnung mit Hilfsindex demonstrieren. Endlosloop einbauen! Studierende entdecken lassen!
* **Task**
  * Wieder Mittelwert berechnen!
  * Spannendere Aufgabe: Gummibärchen-Box. Nehme solange Bärchen aus Box, bis diese leer ist. 