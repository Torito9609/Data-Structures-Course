package linkedlist;

public interface LinkedList<T> {
    //state
    int size();
    boolean isEmpty();
    void clear();

    //access
    T get(int index);
    T set(int index, T value);
    int indexOf(T value);
    boolean contains(T value);

    //insert
    void addFirst(T value);
    void addLast(T value);
    void add(int index, T value);

    //delete
    T removeFirst();
    T removeLast();
    T remove(int index);
    boolean remove(T value);

    T first();
    T last();

}
