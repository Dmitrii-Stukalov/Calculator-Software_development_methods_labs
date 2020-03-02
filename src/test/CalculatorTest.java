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
}
