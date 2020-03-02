package main;

/**
 * The type Fraction.
 */
public class Fraction {
    private int numerator, denominator;

    /**
     * Instantiates a new Fraction.
     *
     * @param n the n
     * @param d the d
     */
    public Fraction(int n, int d) {
        numerator = n;
        denominator = d;
    }

    /**
     * Gets numerator.
     *
     * @return the numerator
     */
    public int getNumerator() {
        return numerator;
    }

    /**
     * Gets denominator.
     *
     * @return the denominator
     */
    public int getDenominator() {
        return denominator;
    }

    /**
     * Show.
     */
    public void Show() {
        System.out.println(numerator + "/" + denominator);
    }

}
