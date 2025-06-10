package Bhanu128;
import java.util.*;

public class BinaryTreeExampleTask {

    static class Node {
        String data;
        Node left, right;

        Node(String data) {
            this.data = data;
            left = right = null;
        }
    }
    static int countNodes(Node root) {
        if (root == null)
            return 0;
        return 1 + countNodes(root.left) + countNodes(root.right);
    }
    static int countLeafNodes(Node root) {
        if (root == null)
            return 0;
        if (root.left == null && root.right == null)
            return 1;
        return countLeafNodes(root.left) + countLeafNodes(root.right);
    }
    static void printInOrder(Node root) {
        if (root != null) {
            printInOrder(root.left);
            System.out.print(root.data + " ");
            printInOrder(root.right);
        }
    }
    static void mirrorTree(Node root) {
        if (root == null)
            return;

        Node temp = root.left;
        root.left = root.right;
        root.right = temp;

        mirrorTree(root.left);
        mirrorTree(root.right);
    }
    static void printPaths(Node root) {
        List<String> path = new ArrayList<>();
        printPathsRecursive(root, path);
    }
    static void printPathsRecursive(Node node, List<String> path) {
        if (node == null)
            return;

        path.add(node.data);

        if (node.left == null && node.right == null) {
            System.out.println(String.join(" -> ", path));
        } else {
            printPathsRecursive(node.left, path);
            printPathsRecursive(node.right, path);
        }

        path.remove(path.size() - 1);
    }





    public static void main(String[] args) {
        Node dad = new Node("Dad");
        dad.left = new Node("Mam");
        dad.right = new Node("You");

        System.out.println("     " + dad.data);
        System.out.println("    /     \\");
        System.out.println(" " + dad.left.data + "     " + dad.right.data);
        System.out.println("RootNodeIs: "+dad.data);
        int totalNodes = countNodes(dad);
        System.out.println("Total number of nodes in the tree: " + totalNodes);
        int leafCount = countLeafNodes(dad);
        System.out.println("Number of nodes without children (leaf nodes): " + leafCount);
        System.out.print("Nodes from left to right (In-Order): ");
        printInOrder(dad);
        System.out.println();

        System.out.print("Original tree (In-Order): ");
        printInOrder(dad);
        
        System.out.println();

        mirrorTree(dad);

        System.out.print("Mirrored tree (In-Order): ");
        printInOrder(dad);
        System.out.println();
        System.out.println("All paths from root to leaves:");
        printPaths(dad);
    }
}
