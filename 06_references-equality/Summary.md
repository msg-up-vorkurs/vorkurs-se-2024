# Technische Details der Java Virtual Machine

## Umgang mit Parametern beim Methodenaufruf

Werte von Parametern werden beim Aufruf von Methoden kopiert
(Call-By-Value). Für primitive Datentypen wird also eine echte Kopie
des Wertes übergeben, bei Objektdatentypen (Klassen) wird die
Objektreferenz kopiert (nicht jedoch das Objekt, auf das die Objektreferenz
verweist).

### Konsequenzen

* Änderungen an Parametern primitiver Datentypen *innerhalb der Methode* haben **keine** Auswirkung auf den zugehörigen
  Wert in der *aufrufenden Methode*.
* Änderungen an Objekten, deren Objektreferenz als Parameter übergeben wurde, wirken sich auf das Objekt aus. Da aber
  sowohl die *aufgerufene* als auch die *aufrufende* Methode eine Kopie derselben Objektreferenz verwenden, sind
  Änderungen an dem zugehörigen Objekt auch für die *aufrufende* Methode sichtbar.

## Vergleiche mit Variablen

Beim Einsatz des Vergleichsoperators (`==`) mit Variablen werden
die Werte der beiden Variablen verglichen. Bei primitiven Datentypen
ist dies der in der Variablen gespeicherte Wert, für Variablen mit
Objektdatentypen der Wert der Objektreferenz.

### Konsequenzen

* Für Variablen primitiver Datentypen liefert der Vergleichsoperator das erwartete Vergleichsergebnis.
* Für Objektreferenzen liefert der Vergleichsoperator die Angabe, ob beide Objektreferenzen auf die selbe Objektinstanz
  verweisen.
* Sollen Objekte aufgrund ihrer Objekteigenschaften verglichen werden, muss dieser Vergleich selbst implementiert
  werden (durch Implementierung einer eigenen Methode, die die notwendigen Einzelvergleiche übernimmt und bewertet).

# Besonderheiten beim Umgang mit Null-Verweisen

Variablen mit Objektdatentypen können den speziellen Wert `null`
erhalten, wenn sie nicht auf eine Objektinstanz verweisen.
Wird dann versucht, über diese (Objekt-)Variable eine Methode der
entsprechenden Klasse aufzurufen, führt dies zu einer sog.
`NullPointerException`, da kein zugehöriges Bezugsobjekt existiert.

```java
public class Car {

    private Engine engine = null;

    public void start() {
        engine.start(); // engine == null, führt zu NullPointerException
    }
}
```

Der oben dargestellte Aufruf führt zu einer NullPointerException,
da die Variable `engine` nicht auf eine existierende Objektinstanz
verweist, sondern den Wert `null` trägt. Dadurch ist nicht klar, für
welches Objekt der Methodenaufruf durchgeführt werden soll.

Die Java Virtual Machine erzeugt in diesem Fall eine NullPointerException,
deren Stacktrace hilfreiche Informationen liefert, an welcher
Codestelle der problematische Methodenaufruf erfolgt ist.
Der Stacktrace zeigt (zeilenweise von unten nach oben gelesen) die
Aufrufreihenfolge der Methoden und Codezeilen der Klassen, die zum
Fehler geführt haben.

```
Exception in thread "main" java.lang.NullPointerException: Cannot invoke "course.Engine.start()" because "this.engine" is null
	at course.Car.start(Car.java:38)
	at course.nulls.Nulls.main(Nulls.java:11)
```