package course;

import java.util.ArrayList;

public class GenericMain2Demo {
    public static void main(String[] args) {
        ArrayList<Integer> inputIntegerList = new ArrayList<Integer>();
        inputIntegerList.add(8);
        inputIntegerList.add(13);
        inputIntegerList.add(21);
        inputIntegerList.add(34);

        ArrayList<String> inputStringList = new ArrayList<String>();
        inputStringList.add("Hallo!");
        inputStringList.add("Hello!");
        inputStringList.add("¡Hola!");
        inputStringList.add("Salut!");

        GenericListAnalyserDemo<Integer> integerGenericListAnalyserDemo = new GenericListAnalyserDemo<>(inputIntegerList);
        integerGenericListAnalyserDemo.printSize();
        integerGenericListAnalyserDemo.printFirstElement();
        integerGenericListAnalyserDemo.addElement(55);
        //integerGenericListAnalyserDemo.addElement("Ciao"); //Fehler!

        GenericListAnalyserDemo<String> stringGenericListAnalyserDemo = new GenericListAnalyserDemo<>(inputStringList);
        stringGenericListAnalyserDemo.printSize();
        stringGenericListAnalyserDemo.printFirstElement();
        stringGenericListAnalyserDemo.addElement("Ciao");
    }
}