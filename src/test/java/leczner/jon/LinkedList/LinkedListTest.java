package leczner.jon.LinkedList;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * Created by jonathanleczner on 10/21/16.
 */
public class LinkedListTest {
    LinkedList linkedList;

    @Before
    public void setup() {
        linkedList = new LinkedList();
    }

    @Test
    public void addTest() {
        linkedList.add(5);
        assertNotNull(linkedList.getHead());
    }

    @Test
    public void removeTest() {

    }

    @Test
    public void containsTest() {

    }

    @Test
    public void findTest() {

    }

    @Test
    public void sizeTest() {

    }

    @Test
    public void getTest() {

    }

    @Test
    public void copyTest() {

    }

    @Test
    public void sortTest() {

    }
}
