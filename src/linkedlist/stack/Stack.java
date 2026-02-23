package linkedlist.stack;

import linkedlist.LinkedList;
import linkedlist.SinglyLinkedList;

public class Stack<T> {
    private final LinkedList<T> list;

    public Stack(){
        this.list = new SinglyLinkedList<T>();
    }

    public Stack(LinkedList<T> list) {
        if(list == null) throw new IllegalArgumentException("list no puede ser nulo.");
        this.list = list;
    }

    public void push(T value){
        list.addFirst(value);
    }

    public T pop(){
        return list.removeFirst();
    }

    public T peek(){
        return list.first();
    }

    public int size(){
        return list.size();
    }

    public boolean isEmpty(){
        return list.isEmpty();
    }

    public void clear(){
        list.clear();
    }

    @Override
    public String toString(){
        return list.toString();
    }
}
