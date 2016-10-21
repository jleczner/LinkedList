package leczner.jon.LinkedList;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jonathanleczner on 10/21/16.
 */
public class LinkedListTest {
    LinkedList linkedList;

    @Before
    public void setup() {
        linkedList = new LinkedList();
        linkedList.add(5);
        linkedList.add(4);
        linkedList.add(7);
    }

    @Test
    public void addTest() {
        assertTrue(linkedList.contains(5));
        assertTrue(linkedList.contains(7));
        assertTrue(linkedList.contains(4));
        assertEquals(3, linkedList.size());
    }

    @Test
    public void removeTest() {
        assertNotNull(linkedList.remove(0));
        assertTrue(linkedList.contains(7));
        assertTrue(linkedList.contains(4));
        assertFalse(linkedList.contains(5));
    }

    @Test
    public void removeMiddleTest() {
        linkedList.remove(1);
        assertTrue(linkedList.size() == 2);
        assertTrue(linkedList.contains(5));
        assertTrue(linkedList.contains(7));
        assertFalse(linkedList.contains(4));
    }

    @Test
    public void removeLastTest() {
        assertNotNull(linkedList.remove(2));
        assertTrue(linkedList.contains(5));
        assertTrue(linkedList.contains(4));
        assertFalse(linkedList.contains(7));
    }

    @Test
    public void removeFailTest() {
        linkedList.remove(0);
        linkedList.remove(1);
        linkedList.remove(0);
        assertNull(linkedList.remove(0));
    }

    @Test
    public void containsTest() {
        assertTrue(linkedList.contains(5));
        assertTrue(linkedList.contains(4));
        assertTrue(linkedList.contains(7));
    }

    @Test
    public void findTest() {
        assertEquals(0, linkedList.find(5));
        assertEquals(1, linkedList.find(4));
        assertEquals(2, linkedList.find(7));
        assertEquals(-1, linkedList.find(8));
    }

    @Test
    public void sizeTest() {
        assertEquals(3, linkedList.size());
    }

    @Test
    public void sizeZeroTest() {
        linkedList.remove(0);
        linkedList.remove(0);
        linkedList.remove(0);
        assertEquals(0, linkedList.size());
    }

    @Test
    public void getTest() {
        assertEquals(4, linkedList.get(1));
    }

    @Test
    public void copyTest() {
        LinkedList copy = linkedList.copy();
        assertEquals(copy.get(0), linkedList.get(0));
        assertEquals(copy.get(1), linkedList.get(1));
        assertEquals(copy.get(2), linkedList.get(2));
    }

    @Test
    public void sortTest() {
        LinkedList sorted = linkedList.sort();
        assertEquals(4, sorted.get(0));
        assertEquals(5, sorted.get(1));
        assertEquals(7, sorted.get(2));
    }
}
