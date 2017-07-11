public class IntLinkedList {
    private Node head;

    public void append(int value) {
        Node temp = new Node(value);
        Node current = head;

        if (head == null) {
            // Set head element for the list only in case of 1st element
            head = temp;
        } else {
            // Starting at the head node, crawl to the end of the list and then add element after last node
            while (current.getNext() != null) {
                current = current.getNext();
            }

            // The last node of the list is our new node now
            current.setNext(temp);
        }
    }

    public void removeTail() {
        if (head == null) { // In the case of empty list
            return;
        } else if (head.getNext() == null) { // In the case the list has only 1 element
            head = null;
        } else {
            Node current = head;
            // Retrieve the second last node of the list
            while (current.getNext().getNext() != null) {
                current = current.getNext();
            }

            // The second last node becomes the last node
            current.setNext(null);
        }
    }

    public int size() {
        int size = 0;
        if (head == null) {
            return size;
        }

        Node current = head;
        while (current.getNext() != null) {
            current = current.getNext();
            size++;
        }

        return ++size;
    }

    public void removeAllIfGreater(int value) {
        if (head == null) {
            return;
        }

        while (head.getValue() > value) { // If match on first element
            head = head.getNext();
            if (head == null) {
                return;
            }
        }

        Node current = head;
        while (current.getNext() != null) { // If next node exists
            if (current.getNext().getValue() > value) { // If match at next value
                current.setNext(current.getNext().getNext());
            } else { // If not a match
                current = current.getNext(); // move to next element
            }
        }
    }

    private class Node {
        private Node next;
        private int value;

        public Node(int value) {
            this.setValue(value);
            this.setNext(null);
        }

        public int getValue() {
            return this.value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public Node getNext() {
            return this.next;
        }

        public void setNext(Node nextNode) {
            this.next = nextNode;
        }
    }
}