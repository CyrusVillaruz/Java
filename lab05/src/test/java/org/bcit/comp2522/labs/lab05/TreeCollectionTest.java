package org.bcit.comp2522.labs.lab05;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.ArrayList;
import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class TreeCollectionTest {
  TreeCollection tc;

  @BeforeAll
  void setup() {
    tc = new TreeCollection();
    tc.insert(5);
    tc.insert(4);
    tc.insert(6);
    tc.insert(2);
    tc.insert(3);
    tc.insert(1);
  }

  @Test
  void testEmptyTree() {
    TCIterator iterator = new TCIterator(null);
    assertFalse(iterator.hasNext());
  }
  @Test
  void structureTest() {
    assertEquals(5, tc.root.value);
    assertEquals(4, tc.root.left.value);
    assertEquals(6, tc.root.right.value);
    assertEquals(2, tc.root.left.left.value);
    assertEquals(1, tc.root.left.left.left.value);
    assertEquals(3, tc.root.left.left.right.value);
  }

  @Test
  void orderTest() {
    TCIterator i = (TCIterator) tc.iterator();
    int[] expected = {5, 4, 2, 1, 3, 6};
    ArrayList<Node> order = i.DFSOrder();
    int[] actual = order.stream().mapToInt(n -> n.value).toArray();
    assertArrayEquals(expected, actual);
  }

  @Test
  void testRoot() {
    Iterator i = tc.iterator();
    assertTrue(i.hasNext());
    assertEquals(5, (int) i.next());
  }

  @Test
  void testFirstLeftNode() {
    Iterator i = tc.iterator();
    i.next();
    assertTrue(i.hasNext());
    assertEquals(4, (int) i.next());
  }

  @Test
  void testSecondLeftNode() {
    Iterator i = tc.iterator();
    i.next();
    i.next();
    assertTrue(i.hasNext());
    assertEquals(2, (int) i.next());
  }

  @Test
  void testSecondNodeLeftLeaf() {
    Iterator i = tc.iterator();
    i.next();
    i.next();
    i.next();
    assertTrue(i.hasNext());
    assertEquals(1, (int) i.next());
  }

  @Test
  void testSecondNodeRightLeaf() {
    Iterator i = tc.iterator();
    i.next();
    i.next();
    i.next();
    i.next();
    assertTrue(i.hasNext());
    assertEquals(3, (int) i.next());
  }
  @Test
  void testFirstRightNode() {
    Iterator i = tc.iterator();
    i.next();
    i.next();
    i.next();
    i.next();
    i.next();
    assertTrue(i.hasNext());
    assertEquals(6, (int) i.next());
  }

  @Test
  void testRightNodeLeafInsert() {
    TreeCollection tc7 = new TreeCollection();
    tc7.insert(5);
    tc7.insert(4);
    tc7.insert(6);
    tc7.insert(2);
    tc7.insert(3);
    tc7.insert(1);
    tc7.insert(7);
    Iterator i = tc7.iterator();
    i.next();
    i.next();
    i.next();
    i.next();
    i.next();
    i.next();
    assertTrue(i.hasNext());
    assertEquals(7, tc7.root.right.right.value);
  }

  @Test
  void testLeftNodeLeafInsert() {
    TreeCollection tc7 = new TreeCollection();
    tc7.insert(5);
    tc7.insert(4);
    tc7.insert(6);
    tc7.insert(2);
    tc7.insert(3);
    tc7.insert(1);
    tc7.insert(-1);

    Iterator i = tc7.iterator();
    i.next();
    i.next();
    i.next();
    i.next();
    i.next();
    i.next();
    assertTrue(i.hasNext());
    assertEquals(-1, tc7.root.left.left.left.left.value);
  }
  @Test
  void testHasNextAtEndOfTree() {
    Iterator i = tc.iterator();
    while (i.hasNext()) {
      i.next();
    }
    assertFalse(i.hasNext());
  }

  @Test
  void testHasNextAtStartOfTree() {
    Iterator i = tc.iterator();
    assertTrue(i.hasNext());
  }
}