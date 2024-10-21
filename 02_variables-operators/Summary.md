# Variablen
## Datentypen
| Name    | Beschreibung                                                    | Beispiel       |
|---------|-----------------------------------------------------------------|----------------|
| boolean | Wahrheitswert (true oder false)                                 | true           |
| byte    | min: -128, max: 127                                             | 7              |
| short   | min: -32.768, max: 32.767                                       | 2022           |
| int     | min: -2.147.483.648, max: 2.147.483.647                         | 54321          |
| long    | min: −9.223.372.036.854.775.808, max: 9.223.372.036.854.775.807 | 10987654321    |
| float   | 32-bit/4-byte floating point                                    | 2.022          |
| double  | 64-bit/8-byte floating point                                    | 2.022F         |
| char    | Repräsentiert ein Unicode Zeichen                               | 'a'            |
| String  | Zeichenkette                                                    | "Hello World!" |

## Zuweisung
Um einer Variable einen Wert zuzuweisen, muss diese zuerst mit einem Datentyp und Namen deklariert werden
```java
int testwert;
```
Daraufhin kann in dieser ein Wert gespeichert werden
```java
testwert = 1;
```
Deklaration und Initialisierung können auch in einer Zeile passieren
```java
int testwert = 1;
String hw = "Hello World!";
```

Um Werte zu berechnen oder zusammenzufügen können arithmetische Operatoren verwendet werden
```java
int summe = 1 + 2;
int multiplikation = 3 * 2;
int division = 4 / 2;
```
Die gespeichtern Werte des oberen Codeblocks sind dann summe = 3, multiplikation = 6, division = 2

Strings bzw. Texte können mit einem *+* konkateniert (zusammengefügt) werden. Leerzeichen müssen extra eingefügt werden
```java
String vorname = "John";
String nachname = "Doe";
String ganzerName = vorname + " " + nachname; 
System.out.println("Mein Name ist: " + ganzerName);
```
Auf der Konsole wird dann ausgegeben: "Mein Name ist: John Doe"

Im Verlauf des Programmes, kann einer Variable auch ein neuer Wert zugewiesen werden
```java
int counter = 0;
counter = counter + 1;
```
Der gespeicherte Wert der Variable counter (0) wird zuerst um Eins erhöht und danach wird das Ergebnis in der Variable counter gespeichert
