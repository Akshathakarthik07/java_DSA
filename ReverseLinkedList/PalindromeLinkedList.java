package ReverseLinkedList;
import java.util.Stack;

public class PalindromeLinkedList {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
        public static boolean isPalindrome(Node head) {
            Stack<Integer> st = new Stack<>();
            Node temp = head;
            while (temp != null) {
                st.push(temp.data);
                temp = temp.next;
            }
            temp = head;
            while (temp != null) {
                if (temp.data != st.peek()) {
                    return false;
                }
                st.pop();
                temp = temp.next;

            }
            return true;
        }

            public static void printLinkedList(Node head){
                Node temp = head;
                while (temp != null) {
                    System.out.println(temp.data + "->");
                    temp = temp.next;
                }
                System.out.println();
            }

        public static void main(String args[]) {
            Node head = new Node(1);
            head.next = new Node(2);
            head.next.next = new Node(5);
            head.next.next.next = new Node(2);
            head.next.next.next.next = new Node(1);
            System.out.print("original LinkedList");
            printLinkedList(head);
            if(isPalindrome(head)){
                System.out.println("palindrome");
            }
            else{
                System.out.println("not Palindrome");
            }
        }
    }
