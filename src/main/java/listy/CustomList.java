package listy;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class CustomList<T> implements Iterable<T> {
    private static final int DEFAULT_CAPACITY = 10;
    private int size = 0;
    private Object[] elements;

    public CustomList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public void add(T e) {
        if(size == elements.length) {
            resizeArr();
        }
        elements[size ++] = e;
    }

    public T get(int index) {
        if(index >= size || index < 0) throw new IndexOutOfBoundsException("Invalid index");
        return (T) elements[index];
    }

    private void resizeArr() {
        elements = Arrays.copyOf(elements, size + (DEFAULT_CAPACITY * 2));
    }

    @Override
    public Iterator<T> iterator() {
        return new ListIterator();
    }

    @Override
    public void forEach(Consumer<? super T> action) {

    }

    @Override
    public Spliterator<T> spliterator() {
        return null;
    }

    private class ListIterator implements Iterator<T> {
        int index = 0;
        @Override
        public boolean hasNext() {
            return index < size;
        }

        @Override
        public T next() {
            return (T)elements[index++];
        }

        @Override
        public void remove() {

        }

        @Override
        public void forEachRemaining(Consumer<? super T> action) {

        }
    }
}
