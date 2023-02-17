package org.bcit.comp2522.labs.lab05;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

/**
 * Iterates through the Binary Search Tree in the
 * TreeCollection.
 *
 * @author cyrus
 */
public class TCIterator implements Iterator {
  Node root;
  ArrayList<Node> order;
  int index = 0;

  /**
   * Constructs a TCIterator.
   *
   * @param root node
   */
  public TCIterator(Node root) {
    this.root = root;
  }

  /**
   * Returns order of nodes traversed in binary tree
   * using DFS algorithm.
   *
   * @return traversal order of nodes in binary tree
   */
  public ArrayList<Node> DFSOrder() {
    order = new ArrayList<Node>();

    if (root == null) return order;

    Stack<Node> stack = new Stack<Node>();
    stack.push(root);
    while (!stack.isEmpty()) {
      Node curr = stack.pop();
      order.add(curr);
      if (curr.right != null) stack.push(curr.right);
      if (curr.left != null) stack.push(curr.left);
    }
    return order;
  }

  @Override
  public boolean hasNext() {
    order = DFSOrder();
    return index < order.size();
  }

  @Override
  public Object next() {
    order = DFSOrder();
    return order.get(index++).value;
  }
}
