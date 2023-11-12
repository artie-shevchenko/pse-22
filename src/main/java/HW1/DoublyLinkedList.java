package HW1;

public class DoublyLinkedList<T> {
    private Node<T> head = null;
    private Node<T> tail = null;
    private int size = 0;

    public Node<T> addToFront(T entry) {
        Node<T> node = new Node<T>(entry);

        if (head == null) {
            head = node;
            tail = node;
        } else {
            node.setNext(head);
            head.setPrev(node);
            head = node;
        }

        size++;
        return node;
    }

    public void moveToFront(Node<T> node) {
        if (node == head) {
            return;
        }

        if (node == tail) {
            Node<T> prev = tail.getPrev();
            prev.setNext(null);
            head.setPrev(tail);
            tail.setNext(head);
            tail.setPrev(null);
            head = tail;
            tail = prev;
            return;
        }

        Node<T> prev = node.getPrev();
        Node<T> next = node.getNext();
        prev.setNext(next);
        next.setPrev(prev);
        head.setPrev(node);
        node.setPrev(null);
        node.setNext(head);
        head = node;
    }

    public Node<T> replaceValueAndMoveToFront(Node<T> node, T newValue) {
        node.setValue(newValue);
        moveToFront(node);
        return node;
    }

    public T deleteLast() {
        assert !isEmpty() : "The list is empty: cannot delete value";

        T deletedValue;

        if (head == tail) {
            deletedValue = head.getValue();
            head = null;
            tail = null;
        } else {
            deletedValue = tail.getValue();
            Node<T> prev = tail.getPrev();
            prev.setNext(null);
            tail = prev;
        }

        size--;
        return deletedValue;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int getSize() {
        return size;
    }
}
