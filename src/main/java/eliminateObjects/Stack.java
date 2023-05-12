package eliminateObjects;

import java.util.Arrays;
import java.util.EmptyStackException;

public class Stack {

    private Object[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    public Stack() {
        elements = new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public void push(Object e) {
        ensureCapacity();
        elements[size++] = e;
    }

    //There is a memory leak, because the obsolete references are not removed.
    public Object pop() {
        if (size == 0)
            throw new EmptyStackException();
        return elements[--size];
    }

    //The memory leak has been removed here, because the obsolete references are not nullified.
    public Object pop2() {
        if (size == 0)
            throw new EmptyStackException();
        Object o =  elements[--size];
        elements[size] = null;
        return o;
    }

    /**
     * Ensure space for at least one more element, roughly
     * doubling the capacity each time the array needs to grow.
     */
    private void ensureCapacity() {
        if (elements.length == size)
            elements = Arrays.copyOf(elements, 2 * size + 1);
    }

    public void displayElements(){
        System.out.println("==============================");
        for(int i = 0; i < elements.length; i++){
            System.out.println("Element #"+i+" = "+elements[i]);
        }
        System.out.println("==============================");
    }
}
