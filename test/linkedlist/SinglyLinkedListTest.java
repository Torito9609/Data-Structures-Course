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
    void newList_isEmptyAndZero(){
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
    void addFirstElementEmptyList(){
        list.addFirst(10);
        assertEquals(1, list.size());
        assertFalse(list.isEmpty());
        assertEquals(10, list.first());
        assertEquals(10, list.last());
        assertEquals(10, list.getAt(0));
        assertTrue(list.contains(10));
        assertEquals(0, list.indexOf(10));
        assertFalse(list.contains(99));
    }

    @Test
    void addLastElementEmptyList(){
        list.addLast(10);
        assertEquals(1, list.size());
        assertFalse(list.isEmpty());
        assertEquals(10, list.first());
        assertEquals(10, list.last());
        assertEquals(10, list.getAt(0));
        assertTrue(list.contains(10));
        assertEquals(0, list.indexOf(10));
        assertFalse(list.contains(99));
    }

}
