package linkedlist;

import java.util.NoSuchElementException;

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
        if(index < 0 || index >= size) throw new RuntimeException("Indice inválido");
        if(index == 0) return head.value;
        if(index == size-1) return tail.value;
        Node<T> aux;
        if(index < size/2) {
            aux = head;
            for (int i = 0; i < index; i++) {
                aux = aux.next;
            }
        }
        else {
            aux = tail;
            for(int i = size-1; i > index; i--){
                aux = aux.prev;
            }
        }
        return aux.value;
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
        if(isEmpty()) throw new NoSuchElementException("La lista esta vacía.");
        Node<T> deleted = head;
        if(size == 1){
            clear();
            return deleted.value;
        }
        head = head.next;
        head.prev = null;
        size--;
        deleted.next = null;
        return deleted.value;
    }

    @Override
    public T removeLast() {
        if(isEmpty()) throw new NoSuchElementException("La lista esta vacía.");
        Node<T> deleted = tail;
        if(size == 1){
            clear();
            return deleted.value;
        }
        tail = tail.prev;
        tail.next = null;
        size--;
        deleted.prev = null;
        return deleted.value;
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
        if(isEmpty()) throw new NoSuchElementException("La lista está vacía.");
        return head.value;
    }

    @Override
    public T last() {
        if(isEmpty()) throw new NoSuchElementException("La lista está vacía.");
        return tail.value;
    }
}
