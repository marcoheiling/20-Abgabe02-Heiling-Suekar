package at.fhj.iit;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;


/**
 * A self made implementation of a Queue which accepts all types (generic)
 * uses a ArrayList to store the elements
 * @param <T> type of the Queue
 */
public class GenericQueue<T> implements IQueue<T>{

    private List<T> elements = new ArrayList<>();
    private int maxSize;

    // we didn't add JavaDoc comments because all method are described in the Interface

    public GenericQueue(int maxSize) {
        this.maxSize = maxSize;
    }

    @Override
    public boolean offer(T obj) {
        if (elements.size() != maxSize)
            elements.add(obj);
        else
            return false;

        return true;
    }
    @Override
    public T poll() {
        T element = peek();

        if (elements.size() != 0) {
            elements.remove(0);
        }

        return element;
    }

    @Override
    public T remove() {
        T element = poll();

        if (element == null)
            throw new NoSuchElementException("there's no element any more");

        return element;
    }

    @Override
    public T peek() {
        T element;
        if (elements.size() > 0)
            element = elements.get(0);
        else
            element = null;

        return element;
    }

    @Override
    public T element() {
        T element = peek();
        if (element == null)
            throw new NoSuchElementException("there's no element any more");

        return element;
    }
}
