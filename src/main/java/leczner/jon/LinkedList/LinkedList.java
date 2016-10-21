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
        Node toBeAdded = new Node(data);
        if (head != null) {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = toBeAdded;
        } else {
            head = toBeAdded;
        }
    }

    public Node remove(int index) {
        int i = -1;
        Node current = head;
        while (++i != index) {
            if (current.next != null) {
                current = current.next;
            } else {
                return null;
            }
        }
        Node toBeRemoved = current.next;
        current.next = null;
        return toBeRemoved;
    }

    public boolean contains(int element) {
        boolean isContained = false;
        if (find(element) != -1) {
            isContained = true;
        }
        return isContained;
    }

    public int find(int element) {
        int foundIndex = -1;
        int currentIndex = 0;
        Node current = head;

        while (current != null) {
            if (current.data == element) {
                foundIndex = currentIndex;
            }
            current = current.next;
            currentIndex++;
        }
        return foundIndex;
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
