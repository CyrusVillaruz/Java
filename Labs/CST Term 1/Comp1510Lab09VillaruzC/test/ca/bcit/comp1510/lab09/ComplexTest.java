package ca.bcit.comp1510.lab09;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ComplexTest {
    /*
     * Q1.5: Euler's number is used in the ComplexTester.java class,
     * located at the last line of the testFunctions method.
     * 
     * Q1.6: Euler's formula, e^πi + 1 = 0, whereas the calculation
     * done by ComplexTester, exp(πi) + 1 = 1.2246467991473532E-16i, which is
     * a number so small that it can be said to basically equal 0; the calculation
     * done by ComplexTester is more closer to an approximation of 0, whereas the
     * calculation done by Euler's Formula equals 0.
     */
    
    private Complex complex1;
    private Complex complex2;
    private Complex complex3;
    
    @BeforeEach
    public void setUp() {
        complex1 = new Complex(3, 4);
        complex2 = new Complex(1, 1);
        complex3 = new Complex(0, 0);
    }

    @Test
    public void testAdd1() {
        assertEquals(new Complex(4, 5), complex1.add(complex2));
    }
    
    @Test
    public void testAdd2() {
        assertEquals(new Complex(4, 4), complex1.add(1));
    }
    
    @Test
    public void testSubtract1() {
        assertEquals(new Complex(2, 3), complex1.subtract(complex2));
    }
    
    @Test
    public void testSubtract2() {
        assertEquals(new Complex(2, 4), complex1.subtract(1));
    }
    
    @Test
    public void testMultiply1() {
        assertEquals(new Complex(-1, 7), complex1.multiply(complex2));
    }
    
    @Test
    public void testMultiply2() {
        assertEquals(new Complex(6, 8), complex1.multiply(2));
    }
    
    @Test
    public void testDivide1() {
        assertEquals(complex1.multiply(complex2.reciprocal()), complex1.divide(complex2));
        assertEquals(complex1.multiply(new Complex(3, 0).reciprocal()), complex1.divide(new Complex(3, 0)));
        assertEquals(complex1.multiply(new Complex(0, 3).reciprocal()), complex1.divide(new Complex(0, 3)));
        assertThrows(IllegalArgumentException.class,
                () -> {complex1.divide(complex3);},
                "Tried to divide by zero");
    }
    
    @Test
    public void testDivide2() {
        assertEquals(new Complex(1.5, 4), complex1.divide(2.0));
        assertThrows(IllegalArgumentException.class,
                () -> {complex3.divide(0.0);},
                "Tried to divide by zero");
    }
    
    @Test
    public void testConjugate() {
        assertEquals(new Complex(3, -4), complex1.conjugate());
    }
    
    @Test
    public void testArg() {
        assertEquals(Math.atan2(4, 3), complex1.arg());
    }
    
    @Test
    public void testAbs() {
        assertEquals(5, complex1.abs());
    }
    
    @Test
    public void testPolarComplex() {
        assertEquals(new Complex(3 * Math.cos(4), 3 * Math.sin(4)), Complex.polarComplex(3, 4));
    }
    
    @Test
    public void testReciprocal() {
        assertEquals(new Complex(3.0 / 25, -4.0 / 25), complex1.reciprocal());
        assertThrows(IllegalArgumentException.class,
                () -> {complex3.reciprocal();},
                "tried to take reciprocal of 0");
    }
    
    @Test
    public void testSqrt() {
        assertEquals(Complex.polarComplex(Math.sqrt(complex1.abs()),
                complex1.arg() / 2), complex1.sqrt());
    }
    
    @Test
    public void testExp() {
        assertEquals(new Complex(Math.exp(3) * Math.cos(4), Math.exp(3) * Math.sin(4)), complex1.exp());
    }
    
    @Test
    public void testLog() {
        assertEquals(new Complex(Math.log(complex1.abs()), complex1.arg()), complex1.log());
    }
    
    @Test
    public void testEquals() {
        assertFalse(complex1.equals(10));
        assertEquals(false, new Complex(2, 1).equals(new Complex(1, 1)));
        assertEquals(false, new Complex(1, 2).equals(new Complex(1, 1)));
    }
    
    @Test
    public void testHashCode() {
        assertEquals(Double.hashCode(3) ^ Double.hashCode(4), complex1.hashCode());
    }
    
    @Test
    public void testToString() {
        assertEquals(Double.toString(3), new Complex(3, 0).toString());
        assertEquals(Double.toString(3) + "i", new Complex(0, 3).toString());
        assertEquals(Double.toString(1) + " + " + Double.toString(3) + "i", new Complex(1, 3).toString());
        assertEquals(Double.toString(1) + " - " + Double.toString(3) + "i", new Complex(1, -3).toString());
    }
}
