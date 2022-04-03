package binaryTree.recursive;

public class Main {
    public static void main (String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.insert(5);
        bt.insert(4);
        bt.insert(6);
        bt.insert(7);
        bt.insert(1);

        bt.preOrder(bt.root);
    }
}
