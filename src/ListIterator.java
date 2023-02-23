import java.util.Iterator;

public class ListIterator<E> implements Iterator<E> {

    Node<E> current;

    public ListIterator(CustomLinkedList<E> ts) {
        current = ts.getHead();
    }

    @Override
    public boolean hasNext() {
        return current != null;
    }

    @Override
    public E next() {
        E value = current.getValue();
        current = current.getNext();
        return value;
    }
}
