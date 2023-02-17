package org.bcit.comp2522.labs.lab05;

/**
 * Represents a node in a binary tree.
 *
 * @author cyrus
 */
public class Node {
  Node left;
  Node right;
  int value;

  /**
   * Constructs a Node.
   *
   * @param value of node.
   */
  public Node(int value) {
    this.value = value;
  }
}
