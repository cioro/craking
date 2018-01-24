package datastructures;

import org.junit.Test;

import static org.junit.Assert.*;
import static datastructures.BinaryTreeChecker.Node;

public class BinaryTreeCheckerTest {
    @Test
    public void returnTrueForABasicTree() throws Exception {
        Node root = new Node(4);
        root.insert(2).insert(6).insert(1).insert(3).insert(5).insert(7);
        root.printInOrder();
        assertTrue(BinaryTreeChecker.checkBST(root));
    }

    @Test
    public void returnFalseForTreeWithDups() throws Exception {
        Node root = new Node(5);
        root.insert(3).insert(2).insert(5).insert(7).insert(8);
        root.printInOrder();
        assertFalse(BinaryTreeChecker.checkBST(root));
    }

    @Test
    public void returnFalseForTreeWithDups_2() throws Exception {
        Node root = new Node(5);
        root.insert(3).insert(2).insert(5).insert(7).insert(8);
        root.printInOrder();
        assertFalse(BinaryTreeChecker.checkBST_2(root));
    }

    @Test
    public void returnTrueForTree() throws Exception {
        Node root = new Node(2);
        root.insert(1).insert(3);
        root.printInOrder();
        assertTrue(BinaryTreeChecker.checkBST(root));
    }

    @Test
    public void returnTrueForABasicTree_2() throws Exception {
        Node root = new Node(4);
        root.insert(2).insert(6).insert(1).insert(3).insert(5).insert(7);
        root.printInOrder();
        assertTrue(BinaryTreeChecker.checkBST_2(root));
    }

    @Test
    public void returnTrueForTree_2() throws Exception {
        Node root = new Node(2);
        root.insert(1).insert(3);
        root.printInOrder();
        assertTrue(BinaryTreeChecker.checkBST_2(root));
    }

}

// Rewrite tests such that trees are  balanced trees
