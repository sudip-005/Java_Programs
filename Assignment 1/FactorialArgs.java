package JAVA;

public class FactorialArgs {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        int fact = 1;

        for (int i = num; i > 0; i--) {
            fact = fact * i;
        }

        System.out.println("Factorial = " + fact);
    }
}
