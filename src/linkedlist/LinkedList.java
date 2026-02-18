package linkedlist;

public interface LinkedList<T> {
    //state
    int size();
    boolean isEmpty();
    void clear();

    //access
    T getAt(int index);
    T setAt(int index, T value);
    int indexOf(T value);
    boolean contains(T value);

    //insert
    void addFirst(T value);
    void addLast(T value);
    void addAt(int index, T value);

    //delete
    T removeFirst();
    T removeLast();
    T removeAt(int index);
    boolean remove(T value);

    T first();
    T last();

}
