package Test1;

import java.util.Scanner;

public class NumOccured {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long input = sc.nextLong();
        long num = input;
        int d = sc.nextInt();
        long n = 0;
        int count = 0;
        while (num > 0) {

            n = num % 10;
            num /= 10;
            if (n == d)
                count++;
        }
        System.out.println("The digit " + d + " occurs " + count + " times in " + input);
    }
}