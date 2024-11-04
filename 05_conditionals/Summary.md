# Bedingte Verzweigungen
## Bedingte Verzweigungen
Bedingte Verzweigungen emöglichen es, dass bestimmte Codeblöcke nur dann ausgeführt werden, wenn bestimmte Bedingungen erfüllt sind.

### Aufbau von if-Abfragen:
```java
if (condition) {
    System.out.println("Die Bedingung ist wahr!");
    System.out.println("Die zweite Bedingung etwas weiter unten könnte es auch sein.");
    System.out.println("Aber das wird nicht mehr überprüft.");
} else if (condition2) {
    System.out.println("Die zweite Bedingung ist wahr!");
} else {
    System.out.println("Keine der beiden Bedingungen ist wahr.");
}
```

Der oberste Block mit `if` muss verpflichtend existieren. Die Zweige mit `else if` und `else` sind optional. `if` und `else` dürfen nur ein einziges Mal auf der gleichen Ebene vorkommen. In der Mitte darf es beliebig viele `else if`-Abfragen geben.

if-Abfragen können auch geschachtelt werden.
```java
if (condition) {
    if (nestedCondition) {
        System.out.println("Die verschachtelte Bedingung ist wahr.");
    } else {
        System.out.println("Die verschachtelte Beding ist falsch.");
    }
} else {
    System.out.println("Die äußere Bedingung ist falsch.");
} 
```

Bedingungen besitzen den `boolean`-Datentyp, d.h. sie sind entweder `true` (wahr) oder `false` (unwahr). Sie können mit relationalen und logischen Operatoren definiert werden.

### Relationale Operatoren
Relationale Operatoren erlauben es, Variablen miteinander zu vergleichen und liefern als Ergebnis einen Wahrheitswert (boolean):

* equal to ("ist gleich"): ```==```
* not equal to: ("ist nicht gleich") ```!=```
* greater than ("größer als"): ```>```
* less than: ("kleiner als") ```<```
* greater than or equal to ("größer gleich"): ```>=```
* less than or equal to ("kleiner gleich"): ```<=```

**Beispiele:**
```java
3 == 4 // false
3 == 3 // true
3 != 4 // true
3 > 4 // false
3 < 4 // true
3 < 3 // false
3 <= 3 // true
```

### Logische Operatoren
Mit logischen Operatoren können Wahrheitswerte von Bedingungen umgekehrt (NOT) und zwei Wahrheitswerte kombiniert (AND, OR, XOR) werden:

* NOT: ```!``` ("kehre Wahrheitswert um")
* AND: ```&``` ("beide Bedingungen müssen wahr sein")
* OR:  ```|``` ("eine der beiden Bedingungen muss wahr sein, oder beide")
* XOR: ```^``` ("eine der beiden Bedingungen muss wahr sein, aber nicht beide")

**Beispiele für NOT:**
```java
!true // false
!false // true
!(3 == 4) // true (da 3 == 4 => false)
```

**Beispiele für AND, OR, XOR:**
```java
true & true // true
        true & false // false
        (3 < 4) & (10 > 5) // true
        (5 == 4) & true // false

        true | false // true
        false | false // false
        (3 < 4) | (900 >= 1000) // true
        false | (900 >= 1000) // false

        true ^ true // false
        true ^ false // true
        (3 < 4) | (900 <= 1000) // false
        (3 < 4) | (900 >= 1000) // true
```

### Wahrheitstabelle
Die folgende Wahrheitstabelle zeigt die verschiedenen Ergebnisse an, die erzielt werden können, wenn mit den Operatoren AND, OR und XOR zwei Bedingungen kombiniert werden.

| 1. Bedingung | 2. Bedingung | AND & | OR \| | XOR ^ |
|--------------|--------------|-------|-------|-------|
| True         | True         | True  | True  | False |
| True         | False        | False | True  | True  |
| False        | True         | False | True  | True  |
| False        | False        | False | False | False |

## switch-Statements
Durch switch-Statements lassen sich `if - else if - ... - else`-Verzweigungen kompakter darstellen.

### Aufbau eines switch-case Statement
```
switch (variable) {
    case A:
        // Code, der ausgeführt wird, wenn "variable" den Wert A hat.
        break // Break ist immer notwendig, damit nicht der Code aller folgenden Fälle zusätzlich ausgeführt wird.
    case B:
        // Code, der ausgeführt wird, wenn "variable" den Wert B hat.
        break
    default:
        // Code, in allen anderen Fällen ausgeführt wird. 
}
```

**Wichtig**: Die im `switch` auszuwertende Variable muss entweder ein primitiver Datentyp (`int`, `char`, `short`, `byte`, ...) oder `String` sein. Komplexe Datentypen können nicht ausgewertet werden.

Dass nach jedem Fall `break` angegeben werden muss, hat historische Gründe: Hier hat sich Java an der Programmiersprache C orientiert. Da diese Notwendigkeit heute oftmals als unintuitiv angesehen wird, stellt Java seit einigen Jahren eine kompaktere Alternative bereit.

### Alternative: switch-expressions
Seit Java 12 gibt es eine Alternative zum klassischen switch-case: *switch expressions*. Diese sind im Aufbau zu switch-case fast gleich. Lediglich die Fälle (cases) werden durch ein anderes Zeichen eingeleitet: `->` statt `:`.

```
switch (variable) {
    case A -> // Code, der ausgeführt wird, wenn "variable" den Wert A hat.
    case A -> // Code, der ausgeführt wird, wenn "variable" den Wert B hat.
    default -> // Code, in allen anderen Fällen ausgeführt wird. 
}
```

Hier muss das `break`-Schlüsselwort nicht mehr angegeben werden.