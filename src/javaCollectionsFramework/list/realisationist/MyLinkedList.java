package javaCollectionsFramework.list.realisationist;

public class MyLinkedList {

    private Node head;
    private int size;

    public void add(int value) {
        // If this is the first addition to the list
        if (head == null) {
            this.head = new Node(value);
        } else {

        }

        size++;
    }

    private static class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

}
