package LinkedListImplementation;

public class LinkedListImplementation {
    public class Node {
        int data;
        Node next;
    }

    public Node head;
    public Node tail;
    public int size = 0;

    public void addlast(int item) {
        Node nn = new Node();
        nn.data = item;
        nn.next = null;

        if (this.size == 0) {
            this.head = nn;
            this.tail = nn;
        } else {
            this.tail.next = nn;
            this.tail = nn;
        }
        this.size++;
    }

    public void addfirst(int item) {
        Node nn = new Node();
        nn.data = item;
        nn.next = null;

        if (this.size >= 1) {
            nn.next = this.head;
            this.head = nn;
        } else {
            this.head = nn;
            this.tail = nn;
        }
        this.size++;
    }

    public void display() {
        Node temp = this.head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public Node getNodeAt(int idx) throws Exception {
        if (this.size == 0)
            throw new Exception("Linked list is empty");
        if (idx < 0 || idx >= this.size)
            throw new Exception("Invalid index");

        Node temp = this.head;
        for (int i = 0; i < idx; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public int getAt(int idx) throws Exception {
        return getNodeAt(idx).data;
    }

    public void removefirst() throws Exception {
        if (this.size == 0) {
            throw new Exception("Linked list is empty");
        }
        if (this.size == 1) {
            this.head = null;
            this.tail = null;
        } else {
            this.head = this.head.next;
        }
        this.size--;
    }

    public void removelast() throws Exception {
        if (this.size == 0) {
            throw new Exception("Linked list is empty");
        }
        if (this.size == 1) {
            this.head = null;
            this.tail = null;
            this.size = 0;
        } else {
            Node sizem2 = getNodeAt(this.size - 2);
            this.tail = sizem2;
            this.tail.next = null;
            this.size--;
        }
    }

    public void removeat(int idx) throws Exception {
        if (this.size == 0) {
            throw new Exception("Linked list is empty");
        }
        if (idx < 0 || idx >= this.size) {
            throw new Exception("Invalid index");
        }
        if (idx == 0) {
            removefirst();
        } else if (idx == this.size - 1) {
            removelast();
        } else {
            Node nm1 = getNodeAt(idx - 1);
            nm1.next = nm1.next.next;
            this.size--;
        }
    }
}
