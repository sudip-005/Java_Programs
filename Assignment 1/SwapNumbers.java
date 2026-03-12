package JAVA;

import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("enter a: ");
        int a = sc.nextInt();

        System.out.print("enter b: ");
        int b = sc.nextInt();

        int temp = a;
        a = b;
        b = temp;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
