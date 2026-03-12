package JAVA;

class Factorial {
    int factorial(int num) {
        int fact = 1;
        for (int i = num; i > 0; i--) {
            fact = fact * i;
        }
        return fact;
    }
}

public class FactorialClass {
    public static void main(String[] args) {
        int num = 5;
        Factorial f = new Factorial();
        System.out.println("Factorial = " + f.factorial(num));
    }
}
