package ca.bcit.comp1510.lab07;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class TestThisTest {
    private TestThis test;
    
    private ArrayList<Integer> largestIntInList;
    
    @BeforeEach
    public void setUp() throws Exception {
        test = new TestThis();
        largestIntInList = new ArrayList<Integer>();

    }
    @Test
    public void testLargestInt1() {
        int largest = test.largest(1, 2, 3);
        assertEquals(3, largest);
    }
    
    @Test
    public void testLargestInt2() {
        int largest = test.largest(-1, -2, -3);
        assertEquals(-1, largest);
    }
    
    @Test
    public void testLargestInt3() {
        int largest = test.largest(-1, 0, 1);
        assertEquals(1, largest);
    }
    
    @Test
    public void testLargestIntInList1() {
        largestIntInList.add(1);
        largestIntInList.add(2);
        largestIntInList.add(3);
        
        int largestInList = test.largest(largestIntInList);
        assertEquals(3, largestInList);
    }
    
    @Test
    public void testLargestIntInList2() {
        largestIntInList.add(-1);
        largestIntInList.add(-2);
        largestIntInList.add(-3);
        
        int largestInList = test.largest(largestIntInList);
        assertEquals(-1, largestInList);
    }
    
    @Test
    public void testLargestIntInList3() {
        largestIntInList.add(-1);
        largestIntInList.add(0);
        largestIntInList.add(1);
        
        int largestInList = test.largest(largestIntInList);
        assertEquals(1, largestInList);
    }
}
