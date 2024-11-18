# Vererbung

## Motivation
* Vergleich mit der echten Welt: Wir modellieren unsere Programme objektientiert, also der echten Welt nach.
  * Beobachtbar: Es gibt viele Dinge, die sich gemeinsame Eigenschaften teilen (z.B. Graphische Formen, Tische, Stühle, etc…), aber sich in ihren Ausprägungen unterscheiden und zusätzliche Features bieten.
  * Java (und viele andere Programmiersprachen) macht sich diese Beobachtung zu Nutze. 
* Wir möchten in diesem Themenblock eine einfache Grafikanwendung bauen, die es erlaubt, bestimmte Formen in einem Koordinatensystem anzuordnen und einzufärben.
* Unsere Anwendung soll 3 Formentypen unterstützen: **Circle, Triangle und Rectangle**
  * Alle Klassen haben teilweise ähnliche Properties: x, y, Farbe
  * Ebenfalls gleiche Methoden: getCircumfence(), getArea()
  * Nun beispielhaft **Rectangle** implementieren.
* Copy-Paste:
  * Was, wenn wir nun eine Klasse für den **Circle** implementieren?
  * neue Klasse anlegen und Inhalte aus Rectangle-Klasse kopieren, Methoden zum Umfang und Fläche berechnen kopieren, Formeln anpassen
  * Probleme:
    * viele Duplikate im Projekt (Attribute, Methoden, ...)
    * Änderungen von z.B. Datentyp x und y Position müssen überall händisch angepasst werden
    * Kreise, Dreiecke und Rechtecke müssen stets getrennt voneinander behandelt werden (rüberbringen: wir bekommen hier die Vorteile von Polymorphie nicht)

## Vererbung in Java
* UML-Foliensatz auflegen
  * Vererbung erlaubt es uns, geteilte Attribute und Methoden in eine Elterklasse auszulagern. Diese Attribute und Methoden werden von allen Kindklassen geteilt. 
  * Mit Vererbung: Basisklasse **Shape** als Startpunkt
    * Enthält Koordinaten, Farbe
    * Keine Aussage über Berechnung der Fläche und Umfang möglich!
  * Kindklasse: **Rectangle**
    * alle Eigenschaften und Methoden werden von der Basisklasse Shape mithilfe von Vererbung übernommen.
    * Rectangle kann dann wieder um weitere Attribute und Methoden erweitert werden.
* Vererbung an **Rectangle** in Coding-Demo vorzeigen:
  * existierende Rectangle Klasse leeren
  * Mit dem Schlüsselwort **extends** gibt man an, von welcher Klasse geerbt werden soll
    * In diesem Fall ist **Rectangle** eine Spezialisierung von **Shape**. 
    * Nur die benötigten neuen Attribute und Methoden müssen angelegt werden (Länge, Breite), der Rest wird übernommen (Koordinaten, Farbe).
  * Besonderheit beim Konstruktor:
    * Die neue Klasse braucht ebenfalls einen eigenen Konstruktor.
    * Zuerst ruft man einen Konstruktor der Basisklasse mithilfe von **super** auf.
    * Danach können die neuen Attribute initialisiert werden.
  * **Vererbungshierarchie**: Erbt eine Klasse von Shape, dann ist auch die Instanz einer Unterklasse eine "Shape". Wir könnten beispielsweise so Circles, Triangles und Rectangles innerhalb eines Shape[]-Arrays mischen! Das funktioniert auch für Parameter und Variablen.

## Methoden überladen
* Die Exception-werfenden Methoden aus der Basisklasse müssen nun noch durch die korrekten Formeln ersetzt werden.
  * Indem Methoden mit der exakt gleichen Signatur in der Kindklasse implementiert werden, ist dies möglich.
  * Üblicherweise werden diese Methoden mit **@Override** annotiert. Dann weiß der Java Compiler, dass es sich hier um eine überschriebene Methode handelt.
  * **getCircumference()** und **getArea()** können in der Klasse Rectangle neu implementiert werden.
* Zugriff auf Methoden der Basisklasse:
  * Mithilfe dem **super**-Schlüsselwort kann auf Methoden der Basisklasse zugegriffen werden
  * Demo: Anhand der **getCircumference()**-Methode demonstrieren. Es wird nun wieder die bekannte Exception geworfen.
