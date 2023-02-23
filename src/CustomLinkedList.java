import java.util.Iterator;

public class CustomLinkedList<E> implements Iterable<E> {
    private Node<E> head;
    private Node<E> tail;
    private int size;

    public void addAtFirst(E val) {
        Node<E> temp = new Node<>(val);
        temp.next = head;
        head = temp;

        if (tail == null) {
            tail = temp;
        }
        size++;
    }

    public void addAtLast(E val) {
        if (tail == null) {
            addAtFirst(val);
            return;
        }

        Node<E> temp = new Node<>(val);
        tail.next = temp;
        tail = temp;
        size++;
    }

    public int getSize() {
        return size;
    }

    public Node<E> getHead() {
        return head;
    }

    public Node<E> getTail() {
        return tail;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        Node<E> temp = head;
        while (temp != null) {
            builder.append(temp.value).append(" ");
            temp = temp.next;
        }
        return builder.toString();
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

}
