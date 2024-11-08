# Scopes in Java
In Java gibt es mehrere Abstraktionsebenen, auf denen wir Variablen deklarieren können. Diese Ebenen werden "Scopes" genannt. Sie haben Auswirkungen darauf, auf welche Variablen wir in verschiedenen Teilen unseres Codes zugreifen können. Auf eine Variable kann immer nur dann zugegriffen werden, wenn diese sich innerhalb des aktuellen Scopes befindet.

Variablen können auf den folgenden Scope-Typen deklariert werden:

## Class-Level Scope
```
class Scope {
    int x = 10; <- Deklaration auf Klassenebene
  
    void method() {
        System.out.println(x); // -> "10"
    }
}
```

* Variablen werden als Eigenschaften von Instanzen einer Klasse definiert.
* Zugriff ist von überall innerhalb der Klasse möglich (in Konstruktoren & Methoden).
## Method-Level Scope
```
class Scope {  
    void method() {
        String x = "20"; // <- Deklaration auf Methodenebene
        System.out.println(x); // -> "20"
    }
}
```

und

```
class Scope {  
    void method(String x) { // <- Variable als Parameter der Methode
        System.out.println(x); // -> "30"
    }
    
    public static void main(String[] args) {
        Scope s = new Scope();
        s.method("30");
    }
}
```

* Variablen werden innerhalb einer Methode (oder als Parameter) deklariert. Diese sind nur innerhalb dieser Methode sichtbar.
* **"lokale Variablen"**
* Andere Methoden, Konstruktoren und Klassen können nicht auf diese Variablen zugreifen!

## Block-Level Scope
```
class Scope {
    void method() {
      int x = 1; // <- Deklaration auf Methodenebene
      
      {
          int y = 2; // <- Deklaration auf Blockebene
          
          System.out.println(x) // -> "1"
          System.out.println(y) // -> "2"
      }
      
      System.out.println(x) // -> "1"
      System.out.println(y) // -> FEHLER!
    }
}
```

* Variablen werden innerhalb eines Codeblocks (`{}`) definiert.
* Diese sind nur innerhalb dieses Codeblocks (und ggf. darin verschachtelten Blocks) sichtbar.
* Rümpfe von if & switch Statements sind Codeblöcke!

## Besonderheit: Shadowing
Variablen, die im Class-Scope definiert werden, können durch gleichnamige Variablen, welche im Method-Level bzw. Block-Level deklariert sind, "versteckt" (engl. "shadowed") werden.

```
class Scope {  
    String x = "10";
    
    void method() {
        String x = "20";
        System.out.println(x); // -> "20"
    }
}
```

Im oberen Beispiel wird innerhalb der Methode auf `x` zugegriffen. `x` ist sowohl im Class-Scope, als auch im Method-Level Scope deklariert. Das Method-Level (und im Allgemeinen auch Block-Level) Scope hat bei der Auswertung Vorrang. Entsprechend wird `20` statt `10` ausgegeben.

Auf die Klassenvariable `x` mit Wert `10` kann weiterhin zugegriffen werden. Dafür ist jedoch das Schlüsselwort `this` notwendig, um Java explizit anzuweisen, dass die Instanzvariable gemeint ist:

```
class Scope {  
    String x = "10";
    
    void method() {
        String x = "20";
        System.out.println(this.x); // -> "10"
    }
}
```