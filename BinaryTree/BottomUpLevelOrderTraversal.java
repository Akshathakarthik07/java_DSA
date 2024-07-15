package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BottomUpLevelOrderTraversal {
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static void reverseLevelOrder(Node root) {
        if (root == null) {
            return;
        }

        Queue<Node> q = new LinkedList<>();
        Stack<Node> s = new Stack<>();
        q.add(root);

        while (!q.isEmpty()) {

            Node currentNode = q.poll();
            s.push(currentNode);

            if (currentNode.right != null) {
                q.add(currentNode.right);
            }

            if (currentNode.left != null) {
                q.add(currentNode.left);
            }
        }

        while (!s.isEmpty()) {
            Node node = s.pop();
            System.out.print(node.data + " ");
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);
        root.left.left.left = new Node(7);
        root.right.right.right = new Node(8);
        reverseLevelOrder(root);
    }
}
