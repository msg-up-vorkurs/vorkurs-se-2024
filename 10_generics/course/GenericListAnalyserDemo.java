package course;

import java.util.ArrayList;

public class GenericListAnalyserDemo<T> {

    private ArrayList<T> elements;

    public GenericListAnalyserDemo(ArrayList<T> elements) {
        this.elements = elements;
    }

    public void printSize() {
        System.out.println("Die Liste enthält aktuell " + this.elements.size() + " Elemente");
    }

    public void printFirstElement() {
        System.out.println("Der erste Eintrag der Liste ist: " + this.elements.get(0));
    }

    public void addElement(T newElement) {
        this.elements.add(newElement);
        System.out.println("Der Liste wurde das neue Element " + newElement + " hinzugefügt.");
        this.printSize();
    }
}
