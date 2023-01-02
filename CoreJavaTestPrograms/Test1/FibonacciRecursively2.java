package Test1;

import java.util.Scanner;

public class FibonacciRecursively2 {
    static int getSeries(int n) {
        if (n <= 1)
            return n;
        return getSeries(n - 1) + getSeries(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++)
            System.out.print(getSeries(i) + " ");
    }
}
