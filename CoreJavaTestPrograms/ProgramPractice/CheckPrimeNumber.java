package ProgramPractice;

import java.util.Scanner;

public class CheckPrimeNumber {
    static boolean isPrime(int n){
        if(n == 0 || n == 1)
            return false;
        for(int i = 2; i < n/2; i++){
            if(n%i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean result = isPrime(n);
        if(result)
            System.out.println("Prime Number");
        else
            System.out.println("Not a prime number");
    }
}
