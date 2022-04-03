package binaryTree.recursive;

public class BinaryTree {
    Node root = null;

    public void insert (int i) {
        this.root = insert(this.root, i);
    }

    private Node insert (Node node, int i) {
        if (node == null)
            return new Node(i);
        else if (node.value < i)
            node.right = insert(node.right, i);
        else
            node.left = insert(node.left, i);

        return node;
    }

    public void preOrder(Node node) {
        if (node != null) {
            System.out.print(node.value);
            preOrder(node.left);
            preOrder(node.right);
        }
    }
}
