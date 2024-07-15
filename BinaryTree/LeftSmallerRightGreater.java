package BinaryTree;

public class LeftSmallerRightGreater {
    class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public Node buildBST(int[] nodes, int start, int end) {
        if (start > end) {
            return null;
        }
        if (start == end) {
            return new Node(nodes[start]);
        }

        int mid = (end + start) / 2;
        Node root = new Node(nodes[mid]);
        root.left = buildBST(nodes, start, mid - 1);
        root.right = buildBST(nodes, mid + 1, end);
        return root;
    }

    public static void main(String[] args) {
        int[] nodes = {10, 20, 30, 40, 50, 60, 70};
        LeftSmallerRightGreater tree = new LeftSmallerRightGreater();
        Node root = tree.buildBST(nodes, 0, nodes.length - 1);

        if (root != null) {
            System.out.println(root.left.left.data);
        } else {
            System.out.println("Tree is empty");
        }
    }
}
