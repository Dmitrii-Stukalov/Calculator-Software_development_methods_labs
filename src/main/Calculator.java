package main;

/**
 * The type Calculator.
 */
public class Calculator {
    /**
     * Add integers int.
     *
     * @param a the a
     * @param b the b
     * @return the int
     */
    public static int addIntegers(int a, int b) {
        return a + b;
    }

    /**
     * Sub integers int.
     *
     * @param a the a
     * @param b the b
     * @return the int
     */
    public static int subIntegers(int a, int b) {
        return a - b;
    }

    /**
     * Mult integers int.
     *
     * @param a the a
     * @param b the b
     * @return the int
     */
    public static int multIntegers(int a, int b) {
        return a * b;
    }

    /**
     * Div integers double.
     *
     * @param a the a
     * @param b the b
     * @return the double
     */
    public static double divIntegers(int a, int b) {
        return (double) a / b;
    }

    /**
     * Add fractions fraction.
     *
     * @param a the a
     * @param b the b
     * @return the fraction
     */
    public static Fraction addFractions(Fraction a, Fraction b) {
        if (a == null || b == null) {
            return new Fraction(0, 0);
        }
        int n = a.getDenominator() * b.getNumerator() + a.getNumerator() * b.getDenominator();
        int d = a.getDenominator() * b.getDenominator();
        return new Fraction(n, d);
    }

    /**
     * Sub fractions fraction.
     *
     * @param a the a
     * @param b the b
     * @return the fraction
     */
    public static Fraction subFractions(Fraction a, Fraction b) {
        if (a == null || b == null) {
            return new Fraction(0, 0);
        }
        Fraction c = new Fraction(-b.getNumerator(), b.getDenominator());
        return Calculator.addFractions(a, c);
    }

    /**
     * Mult fractions fraction.
     *
     * @param a the a
     * @param b the b
     * @return the fraction
     */
    public static Fraction multFractions(Fraction a, Fraction b) {
        if (a == null || b == null) {
            return new Fraction(0, 0);
        }
        int n = a.getNumerator() * b.getNumerator();
        int d = a.getDenominator() * b.getDenominator();
        return new Fraction(n, d);
    }

    /**
     * Div fractions fraction.
     *
     * @param a the a
     * @param b the b
     * @return the fraction
     */
    public static Fraction divFractions(Fraction a, Fraction b) {
        if (a == null || b == null) {
            return new Fraction(0, 0);
        }
        int n = a.getNumerator() * b.getDenominator();
        int d = a.getDenominator() * b.getNumerator();
        return new Fraction(n, d);
    }

    public static double addDoubles(double a, double b) {
        return a + b;
    }

    public static double subDoubles(double a, double b) {
        return a - b;
    }

    public static double multDoubles(double a, double b) {
        return a * b;
    }

    public static double divDoubles(double a, double b) {
        return a / b;
    }


}

