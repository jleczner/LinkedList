package leczner.jon.LinkedList;

/**
 * Created by jonathanleczner on 10/21/16.
 */
public class LinkedList {
    private Node head;

    public LinkedList() {}

    private class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public Node getHead() {
        return head;
    }

    public void add(int data) {
        return;
    }

    public Node remove(int index) {
        return null;
    }

    public boolean contains(int element) {
        return false;
    }

    public int find(int element) {
        return -1;
    }

    public int size() {
        return -1;
    }

    public int get(int index) {
        return -1;
    }

    public LinkedList copy() {
        return null;
    }

    public LinkedList sort() {
        return null;
    }

}
