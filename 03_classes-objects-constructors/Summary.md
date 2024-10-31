# Klassen, Objekte, Konstruktoren

Klassen und Objekte sind die grundlegenden Elemente der sogenannten "objektorientierten Programmierung". Mit ihrer Hilfe wird ein auf den jeweiligen Anwendungsfall angepasstes (und i.d.R. reduziertes) digitales Abbild der Realität modelliert.

## Klassen

Klassen definieren die "Schablone" / den Bauplan für im Programm zu erstellende Objekte. In der Klasse werden somit alle "Fähigkeiten" der daraus erstellten Objekte festgelegt.

```java
public class Person {
    
    // Klassenvariablen
    
    // Konstruktor(en)
    
    // Methoden
}
```

Über Klassenvariablen wird genau festgelegt, welche Informationen die Objekte der Klasse aufnehmen und speichern können.

```java
public class Person {
    
    String firstName;
    String lastName;
    short age;
}
```

## Objekte / Instanzen

Objekte (Instanzen) werden mit dem Schlüsselwort `new` entsprechend der Vorgabe aus der Klassendefinition erzeugt und selbst in Variablen gespeichert.

```java
Person bob = new Person();
```

Auf die Informationen (Klassenvariablen) in den Objekten kann über die "Punkt-Notation" zugegriffen werden.

```java
Person bob = new Person();
System.out.println("FirstName: " + bob.firstName); // liefert die Ausgabe "FirstName: Bob"
```

## Konstruktoren

Konstruktoren werden bei Erzeugung eines Objekts ausgeführt. Ihr Name muss dem Klassennamen entsprechen. Konstruktoren können Parameter erhalten, die beim Aufruf übergeben werden müssen. In vielen Fällen werden Konstruktoren dafür verwendet, sicherzustellen dass Klassenvariablen richtig initialisiert werden.

Zur Vermeidung von Namenskonflikten beim Zugriff auf Variablen der Klasse (Klassenvariablen) kann das Schlüsselwort `this` verwendet werden.

```java
public class Person {
    
    String firstName;
    String lastName;
    int age;
 
    Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
}
```