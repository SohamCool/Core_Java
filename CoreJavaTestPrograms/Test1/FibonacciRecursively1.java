package Test1;

import java.util.Scanner;

public class FibonacciRecursively1 {
    static void getSeries(int a, int b, int n) {
        if (n == 2 || n == 0)
            return;
        int c = a + b;
        System.out.print(c + " ");
        n--;
        getSeries(b, c, n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the fibonacci series range: ");
        int n = sc.nextInt();
        if(n == 0)
            return;
        System.out.print(0 + " ");
        if(n == 1)
            return;
        System.out.print(1 + " ");
        getSeries(0, 1, n);
    }
}