# 2D-Arrays

## Deklaration und Initialisierung


```java
int[][] twoDimArray = new int[2][3];

int[0] = {0, 1, 2};
int[1] = {3, 4, 5};
```

Oder mit der Abkürzung:
```java
int[][] twoDimArray = {
        {0, 1, 2},
        {3, 4, 5}
};
```

## Zugriff auf die Elemente

```java 
int[] firstRow = twoDimArray[0];
int[] secondRow = twoDimArray[1];

int firstElementInFirstRow = firstRow[0];
int secondElementInFirstRow = firstRow[1];
```

Man kann auch direkt auf einzelne Element in dem 2D-Array zugreifen.

```java 
int firstElementInFirstRow = twoDimArray[0][0];
int secondElementInFirstRow = twoDimArray[0][1];

int firstElementInSecondRow = twoDimArray[1][0];
int secondElementInSecondRow = twoDimArray[1][1];
```

## Wertzuweisung

Man kann dem 2D-Array ganze Zeilen neu zuweisen.
Wir weisen der ersten Zeile das neue Array mit den Werten [6, 7, 8] zu.
```java
twoDimArray[0] = {6, 7, 8};
```

Es können aber auch einzelne Werte neu zugewiesen werden.
```java 
twoDimArray[0][0] = 6;
twoDimArray[0][1] = 7;
twoDimArray[0][2] = 8;
```

## Iterieren über 2D-Arrays

### foreach-Schleife

Mit der äußeren foreach-Schleife iterieren wir über jede Zeile in dem 2D-Array.<br> 
Mit der inneren foreach-Schleife iterieren wir über die einzelnen Elemente in den einzelnen Zeilen.
```java 
for (int[] row : twoDimArray) {
    for (int element : row) {
        System.out.println(element);
    }
}
```

### for-Schleife

Mit der äußeren for-Schleife iterieren wir über alle Indizes des 2D-Arrays in der ersten Dimension.<br>
Mit der inneren for-Schleife iterieren wir über alle Indizes des 2D-Arrays an der Stelle i, in der zeiten Dimension 
```java 
for (int i = 0; i < twoDimArray.length; i++) {
    for (int j = 0; j < twoDimArray[i].length; j++) {
        System.out.println(twoDimArray[i][j]);
    }
}
```