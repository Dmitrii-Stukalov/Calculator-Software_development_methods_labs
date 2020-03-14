package main;

/**
 * The type Main.
 */
public class Main {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
//        System.out.println(Calculator.addIntegers(1, 2));
//        System.out.println(Calculator.subIntegers(1, 2));
//        System.out.println(Calculator.multIntegers(1, 2));
//        System.out.println(Calculator.divIntegers(1, 2));
//
//        Fraction a = new Fraction(1, 2);
//        Fraction b = new Fraction(1, 3);
//        Fraction[] f = {a, b};
//
//        Calculator.addFractions(a, b).Show();
//        Calculator.subFractions(a, b).Show();
//        Calculator.multFractions(a, b).Show();
//        Calculator.divFractions(a, b).Show();

        Fraction a = new Fraction(8779369, 490000);
        Fraction b = new Fraction(7921206, 122500);
        Fraction c = new Fraction(11776806, 122500);
        Calculator.addFractions(a, b).Show();

    }
}
//diff -u Calculator.java Fraction.java | sed -n '1,2d;/^[-+]/p'