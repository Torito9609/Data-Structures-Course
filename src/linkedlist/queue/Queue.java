package linkedlist.queue;

import linkedlist.LinkedList;
import linkedlist.SinglyLinkedList;

public class Queue<T> {
    private final LinkedList<T> list;

    public Queue(){
        this.list = new SinglyLinkedList<>();
    }
    public Queue(LinkedList<T> list) {
        if(list == null) throw new IllegalArgumentException("list no puede ser nulo.");
        this.list = list;
    }

    public void enqueue(T value){
        list.addLast(value);
    }

    public T dequeue(){
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
