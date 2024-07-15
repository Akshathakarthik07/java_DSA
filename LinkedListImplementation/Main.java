package LinkedListImplementation;

public class Main {
    public static void main(String args[]) throws Exception {
        LinkedListImplementation ll = new LinkedListImplementation();
        ll.addlast(10);
        ll.addlast(30);
        ll.addlast(40);
        ll.addlast(50);
        ll.addfirst(100);
        ll.addlast(40);
        ll.addfirst(20);
        ll.display();

        LinkedListImplementation.Node nodeAt = ll.getNodeAt(1);
        System.out.println(nodeAt.data);
        int dataAt = ll.getAt(2);
        System.out.println(dataAt);
        ll.removefirst();
        ll.display();
        ll.removelast();
        ll.display();
        ll.removeat(2);
        ll.display();
    }
}
