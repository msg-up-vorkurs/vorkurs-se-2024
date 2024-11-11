# Cheatsheet Arrays und Schleifen

## Arrays
Arrays sind Datenstrukturen einer vordefinierten (festen) Anzahl von Objekten des gleichen Datentyps.

### String-Array erstellen
```java
String[] seats = {"Alice", "Fred", "Chris", "Daniel", "Bob"};
```

### Auf das erste Element im Array zugreifen
```java
String driver = seats[0];
```

### Anzahl der Elemente des Arrays ermitteln
```java
int seatsCount = seats.length;
```

## Schleifen
Schleifen erlauben das mehrmalige Ausführen der gleichen Befehle.

### for-Schleife
for-Schleifen sind mit einem Zähler ausgestattet. Sie prüfen zuerst eine Bedingung, führen dann den gegebenen Code aus und erhöhen/verringern dann den Zähler um den vorgegebenen Wert.
```java
for (int i = 0; i < accounts.length; i++) {
    accounts[i].printInfo();
}
```

### for-each-Schleife
for-each-Schleifen führen den gegebenen Code für jedes Element eines Arrays einmal aus.
```java
for (BankAccount account : accounts) {
    account.printInfo();
}
```

### while-Schleife
while-Schleifen prüfen zuerst eine Bedingung und führen dann den gegebenen Code aus, solange die Bedingung erfüllt ist (`true`).
```java
while (account.balance < 10000) {
    account.balance = account.balance+1000;
}
```
### do-while-Schleife
while-Schleifen führen den gegebenen Code aus und prüfen dann anhand einer Bedingung (Prüfung auf `true`), ob weitere Durchläufe gestartet werden sollen.
```java
do {
    account.balance = account.balance + 1000;
} while (account.balance < 10000);
```
