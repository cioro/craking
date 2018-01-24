package datastructures;

import java.util.HashSet;
import java.util.LinkedList;

public class BinaryTreeChecker {

    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
        }

        public Node(int data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }

        public Node insert(int value) {
            if (value <= data) {
                if (left == null) {
                    left = new Node(value); // push down recursion stack.
                } else {
                    left.insert(value);
                }
            } else {
                if (right == null) {
                    right = new Node(value); // push down recursion stack
                } else {
                    right.insert(value);
                }
            }
            return this;
        }

        public boolean contains(int value) {
            if (value == data) {
                return true;
            } else if (value < data) {
                if (left != null) {
                    left.contains(value);
                }
            } else {
                if (right != null) {
                    right.contains(value);
                }
            }
            return false;
        }

        public void printInOrder() {
            if (left != null) {
                left.printInOrder();
            }
            System.out.println(data);
            if (right != null) {
                right.printInOrder();
            }
        }
    }

    private static class Pair {

        public Pair(int min, int max) {
            this.min = min;
            this.max = max;
        }

        int min;
        int max;
    }

    // Duplicates are excluded in this solution
    public static boolean checkBST(Node root) {
        return checkBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private static boolean checkBST(Node root, int lowerBound, int upperBound)
    {
      if (root == null) return true;
      if (root.data <= lowerBound || root.data >= upperBound) return false;

      return checkBST(root.left, lowerBound, root.data) && checkBST(root.right, root.data, upperBound);
    };

//    // Duplicates are not excluded in this solution
//    public static boolean checkBST_2(Node root)
//    {
//        return checkBST_2(root, new Pair(root.data, root.data));
//    }
//
//    private static boolean checkBST_2(Node root, Pair pair)
//    {
//        if (root == null) return true;
//
//        if (pair.min > root.data) { pair.min = root.data; }
//        if (pair.max < root.data) { pair.max = root.data; }
//
//        boolean resultLeft = checkBST_2(root.left, pair);
//        if (!resultLeft || pair.max < root.data) return false;
//
//        boolean resultRight = checkBST_2(root.right, pair);
//        if (!resultRight || pair.min > root.data) return false;
//
//        return true;
//    }

}
