package linkedlist;

public class DoublyLinkedList<T> implements LinkedList<T> {
    private static class Node<T>{
        T value;
        Node<T> next, prev;
        public Node (T value){
            this.value = value;
        }
    }

    private int size;
    private Node<T> head;
    private Node<T> tail;

    public DoublyLinkedList(){
        head = null;
        tail = null;
        size = 0;
    }
    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }

    @Override
    public T getAt(int index) {
        return null;
    }

    @Override
    public T setAt(int index, T value) {
        return null;
    }

    @Override
    public int indexOf(T value) {
        return 0;
    }

    @Override
    public boolean contains(T value) {
        return false;
    }

    @Override
    public void addFirst(T value) {
        Node<T> newNode = new Node<>(value);
        if(isEmpty()){
            newNode.prev = null;
            newNode.next = null;
            head = newNode;
            tail = newNode;
            size++;
            return;
        }
        Node<T> oldHead = head;
        newNode.next = oldHead;
        newNode.prev = null;
        oldHead.prev = newNode;
        head = newNode;
        size++;
    }

    @Override
    public void addLast(T value) {
        Node<T> newNode = new Node<>(value);
        if(isEmpty()){
            newNode.prev = null;
            newNode.next = null;
            head = newNode;
            tail = newNode;
            size++;
            return;
        }
        Node<T> oldTail = tail;
        newNode.next = null;
        newNode.prev = oldTail;
        oldTail.next = newNode;
        tail = newNode;
        size++;
    }

    @Override
    public void addAt(int index, T value) {

    }

    @Override
    public T removeFirst() {
        return null;
    }

    @Override
    public T removeLast() {
        return null;
    }

    @Override
    public T removeAt(int index) {
        return null;
    }

    @Override
    public boolean remove(T value) {
        return false;
    }

    @Override
    public T first() {
        return null;
    }

    @Override
    public T last() {
        return null;
    }
}
