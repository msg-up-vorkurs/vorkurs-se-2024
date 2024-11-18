# Generische Klassen: Generics

Um für unterschiedliche Datentypen nicht immer wieder neue Klassen mit nahezu ähnlichem Funktionsumfang implementieren
zu müssen, stellt Java die Möglichkeit bereit, Klassen mit "Typ-Parametern" zu versehen.
Der/die Typ-Parameter können innerhalb der Klasse als Datentyp verwendet werden, ohne dessen konkrete Ausprägung zu
kennen.

Durch welchen Datentyp dieser Typ-Parameter ersetzt werden soll, wird erst bei der Instantiierung der Klasse festgelegt. 

## Beispiel

## Implementierung einer Klasse mit Typ-Parameter '\<ElementType\>'

```java
public class LinkedList<ElementType> {
    
    private LinkedListElement<ElementType> first;

    public LinkedList(ElementType firstValue){
        this.first = new LinkedListElement<>(firstValue);
    }

    void add(ElementType value){
        this.first = new GenericLinkedListElement<>(value, this.first);
    }

    void print(){
        LinkedListElement<ElementType> current = first;
        System.out.println(current.getValue());

        while (current.hasNext()){
            current = current.getNext();
            System.out.println(current.getValue());
        }
    }
}
```

## Instantiierung einer Klasse mit Typ-Parameter

```java
LinkedList<String> namesList = new LinkedList<>("Anna");
namesList.add("Bob");
namesList.add("Chris");
namesList.print();

LinkedList<Integer> paymentsList = new LinkedList<>(500);
paymentsList.add(-300);
paymentsList.add(800);
paymentsList.print();
```