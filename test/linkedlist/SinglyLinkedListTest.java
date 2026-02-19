package linkedlist;

import org.junit.jupiter.api.AfterAll;
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
}
