package idk;

public class Lab7Problem10_5 {
	
    private int[] elements;
    private int size;

    public Lab7Problem10_5() {
        this(16);
    }

    public Lab7Problem10_5(int capacity) {
        elements = new int[capacity];
    }

    public int push(int value) {
        if (size >= elements.length) {
            int[] temp = new int[elements.length * 2];
            System.arraycopy(elements, 0, temp, 0, elements.length);
            elements = temp;
        }

        return elements[size++] = value;
    }

    public int pop() {
        return elements[--size];
    }

    public int peek() {
        return elements[size - 1];
    }

    public boolean empty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }
}
