package maths.pure.algebra.linear.series;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a;
        a=scanner.nextInt();


        long startTime;

        startTime = System.nanoTime();
        System.out.println(Fibonacci.fastFibonacciDoubling(a));
        System.out.printf("Fast doubling: %d ms%n", (System.nanoTime() - startTime) / 1000000);

        startTime = System.nanoTime();
        System.out.println(Fibonacci.fastFibonacciMatrix(a));
        System.out.printf("Fast matrix: %d ms%n", (System.nanoTime() - startTime) / 1000000);

        startTime = System.nanoTime();
        System.out.println(Fibonacci.slowFibonacci(a));
        System.out.printf("Slow DP: %d ms%n", (System.nanoTime() - startTime) / 1000000);
    }
}
