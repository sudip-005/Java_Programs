class Fraction {

    int numerator, denominator;

    Fraction() {
        numerator = 1;
        denominator = 1;
    }

    Fraction(int n) {
        numerator = n;
        denominator = 1;
    }

    Fraction(int n, int d) {
        numerator = n;
        denominator = d;
    }

    void display() {
        System.out.println(numerator + "/" + denominator);
    }

    public static void main(String[] args) {

        Fraction f1 = new Fraction();
        Fraction f2 = new Fraction(3);
        Fraction f3 = new Fraction(3,4);

        f1.display();
        f2.display();
        f3.display();
    }
}
