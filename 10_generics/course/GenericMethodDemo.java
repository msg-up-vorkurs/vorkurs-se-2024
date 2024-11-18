package course;

public class GenericMethodDemo {
    public int getFirstElementFromIntegerArray(Integer[] array) {
        return array[0];
    }

    public String getFirstElementFromStringArray(String[] array) {
        return array[0];
    }

    public <ElementType> ElementType getFirstElementFromArray(ElementType[] array) {
        return array[0];
    }
}