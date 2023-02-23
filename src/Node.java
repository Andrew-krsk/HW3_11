public class Node<E> {

    Node<E> next;
    E value;

    public Node(E value) {
        this.next = next;
        this.value = value;
    }

    public E getValue() {
        return value;
    }

    public Node<E> getNext() {
        return next;
    }

    public void setNext(Node<E> next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node:" + "value = " + value;
    }
}

