//Fibonacci with recursion.
//0 1 2 3 5 8 13 21 34 55...
// int n = number you want to return (if you want to generate the 6th number it'll be 8)
// f(n) = f(n - 1 ) + f(n - 2)

import java.util.Scanner;

public class Main {

    private static long[]fibonacciCache;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scan.nextInt();
        fibonacciCache = new long[n + 1];

        System.out.println(fibonacci(n));
    }
    private static long fibonacci(int n){
        if (n <= 1){
            return n;
        }
        if (fibonacciCache[n] != 0){
            return fibonacciCache[n];
        }
        long nthFibonacciNumber = (fibonacci(n-1) + fibonacci(n-2));
        fibonacciCache[n] = nthFibonacciNumber;
        return nthFibonacciNumber;
    }
}