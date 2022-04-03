package binaryTree.loop;
import binaryTree.recursive.Node;

import java.util.Objects;

public class BinaryTree {
    Node root = null;

    public void insert (int i) {
        if (this.root == null) {
            this.root = new Node(i);
            return;
        }

        Node current = this.root;
        while (true) {
            if (i <= current.value) {
                if (current.left != null)
                    current = current.left;
                else {
                    current.left = new Node(i);
                    return;
                }
            } else {
                if (current.right != null)
                    current = current.right;
                else {
                    current.right = new Node(i);
                    return;
                }
            }
        }
    }

    public Node find(int i) {
        Node current = this.root;
        try {
            while (Objects.nonNull(current)) {
                if (current.value == i)
                    return current;
                else if (i < current.value)
                    current = current.left;
                else
                    current = current.right;
            }
        } catch (NullPointerException ignored) {}
        return new Node(999);
    }

    public void preOrder(Node n) {
        if (n != null) {
            System.out.print(n.value);
            preOrder(n.left);
            preOrder(n.right);
        }
    }

    public void postOrder(Node n) {
        if (n != null) {
            postOrder(n.left);
            postOrder(n.right);
            System.out.print(n.value);
        }
    }

    public  void inOrder(Node n) {
        if (n != null) {
            inOrder(n.left);
            System.out.print(n.value);
            inOrder(n.right);
        }
    }
    public static void main (String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.insert(5);
        bt.insert(4);
        bt.insert(6);
        bt.insert(7);
        bt.insert(1);

        System.out.println(bt.find(9).value);
    }
}
