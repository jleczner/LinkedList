package leczner.jon.LinkedList;

/**
 * Created by jonathanleczner on 10/21/16.
 */
public class LinkedList { // for storing positive integers
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
        if (head == null) {
            return null;
        }
        Node toBeRemoved = null;
        if (index == 0) {
            toBeRemoved = head;
            if (head.next != null) {
                head = head.next;
            } else {
                head = null;
            }
        } else {
            int i = 0;
            Node current = head;
            while (++i != index) {
                if (current.next != null) {
                    current = current.next;
                } else {
                    return null;
                }
            }
            toBeRemoved = current.next;
            if (toBeRemoved.next != null) {
                current.next = toBeRemoved.next;
            } else {
                current.next = null;
            }
        }
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
        int size = 0;
        Node current = head;
        while (current != null) {
            size++;
            current = current.next;
        }
        return size;
    }

    public int get(int index) {
        int data = -1;
        if (index == 0) {
            return head.data;
        } else {
            int i = 0;
            Node current = head;

            while (++i != index) {
                if (current.next != null) {
                    current = current.next;
                } else {
                    return data;
                }
            }
            data = current.next.data;
        }
        return data;
    }

    public LinkedList copy() {
        return null;
    }

    public LinkedList sort() {
        return null;
    }

}
