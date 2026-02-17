package linkedlist;

import java.util.NoSuchElementException;

public class SinglyLinkedList<T> implements LinkedList<T>{
    private Node<T> head;
    private Node<T> tail;
    private int size;

    public  SinglyLinkedList(){
        size = 0;
        head = null;
        tail = null;
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
    public T get(int index) {
        return null;
    }

    @Override
    public T set(int index, T value) {
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
        Node<T> newNode = new Node<T>(value);
        if(isEmpty()){
            head = newNode;
            tail = newNode;
            size++;
            return;
        }
        newNode.next = head;
        head = newNode;
        size++;
    }

    @Override
    public void addLast(T value) {
        Node<T> newNode = new Node<T>(value);
        if(isEmpty()){
            head = newNode;
            tail = newNode;
            size++;
            return;
        }
        tail.next = newNode;
        tail = newNode;
        size++;
    }

    @Override
    public void add(int index, T value) {

    }

    @Override
    public T removeFirst() {
        if(isEmpty()) throw  new NoSuchElementException("La lista esta vacía.");
        T removed = head.value;
        if(size == 1){
            clear();gi
            return  removed;
        }
        head = head.next;
        size--;
        return removed;
    }

    @Override
    public T removeLast() {
        return null;
    }

    @Override
    public T remove(int index) {
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
