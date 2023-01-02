package ProgramPractice;

import java.util.Scanner;

public class FactorialRecursive {
    public static long factorial(long n){
        if(n == 1)
            return 1;
        return (n * factorial(n - 1));
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
        System.out.print(factorial(n) + " ");
    }
}
