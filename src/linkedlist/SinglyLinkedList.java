package linkedlist;

import java.util.NoSuchElementException;
import java.util.Objects;

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
    public T getAt(int index) {
        if(index < 0 || index >= size) throw new RuntimeException("Indice invalido.");
        if(isEmpty()) throw new NoSuchElementException("La lista esta vacía.");

        Node<T> aux = head;
        for(int i = 0; i < index; i++){
            aux = aux.next;
        }
        return aux.value;
    }

    @Override
    public T setAt(int index, T value) {
        if(index < 0 || index >= size) throw new RuntimeException("Indice invalido.");

        Node<T> aux = head;
        for(int i = 0; i < index; i++){
            aux = aux.next;
        }
        T old = aux.value;
        aux.value = value;
        return old;
    }

    @Override
    public int indexOf(T value) {
        Node<T> aux = head;
        int index = 0;

        while(aux != null){
            if(Objects.equals(aux.value, value)) return index;
            aux = aux.next;
            index++;
        }
        return -1;
    }

    @Override
    public boolean contains(T value) {
        Node<T> aux = head;

        while(aux != null){
            if(Objects.equals(aux.value, value)) return true;
            aux = aux.next;
        }
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
    public void addAt(int index, T value) {
        if(index < 0 || index > size) throw  new RuntimeException("Indice invalido.");
        if(index == 0){
            addFirst(value);
            return;
        }
        else if(index == size) {
            addLast(value);
            return;
        }

        Node<T> newNode = new Node<T>(value);
        Node<T> aux = head;

        for(int i = 0; i < index - 1; i++){
            aux = aux.next;
        }
        newNode.next = aux.next;
        aux.next = newNode;
        size++;
    }

    @Override
    public T removeFirst() {
        if(isEmpty()) throw  new NoSuchElementException("La lista esta vacía.");
        T removed = head.value;
        if(size == 1){
            clear();
            return  removed;
        }
        head = head.next;
        size--;
        return removed;
    }

    @Override
    public T removeLast() {
        if(isEmpty()) throw new NoSuchElementException("La lista está vacía.");
        T removed = tail.value;
        if(size == 1){
            clear();
            return removed;
        }
        Node<T> aux = head;
        while(aux.next != tail){
            aux = aux.next;
        }
        tail = aux;
        tail.next = null;
        size--;
        return removed;
    }

    @Override
    public T removeAt(int index) {
        if(index < 0 || index >= size) throw new RuntimeException("Indice invalido.");
        if(index == 0){
            return removeFirst();
        }
        if(index == size - 1){
            return removeLast();
        }
        Node<T> aux = head;
        for(int i = 0; i < index; i++){
            aux = aux.next;
        }
        Node<T> deleted = aux.next;
        aux.next = deleted.next;
        size--;
        return deleted.value;
    }

    @Override
    public boolean remove(T value) {
        if(head == null) return false;

        if(Objects.equals(head.value, value)){
            head = head.next;
            size--;
            return true;
        }

        Node<T> aux = head;

        while(aux.next != null && !Objects.equals(aux.next.value, value)){
            aux = aux.next;
        }
        if(aux.next == null) return false;

        aux.next = aux.next.next;
        size--;
        return true;
    }

    @Override
    public T first() {
        return head.value;
    }

    @Override
    public T last() {
        return tail.value;
    }

    @Override
    public String toString(){

    }
}
