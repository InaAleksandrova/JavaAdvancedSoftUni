package workshop;

public class SmartArray {
    private static final int INITIAL_CAPACITY = 4;
    private int[] elements;
    private int size;

    public SmartArray() {
        this.elements = new int[INITIAL_CAPACITY];
        this.size = 0;
    }

    public void add(int element) {
        if (this.size == this.elements.length) {
            this.elements = grow();
        }
        this.elements[this.size] = element;
        this.size++;
    }

    private int[] grow() {
        int[] newElements = new int[this.size + 1];
        for (int i = 0; i < this.elements.length; i++) {
            newElements[i] = this.elements[i];
        }
        return newElements;
    }
}
