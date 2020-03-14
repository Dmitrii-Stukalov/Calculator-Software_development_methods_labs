package test;

import main.Calculator;
import main.Fraction;
import org.junit.Assert;
import org.junit.Test;

/**
 * The type Calculator test.
 */
public class CalculatorTest {
    /**
     * Test add fractions.
     */
    @Test
    public void test_addFractions() {
        Fraction a = new Fraction(1, 2);
        Fraction b = new Fraction(1, 3);

        Assert.assertTrue(Calculator.addFractions(a, null).getNumerator() == 0 &&
                Calculator.addFractions(a, null).getDenominator() == 0);
        Assert.assertTrue(Calculator.addFractions(null, b).getNumerator() == 0 &&
                Calculator.addFractions(null, b).getDenominator() == 0);
        Assert.assertTrue(Calculator.addFractions(null, null).getNumerator() == 0 &&
                Calculator.addFractions(null, null).getDenominator() == 0);
        Assert.assertTrue(Calculator.addFractions(a, b).getNumerator() == 5 &&
                Calculator.addFractions(a, b).getDenominator() == 6);
    }

    /**
     * Test sub fractions.
     */
    @Test
    public void test_subFractions() {
        Fraction a = new Fraction(1, 2);
        Fraction b = new Fraction(1, 3);

        Assert.assertTrue(Calculator.subFractions(a, null).getNumerator() == 0 &&
                Calculator.subFractions(a, null).getDenominator() == 0);
        Assert.assertTrue(Calculator.subFractions(null, b).getNumerator() == 0 &&
                Calculator.subFractions(null, b).getDenominator() == 0);
        Assert.assertTrue(Calculator.subFractions(null, null).getNumerator() == 0 &&
                Calculator.subFractions(null, null).getDenominator() == 0);
        Assert.assertTrue(Calculator.subFractions(a, b).getNumerator() == 1 &&
                Calculator.subFractions(a, b).getDenominator() == 6);
    }

    /**
     * Test mult fractions.
     */
    @Test
    public void test_multFractions() {
        Fraction a = new Fraction(1, 2);
        Fraction b = new Fraction(1, 3);

        Assert.assertTrue(Calculator.multFractions(a, null).getNumerator() == 0 &&
                Calculator.multFractions(a, null).getDenominator() == 0);
        Assert.assertTrue(Calculator.multFractions(null, b).getNumerator() == 0 &&
                Calculator.multFractions(null, b).getDenominator() == 0);
        Assert.assertTrue(Calculator.multFractions(null, null).getNumerator() == 0 &&
                Calculator.multFractions(null, null).getDenominator() == 0);
        Assert.assertTrue(Calculator.multFractions(a, b).getNumerator() == 1 &&
                Calculator.multFractions(a, b).getDenominator() == 6);
    }

    /**
     * Test div fractions.
     */
    @Test
    public void test_divFractions() {
        Fraction a = new Fraction(1, 2);
        Fraction b = new Fraction(1, 3);

        Assert.assertTrue(Calculator.divFractions(a, null).getNumerator() == 0 &&
                Calculator.divFractions(a, null).getDenominator() == 0);
        Assert.assertTrue(Calculator.divFractions(null, b).getNumerator() == 0 &&
                Calculator.divFractions(null, b).getDenominator() == 0);
        Assert.assertTrue(Calculator.divFractions(null, null).getNumerator() == 0 &&
                Calculator.divFractions(null, null).getDenominator() == 0);
        Assert.assertTrue(Calculator.divFractions(a, b).getNumerator() == 3 &&
                Calculator.divFractions(a, b).getDenominator() == 2);
    }

    /**
     * Test add doubles.
     */
    @Test
    public void test_addDoubles() {
        Assert.assertEquals(1.1, Calculator.addDoubles(1.0, 0.1), 1e-6);
        Assert.assertEquals(2.1, Calculator.addDoubles(Calculator.addDoubles(1.0, 0.1), 1.0), 1e-6);
    }

    /**
     * Test sub doubles.
     */
    @Test
    public void test_subDoubles() {
        Assert.assertEquals(0.9, Calculator.subDoubles(1.0, 0.1), 1e-6);
        Assert.assertEquals(0.8, Calculator.subDoubles(Calculator.subDoubles(1.0, 0.1), 0.1), 1e-6);
    }

    /**
     * Test mult doubles.
     */
    @Test
    public void test_multDoubles() {
        Assert.assertEquals(0.1, Calculator.multDoubles(1.0, 0.1), 1e-6);
        Assert.assertEquals(0.1, Calculator.multDoubles(Calculator.multDoubles(1.0, 0.1), 1.0), 1e-6);
    }

    /**
     * Test div doubles.
     */
    @Test
    public void test_divDoubles() {
        Assert.assertEquals(10.0, Calculator.divDoubles(1.0, 0.1), 1e-6);
        Assert.assertEquals(10.0, Calculator.divDoubles(Calculator.divDoubles(1.0, 0.1), 1.0), 1e-6);
    }

    /**
     * Test factorial.
     */
    @Test
    public void test_factorial() {
        Assert.assertEquals(1L, Calculator.factorial(1));
        Assert.assertEquals(2L, Calculator.factorial(2));
        Assert.assertEquals(6L, Calculator.factorial(3));
        Assert.assertEquals(24L, Calculator.factorial(4));
        Assert.assertEquals(120L, Calculator.factorial(5));
        Assert.assertEquals(2432902008176640000L, Calculator.factorial(20));
    }

    /**
     * Test root.
     */
    @Test
    public void test_root() {
        Assert.assertEquals(0.5, Calculator.root(2, 0.25), 1e-6);
        Assert.assertEquals(0.5, Calculator.root(3, 0.125), 1e-6);
        Assert.assertEquals(0.6910423, Calculator.root(3, 0.33), 1e-6);
        Assert.assertEquals(1.0, Calculator.root(100, 1.0), 1e-6);

    }
}
