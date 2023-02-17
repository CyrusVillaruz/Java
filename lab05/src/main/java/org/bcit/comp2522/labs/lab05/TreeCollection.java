package org.bcit.comp2522.labs.lab05;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

/**
 * Represents a binary tree of nodes.
 *
 * @author cyrus
 */
public class TreeCollection implements Iterable {
  Node root;

  /**
   * Inserts a value to a node. If the tree is empty,
   * then a temporary node will contain the value and
   * represent the root node of the tree.
   *
   * @param i value of node
   */
  public void insert(int i) {
    Node temp = new Node(i);

    if (root == null) {
      root = temp;
      return;
    }

    Node current = root;
    while (current != null) {
      if (current.left == null && temp.value <= current.value) {
        current.left = temp;
        return;
      } else if (current.right == null && temp.value > current.value) {
        current.right = temp;
        return;
      } else if (temp.value <= current.value) {
        current = current.left;
      } else if (temp.value > current.value) {
        current = current.right;
      }
    }
  }

  /**
   * Returns an iterator over elements of type {@code T}.
   *
   * @return an Iterator.
   */
  @Override
  public Iterator iterator() {
    return new TCIterator(root);
  }

  /**
   * Drives the program.
   *
   * @param args unused.
   */
  public static void main(String[] args) {
    TreeCollection tc = new TreeCollection();
    tc.insert(5);
    tc.insert(4);
    tc.insert(6);
    tc.insert(2);
    tc.insert(3);
    tc.insert(1);
  }
}
