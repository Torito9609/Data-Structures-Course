package linkedlist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SinglyLinkedListTest {
    LinkedList<Integer> list;

    @BeforeEach
    void createEmptyList(){
        list = new SinglyLinkedList<>();
    }

    @Test
    void newListIsEmptyAndZeroTest(){
        assertEquals(0,list.size());
        assertTrue(list.isEmpty());
        assertFalse(list.contains(0));
        assertEquals(-1, list.indexOf(0));
        assertFalse(list.remove(0));
        list.clear();
        assertEquals(0,list.size());
        assertTrue(list.isEmpty());
        assertFalse(list.contains(0));
        assertEquals(-1, list.indexOf(0));
        assertFalse(list.remove(0));
    }

    @Test
    void addFirstElementEmptyListTest(){
        list.addFirst(10);
        assertEquals(1, list.size());
        assertFalse(list.isEmpty());
        assertEquals(10, list.first());
        assertEquals(10, list.last());
        assertEquals(10, list.getAt(0));
        assertTrue(list.contains(10));
        assertEquals(0, list.indexOf(10));
        assertFalse(list.contains(99));
        int x = list.removeLast();
        assertEquals(10, x);
        assertEquals(0, list.size());
        assertTrue(list.isEmpty());
    }

    @Test
    void addLastElementEmptyListTest(){
        list.addLast(10);
        assertEquals(1, list.size());
        assertFalse(list.isEmpty());
        assertEquals(10, list.first());
        assertEquals(10, list.last());
        assertEquals(10, list.getAt(0));
        assertTrue(list.contains(10));
        assertEquals(0, list.indexOf(10));
        assertFalse(list.contains(99));
        int x = list.removeFirst();
        assertEquals(10, x);
        assertEquals(0, list.size());
        assertTrue(list.isEmpty());
    }

    @Test
    void addAtTest(){
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(5);
        list.addLast(6);

        list.addAt(3, 4);

        assertEquals(6, list.size());
        assertEquals(1, list.getAt(0));
        assertEquals(2, list.getAt(1));
        assertEquals(3, list.getAt(2));
        assertEquals(4, list.getAt(3));
        assertEquals(5, list.getAt(4));
        assertEquals(6, list.getAt(5));

        assertEquals(1, list.first());
        assertEquals(6, list.last());
        assertEquals(3, list.indexOf(4));
        assertTrue(list.contains(4));
    }
    
}
